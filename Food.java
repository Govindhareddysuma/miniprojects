/*  FOOD ORDERING SYSTEM */

import java.util.Scanner;
public class Project 
{
    public static Scanner input=new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu()
    {
        System.out.println("***********************************");
      System.out.println("    WELCOME TO CARROTS FAST FOODS:  ");
      System.out.println("           MENU CARD      ");
      System.out.println("1.Pizza:Rs.150");
      System.out.println("2.KFC:RS.350");
      System.out.println("3.Egg Rice:RS.90");
      System.out.println("4.Gobi:Rs.80");
      System.out.println("5.Ice Cream:Rs.70");
      System.out.println("6.Cool Drinks:Rs.50");
      System.out.println("7.Cancel");
      System.out.println("  ==============================================  ");
    }
    public static void order()
    {
      System.out.println("Press 1 to Pizza , Press 2 to KFC , Press 3 to Egg Rice , Press 4 to Gobi , Press 5 to Ice Cream , Press 6 to Cool Drinks , Press 7 to Cancel ");
      System.out.print("Press you want to buy? :");
      choose = input.nextInt();
      //conditions
      if(choose==1)
      {
        System.out.println("You choose Pizza");
        System.out.print("How many Plates you want to Buy? :");
        quantity =input.nextInt();
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        total = total +(quantity*150);
        if(again.equalsIgnoreCase("Y"))
        {
            order();//call the method you to create 
        }
        else
        {
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <total)
            {
              System.out.println("Not enough payment");
              System.out.println("So your order is canceled");
            }
            else
            {
            System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
      }
      else if(choose==2)
      {
        System.out.println("You choose KFC");
        System.out.print("How many buckets you want to Buy? :");
        quantity =input.nextInt();
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        total = total +(quantity*150);
        if(again.equalsIgnoreCase("Y"))
        {
            order();//call the method you to create 
        }
        else
        {
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <total) 
            {
              System.out.println("Not enough payment"); 
              System.out.println("So your order is canceled");
            }
            else
            {
              System.out.println("Total price is " + total);
              total = pay-total;
              System.out.println("The change is " + total);
            }
        }
      }
      else if(choose==3)
      {
        System.out.println("You choose Egg Rice");
        System.out.print("How many plates you want to Buy? :");
        quantity =input.nextInt();
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        total = total +(quantity*150);
        if(again.equalsIgnoreCase("Y"))
        {
            order();//call the method you to create 
        }
        else
        {
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <total) 
            {
              System.out.println("Not enough payment");
              System.out.println("So your order is canceled");
            }
            else
            {
              System.out.println("Total price is " + total);
              total = pay-total;
              System.out.println("The change is " + total);
            }
        }
      }
      else if(choose==4)
      {
        System.out.println("You choose Gobi");
        System.out.print("How many plates you want to Buy? :");
        quantity =input.nextInt();
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        total = total +(quantity*150);
        if(again.equalsIgnoreCase("Y"))
        {
            order();//call the method you to create 
        }
        else
        {
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <total) 
            {
              System.out.println("Not enough payment"); 
              System.out.println("So your order is canceled");
            }
            else
            {
              System.out.println("Total price is " + total);
              total = pay-total;
              System.out.println("The change is " + total);
            }
        }
      }
      else if(choose==5)
      {
        System.out.println("You choose Ice Cream");
        System.out.print("How many cups you want to Buy? :");
        quantity =input.nextInt();
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        total = total +(quantity*150);
        if(again.equalsIgnoreCase("Y"))
        {
            order();//call the method you to create 
        }
        else
        {
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <total) 
            {
              System.out.println("Not enough payment");
              System.out.println("So your order is canceled");
            }
            else
            {
              System.out.println("Total price is " + total);
              total = pay-total;
              System.out.println("The change is " + total);
            }
        }
      }
      else if(choose==6)
      {
        System.out.println("You choose Cool Drinks");
        System.out.print("How many bottles you want to Buy? :");
        quantity =input.nextInt();
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        total = total +(quantity*150);
        if(again.equalsIgnoreCase("Y"))
        {
            order();//call the method you to create 
        }
        else
        {
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <total) 
            {
              System.out.println("Not enough payment");
              System.out.println("So your order is canceled");
            }
            else
            {
              System.out.println("Total price is " + total);
              total = pay-total;
              System.out.println("The change is " + total);
            }
        }
      }
      else if(choose==7){
        System.exit(0);//close program
    }
    else
    {
        System.out.println("Choose 1 to 7 only!");
        order();
    }
    }
    public static void main(String[] args) 
    {
       menu();
       order();
    } 
}
