/* COLLEGE INFORMATION SYSTEM */


import java.util.Scanner;

class Student{
    String firstname;
    String lastname;
    int day;
    int month;
    int year;
    int id;
    String gender;
    String rollno;
    String group;
    String number;
    String mail;
    String address;
    Scanner sc=new Scanner(System.in);
    
    void admission(int a){
       
        System.out.println("Enter your admission information below\n");
        System.out.print("Enter your first Name    : ");
        firstname=sc.nextLine();
        System.out.print("Enter your last Name     : ");
        lastname=sc.nextLine();
        System.out.print("Enter date of birth details \n");
        System.out.print("Enter date               : ");
        day =sc.nextInt();
        System.out.print("Enter month              : ");
        month =sc.nextInt();
        System.out.print("Enter year               : ");
        year =sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your Gender        : ");
        gender=sc.nextLine();
        System.out.print("Enter your branch        : ");
        group=sc.nextLine();
        System.out.print("Enter your mobile number : ");
        number=sc.nextLine();
        System.out.print("Enter your gmail         : ");
        mail=sc.nextLine();
        System.out.print("Enter your addres        : ");
        address=sc.nextLine();
        id=20200+a;
        System.out.println("Student id no          : "+id);
    }
    
    void studentdetails(int s){
        
        if(id==s){
            System.out.println();
            System.out.println("Your id          : "+id);
            System.out.println("Your name is     : "+firstname+" "+lastname);
            System.out.println("Date of birth is : "+day+"-"+month+"-"+year);
            System.out.println("Gender           : "+gender);
            System.out.println("Branch           : "+group);
            System.out.println("mobile number    : "+number);
            System.out.println("Mail id          : "+mail);
            System.out.println("Address          : "+address);
            
         }
    }
}
    
    class Employee{
        Scanner sc=new Scanner(System.in);
        String branchName;
        
        void lectureDeatils(){
            System.out.print("𝔼𝕟𝕥𝕖𝕣 𝔹𝕣𝕒𝕟𝕔𝕙 ℕ𝕒𝕞𝕖");
            System.out.print(" : ");
            branchName=sc.next();
            
            switch(branchName){
                case "ECE": 
                    System.out.println("NAME             : Sufiyan Khan");
                    System.out.println("ID NO            : 193");
                    System.out.println("DEP              : ECE");
                    System.out.println("QUALIFICATION    : PHD");
                    System.out.println("NUMBER           : 9912649073");
                    break;
                    
                case "CSE": 
                    System.out.println("NAME             : Sneha");
                    System.out.println("ID NO            : 194");
                    System.out.println("DEP              : CSE");
                    System.out.println("QUALIFICATION    : MTECH");
                    System.out.println("NUMBER           : 9912643553");   
                    break;
                    
                case "EEE": 
                    System.out.println("NAME             : Swathi");
                    System.out.println("ID NO            : 195");
                    System.out.println("DEP              : EEE");
                    System.out.println("QUALIFICATION    : PHD");
                    System.out.println("NUMBER           : 9912649644");
                    break;
                    
                case "MECH": 
                    System.out.println("NAME             : Swathi");
                    System.out.println("ID NO            : 195");
                    System.out.println("DEP              : MECH");
                    System.out.println("QUALIFICATION    : PHD");
                    System.out.println("NUMBER           : 9912649644");
                    break;
                    
                case "CIVIL": 
                    System.out.println("NAME             : Swathi");
                    System.out.println("ID NO            : 195");
                    System.out.println("DEP              : CIVIL");
                    System.out.println("QUALIFICATION    : PHD");
                    System.out.println("NUMBER           : 9912649644");
                    break;   
                    
                default:
                    System.out.println("Lecture details not found...");
                    break;
            }
        }
    }
    
    class Coursedetails{
        void availablebranches(){
            System.out.println("ＭＯＴＨＥＲ ＴＨＥＲＥＳＡ ＩＮＳＴＩＴＵＴＥ ＯＦ ＥＮＧＩＮＥＥＲＩＮＧ ＡＮＤ");
            System.out.println("\t\t\t ＴＥＣＨＮＯＬＯＧＹ");
            System.out.println();
            System.out.println("\nAvailable courses in our college\n ");
            System.out.println("1. ELECTRONICS AND COMMUNICATION ENGINEERING (ECE)..........⌨️💾.");
            System.out.println("2. COMPUTER SCIENCE AND ENGINEERING (CSE)...........🖥️💻");
            System.out.println("3. ELECTRICAL AND ELECTRONICS ENGINEERING (EEE)........💡🔌");
            System.out.println("4. MECHANICAL ENGINEERING (MECH).........🛠️⚒️");
            System.out.println("5. CIVIL ENGINEERING (CIVIL).........🏠🏢");
            System.out.println();
        }
        void feeDetails(String g){
            switch (g){
                case "CSE":
                    System.out.println("fee per year is : 110000💴");
                    System.out.println("Including library, crt and toution");
                    break;
                    
                case "ECE":
                    System.out.println("fee per year is : 67000💴");
                    System.out.println("Including library, crt and toution");
                    break;
                    
                case "EEE":
                    System.out.println("fee per year is : 60000💴");
                    System.out.println("Including library, crt and toution");
                    break;
                case "MECH":
                    System.out.println("fee per year is : 55000💴");
                    System.out.println("Including library, crt and toution");
                    break;
                    
                case "CIVIL":
                    System.out.println("fee per year is : 50000💴");
                    System.out.println("Including library, crt and toution");
                    break;
            }
        }
    }
    
public class Project3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         Coursedetails cd=new Coursedetails();
         Employee e=new Employee();
        System.out.println("\t\tＣｏｌｌｅｇｅ ｉｎｆｏｒｍａｔｉｏｎ ｓｙｓｔｅｍ🏢");
        System.out.println();
        int a;
        do{
        System.out.print("1.Course details💻\n2.Employee details 👥\n3.Student Admission📰\n4.Fee Details 💴\n5.Exit  ❌\n ");
        System.out.println();
        System.out.print("ENTER YOUR CHOICE : ");
        a=sc.nextInt();
        System.out.println();
             switch (a){
                case 1:
                    //  Coursedetails cd=new Coursedetails();
                     cd.availablebranches();
                     break;
                
                case 2:
                    //  Employee e=new Employee();
                     e.lectureDeatils();
                     System.out.println();
                     break;
                   
                case 3: 
                     System.out.println("\t\tＣＯＬＬＥＧＥ ＡＤＭＩＳＳＩＯＮ ＦＯＲＭ");
                    System.out.println("Enter the number of students to get admission :");
                    int num=sc.nextInt();
                    Student S[]=new Student[num];
                    for(int i=0;i<S.length;i++){
                    S[i]=new Student();
                    S[i].admission(i+1);
                    System.out.println();
                    System.out.println("\t\tＹｏｕｒ Ｆｏｒｍ Ｄｅｔａｉｌｓ");
                    S[i].studentdetails(20200+(i+1));
                    }
                    
                     break;
                    
                case 4:
                    System.out.println("Enter Course : ");
                    String c=sc.next();
                    cd.feeDetails(c);
                    break;
                    
                case 5:
                    System.out.print("𝓣𝓱𝓪𝓷𝓴 𝔂𝓸𝓾...!");
                    System.out.print("🙏");
                    a=5;
                    break;
                default:
                    System.out.println("Option not available...❎");
                    break;
                
            }
      }while(a!=5);
   }
}
