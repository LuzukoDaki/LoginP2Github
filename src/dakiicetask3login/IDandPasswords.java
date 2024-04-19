/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dakiicetask3login;

import java.util.HashMap;


/**
 *
 * @author Daki
 */
public class IDandPasswords {
    // creating a HashMap  by instentiating it
    HashMap<String,String> accessinfo = new HashMap<String,String>();
    //creating Constructo for ID and Passwords class
    IDandPasswords (){
   //inserting key values within HashMap
      accessinfo.put("_daki","Zukos05*");
      accessinfo.put("Luzko","KULUNGA");
      accessinfo.put("ITGUY","coding123");
    }
    // creating getter method for HashMap
      protected HashMap getLoginInfo(){ //inserting Protected status because user info is private
        return accessinfo; //returning HasMap
    }
    
}




