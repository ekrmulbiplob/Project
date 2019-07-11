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
public class Super_Shop_Management_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int count=0;
      int choice = 1; 
      double temp =0;
        
//Array Of Object
        Product[] product = new Product[10];
        Employe[] employee = new Employe[10];
        
//All Class Object Creation
        Scanner input = new Scanner(System.in);
        Product productOne = new Product();
        Manager manager = new Manager();
        Accountant accountant = new Accountant();
        Sales sales = new Sales();
        Customer customer = new Customer();
        Choice option = new Choice();
        
// Set Array Object Values
       employee[0]= manager;
       employee[1]= accountant;
       employee[2]= sales;
     
//Call All Method   
    while(choice == 1)
    {
         option.print_option();
         option.input_option();
         System.out.println();
         if(option.get_option()== 1){
             while(choice == 1){
             option.print_product_option();
             option.input_option();
            System.out.println();
            if(option.get_option()== 1){
                System.out.println("Enter Product Number:");
                    int number = input.nextInt();
                        for(int i = 0; i<number; i++){
                             product[i] = new Product();
                              product[i].input_product_code();
                                   product[i].input_product_name();
                                         product[i].input_product_category();
                                            product[i].input_product_weight();
                                               product[i].input_product_price();
                                                    temp=temp + product[i].get_product_price();
                                                        System.out.println();
                                                            count++;
                                                    }
                                      }
            
            else if(option.get_option() == 2){
                System.out.println("\n");
                    productOne.print_all_product_title();
                        for(int i = 0; i<count; i++){
                            product[i].print_all_product();
                                }
        
        
                                System.out.println();
                                     productOne.discount_price(temp);
                                        productOne.print_total_price(temp);
                                            productOne.print_discount_price();
       
                                                System.out.println();
                                        }
            else
                System.out.println("@@Incorrect Option@@"); 
                
                System.out.println(); 
                System.out.println("Enter Your Choice:\n 1.Choice Again \n 2.Back");
                choice = input.nextInt(); 
                System.out.println();
            
                    }
         }
      else if(option.get_option()== 2){
          while(choice == 1){
              option.print_employee_option();
                option.input_option();
                    System.out.println();
          if(option.get_option()== 1){
               while(choice == 1){
                    option.print_add_employee_optoin();
                        option.input_option();
                            System.out.println();
              
//Inheritance Class Call
                if(option.get_option()== 1){
                    manager.input_employee_id();
                        manager.input_employee_name();
                            manager.set_designation();
                                manager.input_mobile_no();
                 
                        }
                else if(option.get_option()== 2){
                    accountant.input_employee_id();
                        accountant.input_employee_name();
                            accountant.set_designation();
                                accountant.input_mobile_no();
                        }
                else if(option.get_option()== 3){
                    sales.input_employee_id();
                        sales.input_employee_name();
                            sales.set_designation();
                                sales.input_mobile_no();
                  
                        }
                else if(option.get_option()== 4){
                 
//Use of Polimorfizam
                  for(int i=0;i<3;i++){
                    employee[i].calculate_salary();  
                     }
              }
              else
                System.out.println("@@Incorrect Option@@"); 
                
                System.out.println(); 
                 System.out.println("Enter Your Choice:\n 1.Choice Again \n 2.Back");
                    choice = input.nextInt(); 
                        System.out.println();
              }
          }
          
     
      else if(option.get_option()== 2){
           System.out.println();
            while(choice == 1){
             option.print_show_employee_optoin();
               option.input_option();
                    System.out.println();
          if(option.get_option()== 1){
              manager.print_employee_name();
                 manager.print_employee_id();
                    manager.print_employee_designation();
                         manager.print_salary();
                            manager.print_mobile_no();
          }
          else if(option.get_option()== 2){
              accountant.print_employee_name();
                accountant.print_employee_id();
                    accountant.print_employee_designation();
                        accountant.print_salary();
                            accountant.print_mobile_no();
          }
          else if(option.get_option()== 3){
              sales.print_employee_name();
                sales.print_employee_id();
                    sales.print_employee_designation();
                        sales.print_salary();
                            sales.print_mobile_no();
          }
          else
           System.out.println("@@Incorrect Option@@"); 
           
          System.out.println();
            System.out.println("Enter Your Choice:\n 1.Choice Again \n 2.Back");
               choice = input.nextInt(); 
                 System.out.println();
                 }
            choice=choice-1;
            }
           choice=choice-1;
          }
          
      }
      else if(option.get_option()== 3){
          System.out.println();
            while(choice == 1){
                option.print_customer_option();
                    option.input_option();
                        System.out.println();
            if(option.get_option()== 1){
                customer.input_customer_id();
                     customer.input_customer_name();
                         customer.input_customer_mobile_no();
                }
      
            else if(option.get_option()== 2){
                 customer.print_customer_name();
                     customer.print_customer_id();
                         customer.print_customer_mobile_no();
                }
            else
           System.out.println("@@Incorrect Option@@"); 
           
          System.out.println();
            System.out.println("Enter Your Choice:\n 1.Choice Again \n 2.Back");
               choice = input.nextInt(); 
                 System.out.println();
            }
            
      }
        
         else
            System.out.println("##Please Choice Correct Option##");
          
         System.out.println();
            System.out.println("Enter Your Choice:\n 1.Choice Home \n 2.Exit");
                choice = input.nextInt(); 
                    System.out.println();
    }         
       
    }
            
        
        
    }
    

