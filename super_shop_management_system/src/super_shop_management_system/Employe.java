/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_shop_management_system;

/**
 *
 * @author MSI
 */
import java.util.Scanner;
abstract public class Employe {
    private String employee_name;
    private int employee_id;
    String designation;
    private String mobile_no;
    private double salary;
   
    
    
    
    //Input Employe Name
    public  void input_employee_name(){
       Scanner input = new Scanner(System.in);
            System.out.print("Name: ");
                employee_name=input.next();
       	 
    }
    //Set  Employe Name
       public void set_employee_name(String name){
           employee_name = name;
       }
     //Get Employe Name
       public String get_employee_name(){
           return employee_name;
       }
     //Print Employe Name
     public void print_employee_name(){
          System.out.println("Name: "+ employee_name);
      }
    
    //Input Employe Id
    public  void input_employee_id(){
       Scanner input = new Scanner(System.in);
            System.out.print("Id: ");
                employee_id=input.nextInt();
       	 
    }
     //Set  Employe Id
       public void set_employee_id(int id){
           employee_id = id;
       }
     //Get Employe Id
       public int get_employee_id(){
           return employee_id;
       }
    //Print Employe Id
     public  void print_employee_id(){
          System.out.println("Id: "+ employee_id);
      }
     
     
    //Input Designation
   public void input_empployee_designation(){
      Scanner scanner = new Scanner(System.in);
   	  System.out.print("Designation: ");
      designation = scanner.next();
   }
    //Set Designation
   abstract public void set_designation( );
     
    //Get Mobile No
       public String get_designation(){
           return designation;
       }    
      //Print designation
   public void print_employee_designation(){
      System.out.println("Designation: "+designation);
   }


      
 //Input Mobile No
    public  void input_mobile_no(){
       Scanner input = new Scanner(System.in);
            System.out.print("Mobile No: ");
                mobile_no=input.next();
       	 
	}
     //Set Mobile No
       public void set_mobile_no(String no){
           mobile_no= no;
       }
     //Get Mobile No
       public String get_mobile_no(){
           return mobile_no;
       }
    //Print Mobile No
      public  void print_mobile_no(){
          System.out.println("Mobile No: "+ mobile_no);
      }
      
      
       //Input Salary
       public  void input_salary(){
       Scanner input = new Scanner(System.in);
            System.out.print("Salary: ");
                salary = input.nextDouble();
       	 
	}
      //Set Salary
       public void set_salary(double emp_salary){
           salary = emp_salary;
       }
      //Get Salary
       public double get_salary(){
           return salary;
       }
     //Salary
     abstract public void calculate_salary();
          
     //Print Salary
        public void print_salary(){
           System.out.println("Salary: "+ salary); 
        }
        
       

}
