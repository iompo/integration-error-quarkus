package org.acme;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusIntegrationTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.config.EncoderConfig.encoderConfig;

@QuarkusIntegrationTest
@TestHTTPEndpoint(GeometryBinaryChunkEndpoint.class)
class GeometryBinaryIT extends GeometryBinaryChunkEndpointTest{

}
