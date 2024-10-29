package com.mycompany.progpoepart2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author slule
 */
class Login {

    Scanner input = new Scanner (System.in);
    
    public Login() {
    }
String firstname;
String lastname;
String username;
String password;
    public void setFirstname(String firstName) {
        this.firstname = firstname;
    }
   
   public String getFirstname() {
        return firstname;
    }
   
   public void setLastname(String lastname) {
        this.lastname = lastname;
    }
   public String getLastname(){
       return lastname;
   }
   
   public void setUsername(String username) {
       this.username = username;
   }
   
   public String getUsername() {
       return username;
   }
   

   public void setPassword(String password) {
        this.password = password;
    }
   public String getPassword() {
       return password;
   }
   // (Farrell, 2019)
   
   public boolean checkUsername () {
       boolean checkUsername = false ;
       int length = this.username.length();
       
       if (this.username.contains("_") && length <= 5) {
           checkUsername = true;
       }
       
       while (!(this.username.contains ("_") && length <=5)) {
           checkUsername = false;
       }
       return checkUsername ;  // (W3SCHOOLS, s.s.)
}

   
   public boolean checkPasswordComplexity() {
       boolean checkPassword = false;
       int length2 = this.password.length();
       boolean capital = this.password.chars().anyMatch(Character::isUpperCase); //(tutorials point, s.s)
       boolean number = this.password.chars().anyMatch(Character::isDigit);
       
       for (int i = 0 ; 1 < this.password.length(); i++){ //(Nayak, 2021)
           String strCharacter = Character.toString(this.password.charAt(i));
           if (this.password.contains(strCharacter));
           
           if (length2 >=8 && capital == true && number == true && this.password.contains(strCharacter) == true){
               checkPassword = true;
               break;
           } else if (!(length2 >=8 && capital == true && number == true && this.password.contains(strCharacter) == true)){
               checkPassword = false;
               break;
           }
           }
       
       return checkPassword; //(Satayabrata, 2022)
          }
   
       public boolean loginUser(String username, String password) {
           boolean matches = false;
           
           if (username.equals(this.username)&& password.equals(this.password)){
               matches = true;
           } else if (!(username.equals(this.username) && password.equals(this.password))) {
               matches = false;
           }
        return matches; //(Farrell, 2019)
       }
       public String returnLoginStatus (String username, String password) {
           String loginStatus = "" ;
           if(loginUser(username, password)== true) {
               loginStatus = "Welcome " + getFirstname() + "," + getLastname() + "It is great to see you again.";
           } else if (loginUser( username, password) == false) {
               loginStatus = "Username or password incorrect, please try again";
           }
           
           return loginStatus;
       }
       
       public String registerUser() {
           String message = " ";
           if(checkUsername()== true) {
               JOptionPane.showMessageDialog(null, "Username successfully captured");
           } else if (checkUsername()== false){
               JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and special character.");
             }
           if(checkPasswordComplexity()== true) {
               JOptionPane.showMessageDialog(null, "Password successfully captured");
           } else if (checkPasswordComplexity() == false){
               
               JOptionPane.showMessageDialog(null, "Password is not \n" +
                                                      "correctly formatted, \n" +
                                                      "please ensure that \n" +
                                                      "the password \n" +
                                                      "contains at least 8 characters \n" +
                                                      "characters, a capital \n" +
                                                      "letter, a number and \n" +
                                                      "a special character.");
           }
           
           if (checkPasswordComplexity() == true && checkUsername() == true){
               message = "Successfully registered";
           }
           
           return message;
       }

}
        
    