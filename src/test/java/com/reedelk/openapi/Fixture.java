package com.reedelk.openapi;

import com.reedelk.openapi.v3.model.Example;
import com.reedelk.openapi.v3.model.ParameterLocation;
import com.reedelk.openapi.v3.model.RestMethod;
import com.reedelk.openapi.v3.model.SchemaObject;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Arrays.asList;

public class Fixture {

    public enum InfoObject implements Provider {

        WithAllPropertiesJson() {
            @Override
            public String path() {
                return "info/info_object_with_all_properties.json";
            }
        },

        WithAllPropertiesYaml() {
            @Override
            public String path() {
                return "info/info_object_with_all_properties.yaml";
            }
        },

        WithDefaultPropertiesJson() {
            @Override
            public String path() {
                return "info/info_object_with_default_properties.json";
            }
        },

        WithDefaultPropertiesYaml() {
            @Override
            public String path() {
                return "info/info_object_with_default_properties.yaml";
            }
        }
    }

    public enum LicenseObject implements Provider {

        WithAllPropertiesJson() {
            @Override
            public String path() {
                return "license/license_object_with_all_properties.json";
            }
        },

        WithAllPropertiesYaml() {
            @Override
            public String path() {
                return "license/license_object_with_all_properties.yaml";
            }
        },

        WithDefaultPropertiesJson() {
            @Override
            public String path() {
                return "license/license_object_with_default_properties.json";
            }
        },

        WithDefaultPropertiesYaml() {
            @Override
            public String path() {
                return "license/license_object_with_default_properties.yaml";
            }
        }
    }

    public enum ContactObject implements Provider {

        WithAllProperties() {
            @Override
            public String path() {
                return "contact/contact_object_with_all_properties.json";
            }
        },

        WithDefaultProperties() {
            @Override
            public String path() {
                return "contact/contact_object_with_default_properties.json";
            }
        }
    }

    public enum ServerObject implements Provider {

        WithAllPropertiesJson() {
            @Override
            public String path() {
                return "server/server_object_with_all_properties.json";
            }
        },

        WithAllPropertiesYaml() {
            @Override
            public String path() {
                return "server/server_object_with_all_properties.yaml";
            }
        },

        WithDefaultPropertiesJson() {
            @Override
            public String path() {
                return "server/server_object_with_default_properties.json";
            }
        },

        WithDefaultPropertiesYaml() {
            @Override
            public String path() {
                return "server/server_object_with_default_properties.yaml";
            }
        },
    }

    public enum TagObject implements Provider {

        WithAllProperties() {
            @Override
            public String path() {
                return "tag/tag_object_with_all_properties.json";
            }
        }
    }

    public enum ServerVariableObject implements Provider {

        WithAllPropertiesJson() {
            @Override
            public String path() {
                return "servervariable/server_variable_object_with_all_properties.json";
            }
        },

        WithAllPropertiesYaml() {
            @Override
            public String path() {
                return "servervariable/server_variable_object_with_all_properties.yaml";
            }
        },

        WithDefaultPropertiesJson() {
            @Override
            public String path() {
                return "servervariable/server_variable_object_with_default_properties.json";
            }
        },

        WithDefaultPropertiesYaml() {
            @Override
            public String path() {
                return "servervariable/server_variable_object_with_default_properties.yaml";
            }
        }
    }

    public enum OpenApiObject implements Provider {

        WithDefaultInfoAndServersAndPaths() {
            @Override
            public String path() {
                return "openapi/open_api_object_with_default_info_and_servers_and_paths.json";
            }
        }
    }

    public enum PathsObject implements Provider {

        WithDefaultPaths() {
            @Override
            public String path() {
                return "paths/paths_object_with_default.json";
            }
        },

        WithOperation() {
            @Override
            public String path() {
                return "paths/paths_object_with_operation.json";
            }
        }
    }

    public enum ComponentsObject implements Provider {

        WithNoSchemas() {
            @Override
            public String path() {
                return "components/components_object_with_no_schemas.json";
            }
        },

        WithSampleSchemas() {
            @Override
            public String path() {
                return "components/components_object_with_sample_schemas.json";
            }
        }
    }

    public enum ExternalDocumentationObject implements Provider {

        WithAllProperties;

