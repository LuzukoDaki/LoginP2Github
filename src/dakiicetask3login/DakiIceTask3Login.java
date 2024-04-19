/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dakiicetask3login;

/**
 *
 * @author Daki
 */
public class DakiIceTask3Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // creating an instance of our ID and Passwords class / instentiating an object
       IDandPasswords idandPass = new IDandPasswords();
      
        // creating an instance of our Login Page / instentiating an object
        
       LoginPage loginPage = new LoginPage( idandPass.getLoginInfo());
       int mark = 4;
       
    }
    
}
