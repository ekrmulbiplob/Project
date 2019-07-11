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
public class Sales extends Employe {
     private double salary;
     public Sales(){
         
     }
     //Set Designation
      public void set_designation( ){
          designation = "Sales";
      }
     //Salary
      public void calculate_salary(){
          salary=salary+10000;
      } 
    //Print Salary
        public void print_salary(){
           System.out.println("Sales Salary: "+ salary); 
        }
}
