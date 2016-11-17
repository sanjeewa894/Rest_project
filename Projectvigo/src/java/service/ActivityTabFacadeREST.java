/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.ActivityTab;
import static java.lang.System.out;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import presentation.Helper;
import presentation.Wrapper;

/**
 *
 * @author sanjeewa
 */
@Stateless
@Path("entity.activitytab")
public class ActivityTabFacadeREST extends AbstractFacade<ActivityTab> {

    @PersistenceContext(unitName = "ProjectvigoPU")
    private EntityManager em;

    public ActivityTabFacadeREST() {
        super(ActivityTab.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(ActivityTab entity) {
        super.create(entity);
    }

     @POST
    @Path("/intuser")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED})
    public String InsertUser(@FormParam("activityseq") int Activityseq,@FormParam("activityid") String activityid, @FormParam("description") String description,
            @FormParam("siteid") String siteid,@FormParam("promotionid") String promotionid, @FormParam("parentid") int parentid, 
            @FormParam("responsible") String responsible,@FormParam("sdate") Date sdate,@FormParam("edate") Date edate,@FormParam("note") String note,
            @FormParam("state") String state ) {


        Helper helperActive = new Helper();
        Wrapper wrapper = new Wrapper();
        ActivityTab actFill = new ActivityTab();
        actFill = helperActive.validateActFill(Activityseq, activityid, description, promotionid, responsible, parentid, siteid, sdate, edate, note, state);
       
        super.create(actFill);
    
    return "ok state";    
    }
    
    
    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, ActivityTab entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public ActivityTab find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ActivityTab> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ActivityTab> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
