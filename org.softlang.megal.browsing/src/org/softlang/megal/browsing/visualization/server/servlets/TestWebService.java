package org.softlang.megal.browsing.visualization.server.servlets;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.softlang.megal.browsing.visualization.server.HttpServer.MegamodelProvider;

@Path("test")
public class TestWebService {

   @Inject MegamodelProvider mp;
	
   @GET
   @Path("/available")
   @Produces(MediaType.TEXT_PLAIN)
   public String available() {
      return "yes";
   }

}
