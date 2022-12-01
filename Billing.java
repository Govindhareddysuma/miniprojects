/* SUPER MARKET BILLING SYSTEM */

import java.util.*;  
class Product   
    {  
        private String pname;  
        private int qty;  
        private double price;  
        private double totalPrice;  
           
       
        Product(String pname, int qty, double price, double totalPrice)   
        {  
            this.pname = pname;  
            this.qty = qty;  
            this.price = price;  
            this.totalPrice = totalPrice;  
        }  
            
                public String getPname()   
                {  
                    return pname;  
                }  
                public int getQty()   
                {  
                    return qty;  
                }  
                public double getPrice()   
                {  
                    return price;  
                }  
                public double getTotalPrice()   
                {  
                    return totalPrice;  
                }  
               
               
                public static void displayFormat()   
                {  
                      System.out.println("\n****** YOUR BILL *****\n");
                    System.out.print("Name\tQuantity\tRate\tTotal Price\n");  
                     
                }  
               
               public void display()   
                {  
                    System.out.format("%s\t%d\t\t%.0f\t%.0f\n" , pname, qty, price, totalPrice);  
                }  
    }  
public class Project
    {  
        public static void main(String args[])   
            {  
                Scanner scan=new Scanner(System.in);
                String productName = null;  
                int quantity = 0;  
                double price = 0.0;  
                double totalPrice = 0.0;  
                double overAllPrice = 0.0;  
                double cgst, sgst, subtotal=0.0, discount=0.0;  
                char choice = '\0';  
               
               
                System.out.println("\n**********   WELCOME   ************\n");
                List<Product> product = new ArrayList<Product>();  
                do   
                    {  
                       
                        System.out.println("Enter the product details: ");  
                         
                        System.out.print("Product Name: ");  
                        productName = scan.nextLine();  
                        System.out.print("Quantity: ");  
                        quantity = scan.nextInt();  
                        System.out.print("Cost : ");  
                        price = scan.nextDouble();  
                        
                        totalPrice = price * quantity;  
                        
                        overAllPrice = overAllPrice + totalPrice;  
                       
                        product.add( new Product(productName, quantity, price, totalPrice) );  
                       
                        System.out.print("Want to add more items? (y or n): ");  
                        
                        choice = scan.next().charAt(0);  
                       
                        scan.nextLine();  
                    }   
                while (choice == 'y' || choice == 'Y');  
               
                Product.displayFormat();  
                for (Product p : product)   
                {  
                    p.display();  
                }  
                
                subtotal = overAllPrice-discount;   
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t                         TOTAL AMOUNT: "+subtotal);  
                
              
                 
                System.out.println("\n----------------Thank You for Shopping...!-----------------\n");  
                System.out.println("                     Visit Again:)");  
               
                scan.close();  
            }     
    }