        @Override
        public String path() {
            return "externaldocumentation/external_documentation_object_with_defaults.json";
        }
    }

    public enum HeaderObject implements Provider {

        WithDefaults() {
            @Override
            public String path() {
                return "header/header_object_with_defaults.json";
            }
        },

        WithAllPropertiesAndDefaultSchema() {
            @Override
            public String path() {
                return "header/header_object_with_all_properties_and_default_schema.json";
            }
        },

        WithAllPropertiesAndReferenceSchema() {
            @Override
            public String path() {
                return "header/header_object_with_all_properties_and_reference_schema.json";
            }
        }
    }

    public enum MediaTypeObject implements Provider {

        WithSchema() {
            @Override
            public String path() {
                return "mediatype/media_type_object_with_schema.json";
            }
        },

        WithExample() {
            @Override
            public String path() {
                return "mediatype/media_type_object_with_example.json";
            }
        },

        WithSchemaAndExample() {
            @Override
            public String path() {
                return "mediatype/media_type_object_with_schema_and_example.json";
            }
        },

        WithDefault() {
            @Override
            public String path() {
                return "mediatype/media_type_with_default.json";
            }
        }
    }

    public enum OperationObject implements Provider {

        WithAllProperties() {
            @Override
            public String path() {
                return "operation/operation_object_with_all_properties.json";
            }
        },

        WithDefault() {
            @Override
            public String path() {
                return "operation/operation_object_with_default.json";
            }
        }
    }

    public enum ParameterObject implements Provider {

        WithAllProperties() {
            @Override
            public String path() {
                return "parameter/parameter_object_with_all_properties.json";
            }
        },

        WithDefault() {
            @Override
            public String path() {
                return "parameter/parameter_object_with_default.json";
            }
        },

        WithInPath() {
            @Override
            public String path() {
                return "parameter/parameter_object_with_in_path.json";
            }
        }
    }

    public enum RequestBodyObject implements Provider {

        WithAllProperties() {
            @Override
            public String path() {
                return "requestbody/request_body_object_with_all_properties.json";
            }
        },

        WithDefault() {
            @Override
            public String path() {
                return "requestbody/request_body_object_with_default.json";
            }
        }

    }

    public enum ResponseObject implements Provider {

        WithAllProperties() {
            @Override
            public String path() {
                return "responsebody/response_body_object_with_all_properties.json";
            }
        },

        WithDefault() {
            @Override
            public String path() {
                return "responsebody/response_body_object_with_default.json";
            }
        }
    }

    public enum Schema implements Provider {

        WithReference() {
            @Override
            public String path() {
                return "schema/schema_with_reference.json";
            }
        },

        WithInlineSchema() {
            @Override
            public String path() {
                return "schema/schema_with_inline_schema.json";
            }
        }
    }

    public enum Schemas implements Provider {

        Pet() {
            @Override
            public String path() {
                return "schemas/pet.schema.json";
            }
        },

        Category() {
            @Override
            public String path() {
                return "schemas/category.schema.json";
            }
        },

        Tag() {
            @Override
            public String path() {
                return "schemas/tag.schema.json";
            }
        }
    }

    public enum EndToEnd implements Provider {

        SAMPLE_JSON() {
            @Override
            public String path() {
                return "endtoend/petstore.json";
            }
        },

        SAMPLE_YAML() {
            @Override
            public String path() {
                return "endtoend/petstore.yaml";
            }
        }
    }

    public interface Provider {

        String path();

        default URL url() {
            return Fixture.class.getResource("/" + path());
        }

        default String string() {
            try (Scanner scanner = new Scanner(url().openStream(), UTF_8.toString())) {
                scanner.useDelimiter("\\A");
                return scanner.hasNext() ? scanner.next() : "";
            } catch (IOException e) {
                throw new RuntimeException("String from URI could not be read.", e);
            }
        }
    }

