package com.cokelek;

import java.util.List;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/system")
public class MessageResource {
    
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/marina")
    public String Rokey(){
        return "JAVA EE";
    }
    
          
    @GET
    //@Produces(MediaType.TEXT_PLAIN)
    @Path("veri/{oyuncak}")
    public Response verilans(@PathParam("oyuncak") String oyuncak){
    
        return Response.status(200).entity("oyuncak  : "+oyuncak).build();
    }
    
    @GET
    @Path("top/{para1}/{para2}")
    public Response ibrahim(@PathParam("para1") String para1,
                            @PathParam("para2") String para2){
        
        
      return  Response.status(200).entity(para1+"-"+para2).build();
    }
    
    @GET
    @Path("/etme")
    public String mevlana(@DefaultValue("ASK")@QueryParam("ask") String ask,
                          @DefaultValue("MEVLANA")@QueryParam("mevlana")String mevlana,
                          @DefaultValue("9")@QueryParam("klarnet")int klarnet){
        
        return ask+"-"+mevlana+"-"+klarnet;
    
    }
    
    
    
}
