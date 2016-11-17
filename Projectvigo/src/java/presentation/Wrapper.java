/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import entity.ActivityTab;
import entity.PromotionTab;
import entity.PromotionTabPK;
import static java.lang.System.out;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Response;

/**
 *
 * @author Shyamali
 */

//to check input data and database data are matching
public class Wrapper {
    public Response ValidateData(String user,String password){
         java.net.URI location = null;
                  
            try {
                if (user.equals("aa") && password.equals("qq")) 
                    location = new java.net.URI("../GUI/general.jsp");
                else
                    location = new java.net.URI("../index.jsp");
     
            } catch (URISyntaxException ex) {
                Logger.getLogger(Wrapper.class.getName()).log(Level.SEVERE, null, ex);
            }
        
       return Response.temporaryRedirect(location).build();
             
    }
    
    /*
    ** create promotion tab entity and set all the parameters and return entity object
    */
    public PromotionTab fillDB(String responsible, Date sdate, Date edate, String note){

        PromotionTabPK promtpk = new PromotionTabPK();
        
        PromotionTab promt = new PromotionTab();
      
        // PromotionTab promt = new PromotionTab(promtpk,"my testing on insert","type1","my responsible take",sdate,edate,"eyufgyawe ahffyw whfhuWG","close");
       
        //set parameters......
        promtpk.setSiteId("1");
        promtpk.setPromotionId("1");
        promt.setPromotionTabPK(promtpk);
        promt.setDescription("my testing on insert");
        promt.setType("type1");
        promt.setResponsible(responsible);
        promt.setNote(note); 
        promt.setState("close");
        promt.setStartDate(sdate);
        promt.setEndDate(edate);
         
    return promt; 
    
   }
    
    /*
    ** Create activity tab entity add set all the value and return activity tab entity
    */
    public ActivityTab insertDataAct(int Activityseq,String activityid,String description,String promotionid,String responsible,int parentid,String siteid,Date sdate,Date edate,String note,String state) {

        ActivityTab at = new ActivityTab();
        
        at.setActivityId(activityid);
        at.setDescription(description);
        at.setActivitySeqNo(Activityseq);
        at.setPromotionId(promotionid);
        at.setParentId(parentid);
        at.setResponsible(responsible);
        at.setSiteId(siteid);
        at.setStartDate(sdate);
        at.setEndDate(edate);
        at.setNote(note);
        at.setStatus(state);
             
        return at;
    }
    
 
}
