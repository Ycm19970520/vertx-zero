package cn.vertxup.ambient.api.file;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.ambient.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.eon.KName;

import javax.ws.rs.*;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@EndPoint
@Path("/api")
public interface FileAgent {

    @POST
    @Path("/file/my/search")
    @Address(Addr.File.MY_QUEUE)
    JsonObject searchMy(@BodyParam JsonObject query);

    @GET
    @Path("/file/my/:key")
    @Address(Addr.File.BY_KEY)
    JsonObject fileByKey(@PathParam(KName.KEY) String key);

    @GET
    @Path("/file/by/directory")
    @Address(Addr.File.BY_DIRECTORY)
    JsonArray fileByDirectory(@QueryParam(KName.DIRECTORY_ID) String directoryId);

    @GET
    @Path("/file/by/keyword/:keyword")
    @Address(Addr.File.BY_KEYWORD)
    JsonArray fileByKeyword(@PathParam(KName.KEY_WORD) String keyword);
}
