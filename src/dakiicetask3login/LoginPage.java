/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dakiicetask3login;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Daki
 */
// Just testing out Github
public class LoginPage implements ActionListener{
    //creating our JFrame
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField =  new JPasswordField();
    JLabel userIDLabel = new JLabel("userID:");
    JLabel userPasswordLabel = new JLabel("password:");
    //message for user to know if login was a succes or failure
    JLabel messageLabel = new JLabel();
    //creating a copy  of the Login Info so it can be available globally to all methods within our login page
    HashMap<String,String> accessinfo = new HashMap<String,String>();
    //setting constructor for our LoginPage
    LoginPage(HashMap<String,String> accessInfoOriginal){ // setting up parameters in order to accept the HashMap
        
        accessinfo = accessInfoOriginal; //copy  of the Login Info so it can be available globally to all methods within our login page
        //adding components
        userIDLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);
        //adding message Label
        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));
        
        //creating the userId field and passWord field
        userIDField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);
        //adding a login buttons
        loginButton.setBounds(125, 200, 100, 25);
        loginButton.addActionListener(this);
        //ading reset buttons
        resetButton.setBounds(225, 200, 100, 25);
        resetButton.addActionListener(this);
        
        //adding methods to the Login Frame
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //used for user to close frame if they want
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
     
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
      //working on Reset Button / if statements
        if(e.getSource()==resetButton) {
          userIDField.setText("");
          userPasswordField.setText("");
      }
    //working on Login Button / if statements
    if(e.getSource()==loginButton) {
        // creating a string variable
        String userID = userIDField.getText();
        String password = String.copyValueOf(userPasswordField.getPassword());/*this method is going to retrieve the password I 
type in,convert it to a string, and hen store it withn a string called passwords*/
        
         //verifying user ID and passwords / making use of if statements and conditions
        if(accessinfo.containsKey(userID)){
            if(accessinfo.get(userID).equals(password)){
                messageLabel.setForeground(Color.white);
                messageLabel.setText("Login is successful");
                
                //launching instance of our welcome page
                WelcomePage welcome = new WelcomePage();
               }
           //for incorect password
            else{
                messageLabel.setForeground(Color.black);
                messageLabel.setText("Login is unsuccessful");
                
                
            }
        }

    }
    
    }
    

    private JFrame newJFrame() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
