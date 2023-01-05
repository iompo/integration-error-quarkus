package org.acme;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/rest/binaries/geometry/chunk")
public class GeometryBinaryChunkEndpoint {

    @Inject
    GeometryStorage geometryStorage;

    @POST
    @Path("cancelUpload")
    @Consumes(MediaType.TEXT_PLAIN)
    public void cancelUpload(String uniqueIdentifier) {
        geometryStorage.cancelUpload(uniqueIdentifier);
    }

}
