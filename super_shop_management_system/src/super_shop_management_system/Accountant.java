/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_shop_management_system;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Accountant extends Employe {
      private double salary;
    
     
     //Set Designation
      public void set_designation( ){
          designation = "Accountant";
      }
     //Salary
      public void calculate_salary(){
          salary = salary+15000;
      } 
    //Print Salary
        public void print_salary(){
           System.out.println("Accountant Salary: "+ salary); 
        }
}
