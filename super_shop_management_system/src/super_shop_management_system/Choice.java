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
public class Choice {
    private int option;
    
    public Choice(){
    
    }
    //Print Home Option
    public void print_option(){
        System.out.println("Enter Your Choice:\n 1.Product \n 2.Employee \n 3.Customer ");
    }
    //Print Product Option
    public void print_product_option(){
        System.out.println("Product:\n 1.Buy Product \n 2.Show Product Datiles ");
    }
    //Print Employee Option
    public void print_employee_option(){
        System.out.println("Employee:\n 1.Add Employee \n 2.Show Employee ");
    }
    //Print Employee Add Option
    public void print_add_employee_optoin(){
        System.out.println("Enter Your Choice:\n 1.Add Manager \n 2.Add Accountant \n 3.Add Sales \n 4.Calculate Salary ");
    }
    
    //Print Employee Information Show Option
     public void print_show_employee_optoin(){
        System.out.println("Enter Your Choice:\n 1.Show Manager \n 2.Show Accountant \n 3.Show Sales ");
    }
     //Print Customer Option
     public void print_customer_option(){
         System.out.println("Customer:\n 1.Add Customer \n 2.Show Customer ");
     }
     //Input Option
    public void input_option(){
          Scanner input = new Scanner(System.in);
          option = input.nextInt();
    }
    
    //Set Option
    public void set_option(int number){
        option=number;
    }
    
    //Get Optoion
    public int get_option(){
        return option;
    }
   
}
