package com.reedelk.openapi.v3.deserializer;

import com.reedelk.openapi.commons.AbstractDeserializer;
import com.reedelk.openapi.v3.DeserializerContext;
import com.reedelk.openapi.v3.model.*;

import java.util.Map;

import static com.reedelk.openapi.v3.model.ComponentsObject.Properties;

public class ComponentsObjectDeserializer extends AbstractDeserializer<ComponentsObject> {

    @Override
    public ComponentsObject deserialize(DeserializerContext context, Map<String, Object> serialized) {
        ComponentsObject componentsObject = new ComponentsObject();

        // Request Bodies
        mapKeyApiModel(Properties.REQUEST_BODIES.value(), serialized,
                (key, source) -> context.deserialize(RequestBodyObject.class, source))
                .ifPresent(componentsObject::setRequestBodies);

        // Schemas
        mapKeyApiModel(Properties.SCHEMAS.value(), serialized, (key, source) -> {
            Schema schemaObject = context.deserialize(Schema.class, source);
            SchemaObject schemaObjectObject = new SchemaObject();
            schemaObjectObject.setSchemaId(key);
            schemaObjectObject.setSchema(schemaObject);
            return schemaObjectObject;
        }).ifPresent(componentsObject::setSchemas);

        // Examples
        mapKeyApiModel(Properties.EXAMPLES.value(), serialized,
                (key, source) -> context.deserialize(ExampleObject.class, source))
                .ifPresent(componentsObject::setExamples);

        // Security Schemes
        mapKeyApiModel(Properties.SECURITY_SCHEMES.value(), serialized,
                (key, source) -> context.deserialize(SecuritySchemeObject.class, source))
                .ifPresent(componentsObject::setSecuritySchemes);

        return componentsObject;
    }
}
