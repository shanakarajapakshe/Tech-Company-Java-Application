
package ClassPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shanaka Rajapakshe
 */
public class FileSystem {

    private static String FILE_PATH = "C:\\Users\\Shanaka Rajapakshe\\Documents\\NetBeansProjects\\userdata\\";

    File file;
    private String fileName;

    public FileSystem(String fileName) {
        this.fileName = fileName;
        //newFileCreate(filename);
    }

    public FileSystem() {

    }

    public void writeDataToFile(String record, String filename) {
       File file = new File(filename);
        try {
            FileWriter writer = new FileWriter(file,true);
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write(record);
            buffer.newLine();
            buffer.close();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(FileSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public boolean newFileCreate(String filename){
        File file = new File(filename);
        try {
            if(file.createNewFile()){
                System.out.println("file create,,,");
            }else{
                System.out.println("file already have");
            }
        } catch (IOException ex) {
            Logger.getLogger(FileSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
     public BufferedReader readAFile() {
        if(create_NewFile())
        {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                return bufferedReader;
            } catch (IOException e) {
                System.err.println("Something went wrong with Reading the file" + e);
            }
        } else {
        }     
        return null;
    }

     public int login(String username, String password) {
        File file = new File("login.txt");
        String line;
        int number =0;
        String[] arr;
        try {
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);
            while((line=buffer.readLine()) != null){
                arr = line.split(",");
                if(arr[4].equals(username) && arr[5].equals(password)){
                    number = 1;
                }else{
                    number =2;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileSystem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return number;
                
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

//    public boolean create_NewFile(){
//        try{
//            file = new File(FILE_PATH + fileName);
//            if (file.createNewFile()){
//                System.out.println("File Created: " + file.getName());
//                return true;
//            }
//            System.out.println("File Already Exisit !");
//            return false;
//        }catch(IOException e){
//            System.err.println("Something went wrong with creating file" + e);
//            return false;
//        }
//    }
//    public void writeDataToFile(String record,String filename){
//        try{
//            File file = new File(filename);
//            FileWriter fileWriter = new FileWriter(file,true);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(record);
//            bufferedWriter.newLine();
//            bufferedWriter.close();
//            fileWriter.close();
//            //return true;
//        }catch (IOException e){
//            System.err.println("Something went wrong with writing" + e);
//            //return false;
//        }
//         
//    }
//    public BufferedReader readAFile(){
//        if(!create_NewFile())
//        {
//            try{
//                FileReader fileReader = new FileReader(file);
//                BufferedReader bufferReader = new BufferedReader(fileReader);
//                
//                return bufferReader;
//                }catch (IOException e){
//                    System.err.println("Something went wrong with Reading the file" + e);
//            }
//        }
//        return null;
//    }

 

    /*BufferedReader readAFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    boolean create_NewFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean writeDataToFile(String record) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