    public static final com.reedelk.openapi.v3.model.OpenApiObject expectedOpenApi;
    static {
        Map<String, Map<RestMethod, com.reedelk.openapi.v3.model.OperationObject>> paths = new LinkedHashMap<>();
        paths.put("/pet", createPetOperationMap());
        paths.put("/pet/{petId}", createPetByIdOperationMap());
        paths.put("/store/inventory", createStoreInventoryOperationMap());
        paths.put("/user/login", createUserLoginOperationMap());

        // Paths Object
        com.reedelk.openapi.v3.model.PathsObject expectedPaths = new com.reedelk.openapi.v3.model.PathsObject();
        expectedPaths.setPaths(paths);
        // ------------------------------------------------------

        // Components Object
        com.reedelk.openapi.v3.model.ComponentsObject componentsObject = createComponents();

        expectedOpenApi = new com.reedelk.openapi.v3.model.OpenApiObject();
        expectedOpenApi.setOpenapi("3.0.0");
        expectedOpenApi.setInfo(createInfo());
        expectedOpenApi.setServers(Collections.singletonList(createServer()));
        expectedOpenApi.setPaths(expectedPaths);
        expectedOpenApi.setComponents(componentsObject);
        expectedOpenApi.setTags(createTags());
    }

    private static List<com.reedelk.openapi.v3.model.TagObject> createTags() {
        com.reedelk.openapi.v3.model.TagObject petTag = new com.reedelk.openapi.v3.model.TagObject();
        petTag.setDescription("Everything about your Pets");
        petTag.setName("pet");
        petTag.setExternalDocs(createDocumentation("Find out more", "http://swagger.io"));

        com.reedelk.openapi.v3.model.TagObject storeTag = new com.reedelk.openapi.v3.model.TagObject();
        storeTag.setDescription("Access to Petstore orders");
        storeTag.setName("store");

        com.reedelk.openapi.v3.model.TagObject userTag = new com.reedelk.openapi.v3.model.TagObject();
        userTag.setDescription("Operations about user");
        userTag.setName("user");
        userTag.setExternalDocs(createDocumentation("Find out more about our store", "http://swagger.io"));

        return Arrays.asList(petTag, storeTag, userTag);
    }

    private static com.reedelk.openapi.v3.model.ExternalDocumentationObject createDocumentation(String description, String url) {
        com.reedelk.openapi.v3.model.ExternalDocumentationObject externalDocumentationObject = new com.reedelk.openapi.v3.model.ExternalDocumentationObject();
        externalDocumentationObject.setDescription(description);
        externalDocumentationObject.setUrl(url);
        return externalDocumentationObject;
    }

