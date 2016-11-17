/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import entity.ActivityTab;
import entity.PromotionTab;
import static java.lang.System.out;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.ws.rs.FormParam;

/**
 *
 * @author Shyamali
 */
public class Helper {


    /*
    ** validate filled data in promotion tab if empty field in form return 1 or error of filled data return -1
    ** on success return 0
    */
    public PromotionTab validateDataFilled(String responsible, Date sdate, Date edate, String note){
     
        try { 
            if(responsible.isEmpty() ){
                return null; 
            }else{
               
                Wrapper enterdata= new Wrapper();
              
            return  enterdata.fillDB(responsible,sdate,edate,note);    
            }           
        }catch(Exception ex){
            return null;        
        }
    }

    public ActivityTab validateActFill(int Activityseq,String activityid, String description,String siteid, String promotionid, int parentid, String responsible, Date sdate, Date edate,String note,
            String state) {
          
        try { 
                Wrapper enterdataAct= new Wrapper();
               
            return enterdataAct.insertDataAct(Activityseq, activityid, description, promotionid, responsible, parentid, siteid, sdate, edate, note, state);           
        }catch(Exception ex){
               return null;        
        }
        
        
    }
}

