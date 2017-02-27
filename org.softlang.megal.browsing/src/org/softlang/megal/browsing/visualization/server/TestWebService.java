package org.softlang.megal.browsing.visualization.server;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
public class TestWebService {

   @Inject MegamodelProvider megamodelProvider;
	
   @GET
   @Path("/available")
   @Produces(MediaType.APPLICATION_JSON)
   public Megamodel available() {
      return megamodelProvider.getMegamodel(); //"yes" + (megamodelProvider.getMegamodel() == null);
   }

}
