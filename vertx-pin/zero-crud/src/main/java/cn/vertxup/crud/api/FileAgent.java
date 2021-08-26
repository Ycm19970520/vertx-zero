package cn.vertxup.crud.api;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.FileUpload;
import io.vertx.tp.crud.cv.Addr;
import io.vertx.tp.crud.cv.IxMsg;
import io.vertx.tp.crud.refine.Ix;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Adjust;
import io.vertx.up.annotations.Codex;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.atom.query.engine.Qr;
import io.vertx.up.eon.Orders;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Objects;

/*
 * Export / Import file here for processing
 */
@EndPoint
@Path("/api")
public class FileAgent {


    @Path("/{actor}/import")
    @POST
    @Address(Addr.File.IMPORT)
    @Adjust(Orders.MODULE)
    public JsonObject importFile(@PathParam("actor") final String actor,
                                 @QueryParam("module") final String module,
                                 @StreamParam @Codex final FileUpload fileUpload) {
        /* File stored */
        final String filename = fileUpload.uploadedFileName();
        Ix.Log.dao(this.getClass(), IxMsg.FILE_UPLOAD, fileUpload.fileName(), filename);
        return Ux.toZip(actor, filename, module);
    }

    @Path("/{actor}/export")
    @POST
    @Address(Addr.File.EXPORT)
    @Adjust(Orders.MODULE)
    @Consumes(MediaType.APPLICATION_OCTET_STREAM)
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public JsonObject exportFile(@PathParam("actor") final String actor,
                                 @QueryParam("module") final String module,
                                 @BodyParam final JsonObject condition) {
        /* Exported columns here for future calculation */
        JsonArray columns = condition.getJsonArray("columns");
        if (Objects.isNull(columns)) {
            columns = new JsonArray();
        }
        /* Remove columns here and set criteria as condition
         * Here extract query by `criteria` node, it will be synced with
         * dynamic exporting here.
         **/
        JsonObject query = condition.getJsonObject(Qr.KEY_CRITERIA);
        if (Ut.isNil(query)) {
            query = new JsonObject();
        }
        /*
         * Toggle format here
         * {
         *     "0": xxx,
         *     "1": yyy,
         *     "2": zzz,
         *     ......
         * }
         */
        return Ux.toZip(actor, query, module, columns);
    }
}
