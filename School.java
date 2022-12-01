/* ATTENDANCE MANAGEMENT SYSTEM  */



import java.util.*;
class School
{
    public String id;
    public String name;
    public String strd;
    public String month;
    public int wd;
    public int pd;
    public int n;
    public int sum=0;
    public char s; 
    Scanner sc1=new Scanner(System.in);
    void studententry()
    {
        System.out.println("Enter Student Id");
        id=sc1.nextLine(); 
        System.out.println("Enter Student Name");
        name=sc1.nextLine(); 
        System.out.println("Enter the Class");
        strd=sc1.nextLine();
    	System.out.println("Enter how many months you want to enter attendence");
    	int n=sc1.nextInt();
    	for(int i=1;i<=n;i++)
	    { 
	        System.out.println("Enter the month for attendence");
	        String month=sc1.next();
            System.out.println("No'of Working Days ");
            int wd=sc1.nextInt();
        }
    }
    void studetails()
    {
        System.out.println(" ");   
        System.out.println("Student name: "+name);
        System.out.println("Id number: "+id);
        System.out.println("Class: "+strd);
    }
    void dailyattendence()
    {
        System.out.println("Student name: "+name);
        System.out.println("Enter the Student Present or Absent");
        char s=sc1.next().charAt(0);
        if(s=='p')
        {
            sum=sum+1;
        }
        else
        sum=sum;
    }
    void attendence()
    {
     for (int i=1;i<=n;i++)
        System.out.println("Month: "+month);
	    System.out.println("No'of present: "+sum);
	    System.out.println("Total Absents: "+(25-sum));
	}
    boolean search(String id1)
    {
        if(id.equals(id1))
        {
            studetails();
            return true;
        }
        return(false);
    }
}
public class Project3
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("########  WELCOME TO ATTENDANCE SHEET ########");
    System.out.println("Enter the no'of students for Entry");
    int n=sc.nextInt();
    School C[]=new School[n];
    for(int i=0;i<C.length;i++)//01234
    {
        C[i]=new School();
        C[i].studententry();
    }

    int ch;
    do
    {
        System.out.println("**X*X**");
        System.out.println("Main Menu\n1.StudentEntry\n2.StudentDetails\n3.Daily Attendence\n4.Attendence\n5.Exit");
        System.out.println("Enter a Choice From Given:");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            for(int i=0;i<C.length;i++)
            {
                C[i].studententry();
            }
            break;
            case 2:
                System.out.println("Enter the Id");
                String id1=sc.next();
                boolean found=false;
                for(int i=0;i<C.length;i++)
                {
                    found=C[i].search(id1);
                    if(found)
                    {
                        break;
                    }
                }
                if(!found)
                    System.out.println("Id Error:");
                    break;
            case 3:
                System.out.println(" Enter id Number:");
                id1=sc.next();
                found=false;
                for(int i=0;i<C.length;i++)
                {
                    found=C[i].search(id1);
                    if(found)
                    {
                        C[i].dailyattendence();
                        break;
                    }
                }
                if(!found)
                {
                  System.out.println("Id error");   
                }
                break;
            case 4:
                System.out.println(" Enter id Number:");
                id1=sc.next();
                found=false;
                for(int i=0;i<C.length;i++)
                {
                    found=C[i].search(id1);
                    if(found)
                    {
                        C[i].attendence();
                        break;
                    }
                }
                if(!found)
                {
                  System.out.println("Id error");   
                }
                break;
            case 5:
                System.out.println("Good Byeeee........!!!!!");
                break;
        }
    }while(ch!=5);
  }
}

