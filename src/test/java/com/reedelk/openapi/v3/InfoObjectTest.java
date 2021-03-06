package com.reedelk.openapi.v3;

import com.reedelk.openapi.Fixture;
import com.reedelk.openapi.v3.model.ContactObject;
import com.reedelk.openapi.v3.model.InfoObject;
import com.reedelk.openapi.v3.model.LicenseObject;
import org.junit.jupiter.api.Test;

class InfoObjectTest extends AbstractOpenApiSerializableTest {

    @Test
    void shouldCorrectlySerializeInfoWithAllProperties() {
        // Given
        ContactObject contact = new ContactObject();
        contact.setName("API Support");
        contact.setUrl("http://www.example.com/support");
        contact.setEmail("support@example.com");

        LicenseObject license = new LicenseObject();
        license.setName("Apache 2.0");
        license.setUrl("http://www.apache.org/licenses/LICENSE-2.0.html");

        InfoObject info = new InfoObject();
        info.setVersion("1.0.1");
        info.setTitle("Sample Pet Store App");
        info.setTermsOfService("http://example.com/terms/");
        info.setDescription("This is a sample server for a pet store.");
        info.setContact(contact);
        info.setLicense(license);

        // Expect
        assertSerializeJSON(info, Fixture.InfoObject.WithAllPropertiesJson);
        assertSerializeYAML(info, Fixture.InfoObject.WithAllPropertiesYaml);
    }

    @Test
    void shouldCorrectlySerializeInfoWithRequiredValues() {
        // Given
        InfoObject info = new InfoObject();
        info.setTitle("My API");
        info.setVersion("1.0.0");

        // Expect
        assertSerializeJSON(info, Fixture.InfoObject.WithDefaultPropertiesJson);
        assertSerializeYAML(info, Fixture.InfoObject.WithDefaultPropertiesYaml);
    }
}