    private static Map<RestMethod, com.reedelk.openapi.v3.model.OperationObject> createUserLoginOperationMap() {
        // ---------------- GET Store Inventory Object ----------------
        com.reedelk.openapi.v3.model.ParameterObject usernameParameter = new com.reedelk.openapi.v3.model.ParameterObject();
        usernameParameter.setName("username");
        usernameParameter.setIn(ParameterLocation.query);
        usernameParameter.setDescription("The user name for login");
        usernameParameter.setRequired(true);
        usernameParameter.setSchema(new com.reedelk.openapi.v3.model.Schema(new JSONObject("{\n" +
                "              \"type\": \"string\",\n" +
                "            }").toMap()));

        com.reedelk.openapi.v3.model.ParameterObject passwordParameter = new com.reedelk.openapi.v3.model.ParameterObject();
        passwordParameter.setName("password");
        passwordParameter.setIn(ParameterLocation.query);
        passwordParameter.setDescription("The password for login in clear text");
        passwordParameter.setRequired(true);
        passwordParameter.setSchema(new com.reedelk.openapi.v3.model.Schema(new JSONObject("{\n" +
                "              \"type\": \"string\",\n" +
                "            }").toMap()));

        Map<String, com.reedelk.openapi.v3.model.MediaTypeObject> contentTypeMedia = new LinkedHashMap<>();
        contentTypeMedia.put("application/json", createMediaType(new JSONObject("{\n" +
                "                  \"type\": \"string\"\n" +
                "                }").toMap()));
        contentTypeMedia.put("application/xml", createMediaType(new JSONObject("{\n" +
                "                  \"type\": \"string\"\n" +
                "                }").toMap()));

        com.reedelk.openapi.v3.model.HeaderObject rateLimit = new com.reedelk.openapi.v3.model.HeaderObject();
        rateLimit.setDescription("calls per hour allowed by the user");
        rateLimit.setSchema(new com.reedelk.openapi.v3.model.Schema(new JSONObject("{\n" +
                "                  \"type\": \"integer\",\n" +
                "                  \"format\": \"int32\"\n" +
                "                }").toMap()));

        com.reedelk.openapi.v3.model.HeaderObject expiresAfter = new com.reedelk.openapi.v3.model.HeaderObject();
        expiresAfter.setDescription("date in UTC when token expires");
        expiresAfter.setSchema(new com.reedelk.openapi.v3.model.Schema(new JSONObject("{\n" +
                "                  \"type\": \"string\",\n" +
                "                  \"format\": \"date-time\"\n" +
                "                }").toMap()));

        Map<String, com.reedelk.openapi.v3.model.HeaderObject> headersMap = new LinkedHashMap<>();
        headersMap.put("X-Rate-Limit", rateLimit);
        headersMap.put("X-Expires-After", expiresAfter);

        com.reedelk.openapi.v3.model.ResponseObject response200 = createResponseObject("successful operation");
        response200.setContent(contentTypeMedia);
        response200.setHeaders(headersMap);

        Map<String, com.reedelk.openapi.v3.model.ResponseObject> getStatusCodeResponseMap = new LinkedHashMap<>();
        getStatusCodeResponseMap.put("200", response200);
        getStatusCodeResponseMap.put("400", createResponseObject("Invalid username/password supplied"));

        com.reedelk.openapi.v3.model.OperationObject loginOperation = new com.reedelk.openapi.v3.model.OperationObject();
        loginOperation.setTags(Collections.singletonList("user"));
        loginOperation.setSummary("Logs user into the system");
        loginOperation.setOperationId("loginUser");
        loginOperation.setResponses(getStatusCodeResponseMap);
        loginOperation.setDescription("");
        loginOperation.setParameters(asList(usernameParameter, passwordParameter));
        // ------------------------------------------------------

        Map<RestMethod, com.reedelk.openapi.v3.model.OperationObject> userLoginOperationMap = new LinkedHashMap<>();
        userLoginOperationMap.put(RestMethod.GET, loginOperation);
        return userLoginOperationMap;
    }

    private static Map<RestMethod, com.reedelk.openapi.v3.model.OperationObject> createStoreInventoryOperationMap() {
        // ---------------- GET Store Inventory Object ----------------
        Map<String, com.reedelk.openapi.v3.model.MediaTypeObject> contentTypeMedia = new LinkedHashMap<>();
        contentTypeMedia.put("application/json", createMediaType(new JSONObject("{\n" +
                "                  \"type\": \"object\",\n" +
                "                  \"additionalProperties\": {\n" +
                "                    \"type\": \"integer\",\n" +
                "                    \"format\": \"int32\"\n" +
                "                  }\n" +
                "                }").toMap()));

        com.reedelk.openapi.v3.model.ResponseObject response200 = createResponseObject("successful operation");
        response200.setContent(contentTypeMedia);

        Map<String, com.reedelk.openapi.v3.model.ResponseObject> getStatusCodeResponseMap = new LinkedHashMap<>();
        getStatusCodeResponseMap.put("200", response200);

        com.reedelk.openapi.v3.model.OperationObject getStoreInventoryOperation = new com.reedelk.openapi.v3.model.OperationObject();
        getStoreInventoryOperation.setTags(Collections.singletonList("store"));
        getStoreInventoryOperation.setSummary("Returns pet inventories by status");
        getStoreInventoryOperation.setOperationId("getInventory");
        getStoreInventoryOperation.setResponses(getStatusCodeResponseMap);
        getStoreInventoryOperation.setDescription("Returns a map of status codes to quantities");
        // ------------------------------------------------------

        Map<RestMethod, com.reedelk.openapi.v3.model.OperationObject> storeInventoryOperationMap = new LinkedHashMap<>();
        storeInventoryOperationMap.put(RestMethod.GET, getStoreInventoryOperation);
        return storeInventoryOperationMap;
    }

