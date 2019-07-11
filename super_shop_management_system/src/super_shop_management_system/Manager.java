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
public class Manager extends Employe {
     private double salary;
     public Manager(){
         
     }
     //Salary
      public void calculate_salary(){
          salary=salary+20000;
      }
      //Set Designation
      public void set_designation( ){
          designation = "Manager";
      }
      //Print Salary
        public void print_salary(){
           System.out.println("Manager Salary: "+ salary); 
        }
    
}
