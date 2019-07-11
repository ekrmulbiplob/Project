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
public class Customer {
    private String customer_name;
    private int customer_id;
    private String customer_mobile_no;
   
    public Customer(){
       
    }   
      //Input Customer Name
    public  void input_customer_name(){
       Scanner input = new Scanner(System.in);
            System.out.print("Customer Name: ");
                customer_name=input.nextLine();
       	 
    }
    //Set Customer Name
    public void set_customer_name(String name){
        customer_name=name;
    }
    //Get Customer Name
    public String get_customer_name(){
        return customer_name;
    }
     //Print Customer Name
     public void print_customer_name(){
          System.out.println("Customer Name: "+ customer_name);
      }
     
       //Input Customer Id
    public  void input_customer_id(){
       Scanner input = new Scanner(System.in);
            System.out.print("Customer Id: ");
                customer_id=input.nextInt();
       	 
    }
      //Set Customer Id
    public void set_customer_id(int id){
        customer_id=id;
    }
    //Get Customer Id
    public int get_customer_id(){
        return customer_id;
    }
     //Print Customer Id
     public void print_customer_id(){
          System.out.println("Customer Id: "+ customer_id);
      }
     
       
       //Input Customer Mobile No
    public  void input_customer_mobile_no(){
       Scanner input = new Scanner(System.in);
            System.out.print("Mobile No: ");
                 customer_mobile_no=input.next();
       	 
    }
    //Set Customer Mobile No
    public void set_customer_mobile_no(String mobile){
        customer_mobile_no=mobile;
    }
    //Get Customer  Mobile No
    public String get_customer_mobile_no(){
        return customer_mobile_no;
    }
     //Print Customer Id
     public void print_customer_mobile_no(){
          System.out.println("Mobile No: "+  customer_mobile_no);
      }
   
    
}
