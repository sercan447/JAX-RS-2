package com.cokelek;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class Ilyas {
    
    
    // BU ISLEMI @formParam anotasyonu POST ISLEMI ıle yapabilirsiniz .@GET ısleminde geçersiz oluyor.
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/soyle")
    public String sevdam(@FormParam("name")String name,@FormParam("age")int age){
    
        return "Ad :"+name+" - Yas : "+age;
    }
}
