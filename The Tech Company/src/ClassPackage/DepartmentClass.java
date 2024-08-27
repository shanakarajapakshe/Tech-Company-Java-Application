

package ClassPackage;



public class DepartmentClass {
    
    private String  DepartmentName;
    private String  DepartmentID;
    private String Designation;
    


public DepartmentClass(){}

    public DepartmentClass(String DepartmentName, String DepartmentID, String Designation) {
        this.DepartmentName = DepartmentName;
        this.DepartmentID = DepartmentID;
        this.Designation = Designation;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    public String getDepartmentID() {
        return DepartmentID;
    }
    
   
    public void setDepartmentID(String DepartmentID) {
        this.DepartmentID = DepartmentID;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }
    

    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public boolean addEmployee() {
//        
//        if(!fileSystem.create_NewFile())
//        {
//String record = DepartmentID + " " + DepartmentName  + " " + Designation;
//        
//System.err.println(DepartmentID + " " + DepartmentName + " " + Designation );
//            return fileSystem.writeDataToFile(record);
//        }
//        return false;
//    }
//       
//      public boolean searchEmployee(String keyword) //E001
//      {
//        boolean isFound = false;   
//        try {
//            String[] words = null;          
//            BufferedReader bufferedReader = fileSystem.readAFile();
//            String employee;       
//            outerloop:
//            while ((employee = bufferedReader.readLine()) != null) 
//                //E001 sam 20 Col3 IT
//            {              
//                words = employee.split(" "); //[0]=E001 [1]=sam [2]=20 [3]=col3 [4]=IT          
//                for (String word : words) //E001
//                {
//                    if (word.equals(keyword)) //E001==E001
//                    {
//                        isFound = true;                      
//                        this.setDepartmentID(words[0]);//E001
//                        this.setDepartmentName(words[1]);//sam
//                        this.setDesignation(words[4]);//IT
//                        
//                        break outerloop;
//                    }
//                }
//            }
//        } catch (Exception e) {
//             System.err.println("Something went wrong searching Employee" + e);
//        } 
//        return isFound;
//    }
//      
//       public String viewAllDepartment () 
//      {
//        String Department, allDepartment = " ";
//        String[] words = null;
//        int count = 0;
//        BufferedReader bufferedReader = fileSystem.readAFile();
//        try {
//            while ((Department = bufferedReader.readLine()) != null) {     
//                words = Department.split(" ");
//allDepartment = allDepartment + words[0] + "\t" + words[1] + "\t" + words[2] + "\t" + 
//        words[3] + "\n";
//                count++;               
//            }
//        } catch (Exception e) {
//            System.err.println("Something went wrong when vewing Employees" + e);
//        }
//        
//        return allDepartment;
//    }
//  
//    }

