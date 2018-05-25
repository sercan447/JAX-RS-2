
package com.cokelek;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/esref")
public class Tebrizi {
    //http://localhost:8080/JAX-RS-7-version/kokdizin/esref/hayat;rab=allah;peygamber=muhammed;kitabin=kuranikerim
    @GET
    @Path("/hayat")
    public Response Kitaplar(@MatrixParam("rab")String rab,
                             @MatrixParam("peygamber")String peygamber,
                             @MatrixParam("kitabin")String kitabin){
    
        
        return Response.status(200).entity(rab+"-"+peygamber+"-"+kitabin).build();
    }
    
    
    
}
