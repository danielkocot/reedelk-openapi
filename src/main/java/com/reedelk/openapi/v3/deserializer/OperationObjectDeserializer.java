package com.reedelk.openapi.v3.deserializer;

import com.reedelk.openapi.commons.AbstractDeserializer;
import com.reedelk.openapi.v3.DeserializerContext;
import com.reedelk.openapi.v3.model.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.reedelk.openapi.v3.model.OperationObject.Properties;

public class OperationObjectDeserializer extends AbstractDeserializer<OperationObject> {

    @SuppressWarnings("unchecked")
    @Override
    public OperationObject deserialize(DeserializerContext context, Map<String, Object> serialized) {
        OperationObject operationObject = new OperationObject();

        operationObject.setDeprecated(getBoolean(serialized, Properties.DEPRECATED.value()));
        operationObject.setSummary(getString(serialized, Properties.SUMMARY.value()));
        operationObject.setDescription(getString(serialized, Properties.DESCRIPTION.value()));
        operationObject.setOperationId(getString(serialized, Properties.OPERATION_ID.value()));

        // Request Body
        if (serialized.containsKey(Properties.REQUEST_BODY.value())) {
            Map<String, Object> requestBodyObjectMap = getMap(serialized, Properties.REQUEST_BODY.value());
            RequestBodyObject requestBodyObject = context.deserialize(RequestBodyObject.class, requestBodyObjectMap);
            operationObject.setRequestBody(requestBodyObject);
        }

        // Responses
        mapKeyApiModel(Properties.RESPONSES.value(), serialized,
                (key, source) -> context.deserialize(ResponseObject.class, source))
                .ifPresent(operationObject::setResponses);

        // Parameters
        if (serialized.containsKey(Properties.PARAMETERS.value())) {
            List<ParameterObject> parameterObjectList = new ArrayList<>();
            List<Map<String,Object>> parametersList =
                    (List<Map<String, Object>>) serialized.get(Properties.PARAMETERS.value());
            parametersList.forEach(parameterMap -> {
                ParameterObject parameterObject = context.deserialize(ParameterObject.class, parameterMap);
                parameterObjectList.add(parameterObject);
            });
            operationObject.setParameters(parameterObjectList);
        }

        // Tags
        List<String> tags = (List<String>) serialized.get(Properties.TAGS.value());
        operationObject.setTags(tags);

        // Security
        mapListApiModel(Properties.SECURITY.value(), serialized, source -> {
            Map<String, SecurityRequirementObject> mapped = new LinkedHashMap<>();
            source.forEach((securityRequirementId, object) -> {
                List<String> scopes = (List<String>) source.get(securityRequirementId);
                SecurityRequirementObject securityRequirementObject = new SecurityRequirementObject();
                securityRequirementObject.setScopes(scopes);
                mapped.put(securityRequirementId, securityRequirementObject);
            });
            return mapped;
        }).ifPresent(operationObject::setSecurity);

        return operationObject;
    }
}
