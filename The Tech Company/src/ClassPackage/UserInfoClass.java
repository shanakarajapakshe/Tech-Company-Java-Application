
package ClassPackage;

import java.io.BufferedReader;

public class UserInfoClass {
    private String  UserID;
    private String  Password;
    private String  UserType;
    
    FileSystem fileSystem = new FileSystem("UserInfo.txt");
    
    public UserInfoClass (String UserID, String Password)
    {
        this.UserID=UserID;
        this.Password=Password;
    }
    
   
    public UserInfoClass (String UserID, String Password, String UserType)
    {
        this.UserID=UserID;
        this.Password=Password;
        this.UserType=UserType;
        
    }
    public void setUserID(String UserID)
    {
        this.UserID=UserID;
    }
    public String getUserID()
    {
        return UserID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }
    
    
//    public boolean addNewUser(){
//        if(!fileSystem.create_NewFile()){
//            String record = UserID + "" + Password + "" + UserType;
//            return fileSystem.writeDataToFile(record);
//        }
//        return false;
//    }

//public boolean validateLogin(){
//    try{
//        String[]words = null;
//        
//        BufferedReader bufferedReader = fileSystem.readAFile();
//        String user;
//        while ((user = bufferedReader.readLine()) != null) {
//            words = user.split(" ");
//            if ((words[0].equals(UserID)&& words[1].equals(Password)))
//            {
//                this.setUserID(words[0]);
//                this.setPassword(words[1]);
//                this.setUserType(words[2]);
//                return true;
//                
//            }
//        }
//    }catch (Exception e){
//        System.err.println("Something went wrong validating login" + e);
//        return false;
//    }
//        return false;
//}
    
}


