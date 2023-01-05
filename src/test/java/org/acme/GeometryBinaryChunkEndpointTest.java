package org.acme;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
@TestHTTPEndpoint(GeometryBinaryChunkEndpoint.class)
class GeometryBinaryChunkEndpointTest {

    @Test
    void shouldReturn204WhenUploadCanceled() {
        given().body("upload-id")
                .contentType(ContentType.TEXT)
                .post("cancelUpload")
                .then()
                .statusCode(204);
    }
}
