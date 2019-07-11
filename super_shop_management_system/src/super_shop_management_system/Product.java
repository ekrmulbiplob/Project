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
public class Product {
    private String product_name;
    private String product_category;
    private int product_code;
    private float product_weight;
    private double product_price;
    private double total_price,discount_price;
    
    public Product(){
        total_price =0;
        discount_price=0;
    }
    //Input Product Code
    public void input_product_code(){
        Scanner input = new Scanner(System.in);
            System.out.print("Product Code: ");
                product_code = input.nextInt();
        }
    //Set Product Code
     public void set_product_code(int code){
          product_code = code;
     }
    //Get Product Code
      public double get_product_code(){
           return product_code;
      }
   //Print Product Code
     public void print_product_code(){
          System.out.println("Product Code: "+product_code);
           
     } 
     
     //Input Product Category
    public void input_product_category(){
        Scanner input = new Scanner(System.in);
            System.out.print("Product Category: ");
                product_category = input.next();
        } 
    //Set Product Category
     public void set_product_category(String category){
         product_category = category;
     }
     //Get Product Category
      public String get_product_category(){
           return product_category;
      }
     //Print Product Category
     public void print_product_category(){
          System.out.println("Product Category: "+product_category);
           
     } 
    
   //Input Product Name
      public void input_product_name(){
        Scanner input = new Scanner(System.in);
            System.out.print("Product Name: ");
                product_name = input.next();
          
      }
      //Set Product Name
      public void set_product_name(String name){
          product_name = name;
     }
      //Get Product Name
      public String get_product_name(){
           return product_name;
      }
    //Print Product Name
     public void print_product_name(){
          System.out.println("Product Name: "+product_name);
     } 
     
     //Input Product Weight
      public void input_product_weight(){
        Scanner input = new Scanner(System.in);
            System.out.print("Product Weight: ");
                product_weight = input.nextFloat();
          
      } 
       //Set Product Weight
       public void set_product_weight(float weight){
         product_weight = weight;
     }
       //Get Product Weight
      public double get_product_weight(){
           return product_weight;
      }
     //Print Product Weight
     public void print_product_weight(){
          System.out.println("Product Weight: "+product_weight+" Kg");
     } 
     
    //Input Product Price
      public void input_product_price(){
        Scanner input = new Scanner(System.in);
            System.out.print("Product Price: ");
                product_price = input.nextDouble();
          
      } 
      //Set Product Price
       public void set_product_price(double price){
          product_price = price;
     }
     //Get Product Price
       public double get_product_price(){
           return product_price;
       }
       //Print Product Price
     public void print_product_price(){
          System.out.println("Product Price: "+product_price+" Tk");
     }
     
      //Calculate Total Price
      public void calculate_total_price(double price){
          total_price =price+price ;
              
      }
       //Calculate Discount Price
      public void discount_price(double price){
          discount_price = price-price*0.05;
              
      }
     //Get Discount Price
       public double get_discount_price(){
        return discount_price;  
      }
      //Print Discount Price
      public void print_discount_price(){
          System.out.println("Discount Price:                    "+discount_price+" Tk");
      }
      //Get Total Price
      public double get_total_price(){
        return total_price;  
      }
      //Print Total Price
      public void print_total_price(double price){
          System.out.println("Total Price:                       "+price+" Tk");
      }
      //Print Product Title
     public void print_all_product_title(){
        System.out.println("Code:  Name:   Category:   Weight:   Price:"); 
     }
      //Print All Product 
     public void print_all_product(){
            System.out.println(" "+product_code+"    "+product_name+"      "+product_category+"        "+product_weight+"     "+product_price);
     }
}