    private static Map<RestMethod, com.reedelk.openapi.v3.model.OperationObject> createPetByIdOperationMap() {
        // ---------------- GET Operation Object ----------------
        com.reedelk.openapi.v3.model.ParameterObject getParameters = new com.reedelk.openapi.v3.model.ParameterObject();
        getParameters.setName("petId");
        getParameters.setIn(ParameterLocation.path);
        getParameters.setDescription("ID of pet to return");
        getParameters.setRequired(true);
        getParameters.setSchema(new com.reedelk.openapi.v3.model.Schema(new JSONObject("{\n" +
                "              \"type\": \"integer\",\n" +
                "              \"format\": \"int64\"\n" +
                "            }").toMap()));
        Map<String, com.reedelk.openapi.v3.model.MediaTypeObject> contentTypeMedia = new LinkedHashMap<>();

        contentTypeMedia.put("application/xml", createMediaType("#/components/schemas/Pet", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<Pet>\n\t<id>1230</id>\n\t<Category>\n\t\t<id>0</id>\n\t\t<name>string</name>\n\t</Category>\n\t<name>doggie</name>\n\t<photoUrl>\n\t\t<photoUrl>string</photoUrl>\n\t</photoUrl>\n\t<tag>\n\t\t<Tag>\n\t\t\t<id>0</id>\n\t\t\t<name>string</name>\n\t\t</Tag>\n\t</tag>\n\t<status>available</status>\n</Pet>"));
        contentTypeMedia.put("application/json", createMediaType("#/components/schemas/Pet"));

        com.reedelk.openapi.v3.model.ResponseObject response200 = createResponseObject("successful operation");
        response200.setContent(contentTypeMedia);

        Map<String, com.reedelk.openapi.v3.model.ResponseObject> getStatusCodeResponseMap = new LinkedHashMap<>();
        getStatusCodeResponseMap.put("400", createResponseObject("Invalid ID supplied"));
        getStatusCodeResponseMap.put("404", createResponseObject("Pet not found"));
        getStatusCodeResponseMap.put("200", response200);

        com.reedelk.openapi.v3.model.OperationObject getPetOperation = new com.reedelk.openapi.v3.model.OperationObject();
        getPetOperation.setTags(Collections.singletonList("pet"));
        getPetOperation.setSummary("Find pet by ID");
        getPetOperation.setOperationId("getPetById");
        getPetOperation.setResponses(getStatusCodeResponseMap);
        getPetOperation.setDescription("Returns a single pet");
        getPetOperation.setParameters(Collections.singletonList(getParameters));
        // ------------------------------------------------------

        // ---------------- POST Operation Object ----------------
        com.reedelk.openapi.v3.model.ParameterObject postParameters = new com.reedelk.openapi.v3.model.ParameterObject();
        postParameters.setName("petId");
        postParameters.setIn(ParameterLocation.path);
        postParameters.setDescription("ID of pet that needs to be updated");
        postParameters.setRequired(true);
        postParameters.setSchema(new com.reedelk.openapi.v3.model.Schema(new JSONObject("{\n" +
                "              \"type\": \"integer\",\n" +
                "              \"format\": \"int64\"\n" +
                "            }").toMap()));

        Map<String, com.reedelk.openapi.v3.model.ResponseObject> postStatusCodeResponseMap = new LinkedHashMap<>();
        postStatusCodeResponseMap.put("405", createResponseObject("Invalid input"));

        com.reedelk.openapi.v3.model.MediaTypeObject wwwFormUrlEncoded = createMediaType(new JSONObject("{\n" +
                "                \"type\": \"object\",\n" +
                "                \"properties\": {\n" +
                "                  \"name\": {\n" +
                "                    \"description\": \"Updated name of the pet\",\n" +
                "                    \"type\": \"string\"\n" +
                "                  },\n" +
                "                  \"status\": {\n" +
                "                    \"description\": \"Updated status of the pet\",\n" +
                "                    \"type\": \"string\"\n" +
                "                  }\n" +
                "                }\n" +
                "              }").toMap());
        Map<String, com.reedelk.openapi.v3.model.MediaTypeObject> postContentTypeMediaTypeMap = new LinkedHashMap<>();
        postContentTypeMediaTypeMap.put("application/x-www-form-urlencoded", wwwFormUrlEncoded);
        com.reedelk.openapi.v3.model.RequestBodyObject postPetRequestBody = new com.reedelk.openapi.v3.model.RequestBodyObject();
        postPetRequestBody.setContent(postContentTypeMediaTypeMap);

        com.reedelk.openapi.v3.model.OperationObject postPetOperation = new com.reedelk.openapi.v3.model.OperationObject();
        postPetOperation.setTags(Collections.singletonList("pet"));
        postPetOperation.setSummary("Updates a pet in the store with form data");
        postPetOperation.setOperationId("updatePetWithForm");
        postPetOperation.setRequestBody(postPetRequestBody);
        postPetOperation.setResponses(postStatusCodeResponseMap);
        postPetOperation.setDescription("");
        postPetOperation.setParameters(Collections.singletonList(postParameters));
        // ------------------------------------------------------

        Map<RestMethod, com.reedelk.openapi.v3.model.OperationObject> petOperationMap = new LinkedHashMap<>();
        petOperationMap.put(RestMethod.GET, getPetOperation);
        petOperationMap.put(RestMethod.POST, postPetOperation);
        return petOperationMap;
    }

    private static Map<RestMethod, com.reedelk.openapi.v3.model.OperationObject> createPetOperationMap() {
        // ---------------- PUT Operation Object ----------------
        com.reedelk.openapi.v3.model.RequestBodyObject putPetRequestBody = new com.reedelk.openapi.v3.model.RequestBodyObject();
        putPetRequestBody.set$ref("#/components/requestBodies/Pet");

        Map<String, com.reedelk.openapi.v3.model.ResponseObject> putStatusCodeResponseMap = new LinkedHashMap<>();
        putStatusCodeResponseMap.put("400", createResponseObject("Invalid ID supplied"));
        putStatusCodeResponseMap.put("404", createResponseObject("Pet not found"));
        putStatusCodeResponseMap.put("405", createResponseObject("Validation exception"));

        com.reedelk.openapi.v3.model.OperationObject putPetOperation = new com.reedelk.openapi.v3.model.OperationObject();
        putPetOperation.setSummary("Update an existing pet");
        putPetOperation.setOperationId("updatePet");
        putPetOperation.setRequestBody(putPetRequestBody);
        putPetOperation.setResponses(putStatusCodeResponseMap);
        putPetOperation.setDescription("");
        putPetOperation.setTags(Collections.singletonList("pet"));
        // ------------------------------------------------------

        // ---------------- POST Operation Object ----------------
        com.reedelk.openapi.v3.model.RequestBodyObject postPetRequestBody = new com.reedelk.openapi.v3.model.RequestBodyObject();
        postPetRequestBody.set$ref("#/components/requestBodies/Pet");

        Map<String, com.reedelk.openapi.v3.model.ResponseObject> postStatusResponseMap = new LinkedHashMap<>();
        postStatusResponseMap.put("405", createResponseObject("Invalid input"));

        com.reedelk.openapi.v3.model.OperationObject postPetOperation = new com.reedelk.openapi.v3.model.OperationObject();
        postPetOperation.setSummary("Add a new pet to the store");
        postPetOperation.setOperationId("addPet");
        postPetOperation.setRequestBody(postPetRequestBody);
        postPetOperation.setResponses(postStatusResponseMap);
        postPetOperation.setDescription("");
        postPetOperation.setTags(Collections.singletonList("pet"));
        // ------------------------------------------------------

        Map<RestMethod, com.reedelk.openapi.v3.model.OperationObject> petOperationMap = new LinkedHashMap<>();
        petOperationMap.put(RestMethod.PUT, putPetOperation);
        petOperationMap.put(RestMethod.POST, postPetOperation);
        return petOperationMap;
    }

    private static com.reedelk.openapi.v3.model.ComponentsObject createComponents() {
        Map<String, com.reedelk.openapi.v3.model.MediaTypeObject> contentTypeMediaTypeMap = new LinkedHashMap<>();
        contentTypeMediaTypeMap.put("application/xml", createMediaType("#/components/schemas/Pet"));
        contentTypeMediaTypeMap.put("application/json", createMediaType("#/components/schemas/Pet"));

        com.reedelk.openapi.v3.model.RequestBodyObject petRequestBody = new com.reedelk.openapi.v3.model.RequestBodyObject();
        petRequestBody.setContent(contentTypeMediaTypeMap);
        petRequestBody.setRequired(true);
        petRequestBody.setDescription("Pet object that needs to be added to the store");

        Map<String, com.reedelk.openapi.v3.model.RequestBodyObject> idAndRequestBody = new LinkedHashMap<>();
        idAndRequestBody.put("Pet", petRequestBody);

        Map<String, SchemaObject> idAndSchema = new LinkedHashMap<>();
        idAndSchema.put("Pet", createSchema(Fixture.Schemas.Pet));
        idAndSchema.put("Tag", createSchema(Fixture.Schemas.Tag));
        idAndSchema.put("Category", createSchema(Fixture.Schemas.Category));

        com.reedelk.openapi.v3.model.ComponentsObject componentsObject = new com.reedelk.openapi.v3.model.ComponentsObject();
        componentsObject.setRequestBodies(idAndRequestBody);
        componentsObject.setSchemas(idAndSchema);
        return componentsObject;
    }

    private static com.reedelk.openapi.v3.model.MediaTypeObject createMediaType(Map<String, Object> schemaData) {
        com.reedelk.openapi.v3.model.MediaTypeObject mediaType = new com.reedelk.openapi.v3.model.MediaTypeObject();
        mediaType.setSchema(new com.reedelk.openapi.v3.model.Schema(schemaData));
        return mediaType;
    }

    private static com.reedelk.openapi.v3.model.MediaTypeObject createMediaType(String schemaId) {
        com.reedelk.openapi.v3.model.MediaTypeObject mediaType = new com.reedelk.openapi.v3.model.MediaTypeObject();
        mediaType.setSchema(new com.reedelk.openapi.v3.model.Schema(schemaId));
        return mediaType;
    }

    private static com.reedelk.openapi.v3.model.MediaTypeObject createMediaType(String schemaId, String example) {
        com.reedelk.openapi.v3.model.MediaTypeObject mediaType = new com.reedelk.openapi.v3.model.MediaTypeObject();
        mediaType.setSchema(new com.reedelk.openapi.v3.model.Schema(schemaId));
        mediaType.setExample(new Example(example));
        return mediaType;
    }

    private static SchemaObject createSchema(Fixture.Schemas schemaData) {
        com.reedelk.openapi.v3.model.Schema schema = new com.reedelk.openapi.v3.model.Schema(new JSONObject(schemaData.string()).toMap());
        SchemaObject schemaObject = new SchemaObject();
        schemaObject.setSchema(schema);
        return schemaObject;
    }

    private static com.reedelk.openapi.v3.model.ContactObject createContact() {
        com.reedelk.openapi.v3.model.ContactObject expectedContact = new com.reedelk.openapi.v3.model.ContactObject();
        expectedContact.setEmail("apiteam@swagger.io");
        return expectedContact;
    }

    private static com.reedelk.openapi.v3.model.LicenseObject createLicense() {
        com.reedelk.openapi.v3.model.LicenseObject expectedLicense = new com.reedelk.openapi.v3.model.LicenseObject();
        expectedLicense.setName("Apache 2.0");
        expectedLicense.setUrl("http://www.apache.org/licenses/LICENSE-2.0.html");
        return expectedLicense;
    }

    private static com.reedelk.openapi.v3.model.InfoObject createInfo() {
        com.reedelk.openapi.v3.model.InfoObject expectedInfo = new com.reedelk.openapi.v3.model.InfoObject();
        expectedInfo.setDescription("This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.");
        expectedInfo.setVersion("1.0.2");
        expectedInfo.setTitle("Swagger Petstore");
        expectedInfo.setTermsOfService("http://swagger.io/terms/");
        expectedInfo.setContact(createContact());
        expectedInfo.setLicense(createLicense());
        return expectedInfo;
    }

    private static com.reedelk.openapi.v3.model.ServerObject createServer() {
        com.reedelk.openapi.v3.model.ServerObject expectedServer = new com.reedelk.openapi.v3.model.ServerObject();
        expectedServer.setUrl("https://petstore.swagger.io/v2");
        return expectedServer;
    }

    private static com.reedelk.openapi.v3.model.ResponseObject createResponseObject(String description) {
        com.reedelk.openapi.v3.model.ResponseObject responseObject = new com.reedelk.openapi.v3.model.ResponseObject();
        responseObject.setDescription(description);
        return responseObject;
    }
}
