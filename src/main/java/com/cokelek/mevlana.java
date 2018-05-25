
package com.cokelek;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/mevlana")
public class mevlana {
    
    //ruya?asa=guzel&kus=olecek
    @GET
    @Path("/ruya")
    public String yaradan(@HeaderParam("user-agent") String bilgi,
                          @DefaultValue("SIYRILTI")@QueryParam("asa") String asa,
                          @DefaultValue("PES ETME")@QueryParam("kus")String kus){
        
    return asa + " * "+kus+" * "+bilgi;
    }
    
    //  /yasat/damla/su
    @GET
    @Path("/yasat/{koyun}/{derin}")
    public String kaf(@PathParam("koyun") String koyun,
                      @PathParam("derin") String derin){
    
        return koyun + " , "+derin;
    }
    
    @GET
    @Path("/altin")
    public Response yelten(@Context UriInfo info){
        
        String asa = info.getQueryParameters().getFirst("asa");
        String kus = info.getQueryParameters().getFirst("kus");
        
        return Response.status(20).entity("Gelen veriler : "+asa+" - "+kus).build();
    }
    
    @GET
    @Path("/{year}/{month}/{day}")
    public Response getUserHistory(@PathParam("year")int year,
                                   @PathParam("month")int month,
                                   @PathParam("day")int day){
    
        
        String date = year+ " * "+month + " * "+day;
        return Response.status(200).entity(date).build();
    }
    
    @GET
    @Path("{empId}")
    public Response getEmployeId(@PathParam("empId") String empId){
        
        return Response.status(200).entity("Gelen Personel with :"+empId).build();
    }
    
    @GET
    @Path("/daga/{branch}/{department}")
    public Response getEmployeList(@PathParam("branch") String branchName,
                                   @PathParam("department")String deptName){
        
        String tags = "Yaradanın ilacı : "+branchName + " * "+deptName + "<br/>";
        return Response.status(200).entity(tags).build();
    }
}
