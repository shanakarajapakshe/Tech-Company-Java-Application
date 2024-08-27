/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPackage;

import javax.swing.ComboBoxEditor;
import java.io.BufferedReader;
import java.io.FileReader;


/**
 *
 * @author Shanaka Rajapakshe
 */
public class HRAClass {

    private String HRName;
    private String dob;
    private String Address;
    private String Contact;
    private String username;
    private String password;
    private String confirmpassword;

    
     public HRAClass(){}
     FileSystem FileSystem = new FileSystem("HRAssistant.txt");

    public HRAClass(String HRName, String dob, String Address, String Contact, String username, String password, String confirmpassword) {
        this.HRName = HRName;
        this.dob = dob;
        this.Address = Address;
        this.Contact = Contact;
        this.username = username;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

    public String getHRName() {
        return HRName;
    }

    public void setHRName(String HRName) {
        this.HRName = HRName;
    }

    public String getdob() {
        return dob;
    }

    public void setdob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getconfirmpassword() {
        return confirmpassword;
    }

    public void setconfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public FileSystem getFileSystem() {
        return FileSystem;
    }

    public void setFileSystem(FileSystem FileSystem) {
        this.FileSystem = FileSystem;
    }
     public boolean addEmployee() {
        
        if(!FileSystem.create_NewFile())
        {
String record = HRName + " " + dob + " " + Address+" " + Contact+" "+ username+" "+password+" "+confirmpassword;
System.err.println( HRName + " " + dob + " " + Address+" " + Contact+" "+ username+" "+password+" "+confirmpassword);
            return FileSystem.writeDataToFile(record);
        }
        return false;
    }

 
}
        
