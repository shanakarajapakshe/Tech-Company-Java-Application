/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPackage;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Shanaka Rajapakshe
 */
public class EmpClass {

    private String EmpName;
    private String dob;
    private String Address;
    private String epfNumber;
    private String ContactNumber;
    private String Department;
    private String EpfNumber;
    private String Designation;

    public EmpClass(String EmpName, String dob, String Address, String epfNumber, String ContactNumber, String Department, String EpfNumber, String Designation) {
        this.EmpName = EmpName;
        this.dob = dob;
        this.Address = Address;
        this.epfNumber = epfNumber;
        this.ContactNumber = ContactNumber;
        this.Department = Department;
        this.EpfNumber = EpfNumber;
        this.Designation = Designation;
    }

    public EmpClass() {
    }
    FileSystem FileSystem = new FileSystem("Employee.txt");

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEpfNumber() {
        return epfNumber;
    }

    public void setEpfNumber(String epfNmber) {
        this.epfNumber = epfNmber;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public String getDesignation() {
        return Designation;
    }
    
    
    

    public boolean addEmployee() {

        if (!FileSystem.create_NewFile()) {
            String record = EmpName + "," + dob + "," + Address + "," + epfNumber + "," + ContactNumber + "," + Department+","+Designation;
            return FileSystem.writeDataToFile(record);
        }
        return false;
    }

    public boolean searchEmployee(String keyword) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        boolean isFound = false;
        try {
            // C:\\Users\\Shanaka Rajapakshe\\Documents\\NetBeansProjects\\userdata\\Employee.txt
            String[] words = null;
            FileReader fileReader = new FileReader("Employee.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String employee;
            outerloop:
            while ((employee = bufferedReader.readLine()) != null) //E001 sam 20 Col3 IT
            {
                words = employee.split(","); //[0]=E001 [1]=sam [2]=20 [3]=col3 [4]=IT          
                for (String word : words) //E001
                {
                    if (word.equals(keyword)) //E001==E001
                    {
                        isFound = true;
                        this.setEmpName(words[0]);//E001
                        this.setDob(words[1]);//sam
                        this.setAddress(words[2]);//sam
                        this.setEpfNumber(words[3]);//col3
                        this.setContactNumber(words[4]);//IT

                        break outerloop;
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Something went wrong searching Employee" + e);
        }
        return isFound;
    }

  
//    public void viewAllEmployees(String keyword) {
//        String Employee, allEmployee = " ";
//        String[] words = null;
//        int count = 0;
//        BufferedReader bufferedReader = FileSystem.readAFile();
//        try {
//            while ((Employee = bufferedReader.readLine()) != null) {
//                words = Employee.split(" ");
//                allEmployee = allEmployee + words[0] + "\t" + words[1] + "\t" + words[2] + "\t"
//                        + words[3] + "\n";
//                count++;
//            }
//        } catch (Exception e) {
//            System.err.println("Something went wrong when vewing Employees" + e);
//        }
//
//    }
}
