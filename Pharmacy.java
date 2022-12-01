/* PHARMACY MANAGEMENT SYSTEM*/

import java.util.Scanner;
class Management
{
    private String id;
    private String name;
    private int age;
    private String  disease;
    Scanner sc=new Scanner(System.in);
    //To create membership
    void details()
    {
        System.out.println("-------**PATIENT DETAILS**------");
        System.out.println("       Enter id number👍          :             ");
        id=sc.nextLine();
        System.out.println("       Enter Name of the patient😊:       ");
        name=sc.nextLine();
        System.out.println("       Enter age of the patient👌 :       ");
        age=sc.nextInt();
        System.out.println("       Enter name of the disease😒:       ");
        disease=sc.next();
        
    }
    //METHOD TO DISPLAY THE PATIENT DETAILS
    void showdetails()
    {
        System.out.println("------DETAILS OF THE PATIENT------- ");
        System.out.println("      PATIENT ID      :  "+id);
        System.out.println("      PATIENT NAME    :  "+name);
         System.out.println("     PATIENT AGE     :  "+age);
          System.out.println("    PATIENT DISEASE :  "+disease);
    }
    //METHOD TO HEADACHE
    void headache()
    {
        System.out.println("------HEADACHE MEDICINES & COST------");
        if(age<=20)
        {
             System.out.println("           SARIDON         :    Rs-5");
              System.out.println("          VICKS ACTOIN 500:    Rs-7");
               System.out.println("         MIGREST         :    Rs-20");
        }
        else
        {
             System.out.println("       DOLO 650  :   Rs-5");
              System.out.println("      DART      :   Rs-10");
               System.out.println("     NAPROXEN  :   Rs-20");
        }
       
    }
   //METHOD TO COUGH
    void cough()
    {
        System.ou
        {
             System.out.println("      COUGH RELIEF    :  Rs-5");
              System.out.println("     COFSILS         :  Rs-7");
               System.out.println("    CHESTON_COLD    :  Rs-20");
        }
        else
        {
             System.out.println("       CETRIZNE    :  Rs-5");
              System.out.println("      DOLOCOLD    :  Rs-10");
               System.out.println("     SNEEZY      :  Rs-20");
        }
       
    } 
     void fever()
    {
        System.out.println("------FEVER MEDICINES & COST------");
        if(age<=20)
        {
             System.out.println("     PARACETOMOL :   Rs-5");
              System.out.println("    ASPRIN      :   Rs-7");
               System.out.println("   PAINTRIEF   :   Rs-20");
        }
        else
        {
             System.out.println("    SIRIDON   :   Rs-5");
              System.out.println("   ADVIL     :   Rs-10");
               System.out.println("  CALPOL-650:   Rs-20");
        }
       
    } 
     void stomachache()
    {
        System.out.println("------STOMACHACHE MEDICINES & COST------");
        if(age<=20)
        {
             System.out.println("   SPASMONIL  :  Rs-5");
              System.out.println("  BUSCOGOST  :  Rs-7");
             
        }
        else
        {
             System.out.println("    OMEPRAZOLE   :  Rs-5");
              System.out.println("   IMODIUM      :  Rs-10");
               System.out.println("  DIGESTOMAX   :  Rs-20");
        }
       
    } 
     void muscleache()
    {
        System.out.println("------MUSCLEACHE MEDICINES & COST------");
        if(age<=20)
        {
             System.out.println("   ACYLOFEN   :   Rs-5");
              System.out.println("  AYUNAC     :   Rs-7");
               System.out.println(" LIGATONE   :   Rs-20");
        }
        else
        {
             System.out.println("    CROCIN      :  Rs-5");
              System.out.println("   CRAMPNIL    :  Rs-10");
               System.out.println("  PAIN RELEIF :  Rs-20");
        }
       
    } 
}
//MAIN METHOD
public class Project extends Management
{
    public static void main(String args[])
    {
        Scanner sc1=new Scanner(System.in);
        //PHARMACY MANAGEMENT SYSTEM
        System.out.println( "           ❤️‍🩹----PHARMACY MANAGEMENT SYSTEM-------❤️‍🩹"       );
         System.out.println("No.of patients:");
         int a=sc1.nextInt();
         Management m[]=new Management[a];
         int i;
         for(i=0;i<m.length;i++)
         {
             m[i]=new Management();
             m[i].details();
         }
         int n;
         do{
        System.out.println("CHOOSE SPECIFIC OPTION FOR SPECIFIC TASK");
        System.out.println("MAIN MENU: \n 1.TO SHOW PATIENT DETAILS \n 2.HEADACHE \n 3.COUGH&COLD \n 4.FEVER \n 5.STOMACH ACHE \n 6.MUSCLE ACHE \n 7.EXIT");
         n=sc1.nextInt();
        
        switch👎
        {
           
        
              case 1:
                  for(i=0;i<m.length;i++)
                  {
                    m[i].showdetails();
                  }
                   break;
            case 2:
                 for(i=0;i<m.length;i++)
                  {
                    m[i].headache();
                  }
                   break;
             case 3:
                  for(i=0;i<m.length;i++)
                  {
                    m[i].cough();
                  }
                   break;
             case 4:
                  for(i=0;i<m.length;i++)
                  {
                    m[i].fever();
                 }
                   break;
                
             case 5: 
                 for(i=0;i<m.length;i++)
                  {
                    m[i].stomachache();
                  }
                   break;
             case 6:
                 for(i=0;i<m.length;i++)
                  {
                    m[i].muscleache();
                  }
                   break;    
             case 7:
                 
                   System.out.println("HAVE A NICE DAY TAKE CARE ABOUT YOUR HELTH");
                   break;
                     
                
        }
   
         }while(n!=8);
    }
}t.println("------COUGH & COLD MEDICINES & COST------");
        if(age<=20)
