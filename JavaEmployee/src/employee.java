
package JavaEmployeeApp;

import java.util.Scanner;
//this is the super class
class employee {
public static int grosssalary;
public static int salary;
public static int netsalary;
public  static int hour;
public static int tax;
public static int RSSB;
public static int deduction;
public static int hours;
public static int extrahour;
public static int rate;
public static int grosssalaryweek;
public static void main(String args[])
 {
System.out.println("PLEASE ENTER GROSS SALARY AMOUNT");
Scanner in = new Scanner(System.in);
System.out.println("PLEASE ENTER NUMBER OF HOURS WORKED PER WEEK");
int salary = in.nextInt();
	
	
int hours = in.nextInt();
extrahour = hours - 40;
rate = extrahour * 10 *salary/100;

if (hours > 40)
grosssalaryweek = (salary * 40) + rate ;
else
grosssalaryweek = hours * salary ;

tax=(25*salary)/100;
RSSB=(5*salary)/100;
deduction=tax-RSSB;

grosssalary=salary*160;
netsalary=grosssalary-deduction;
System.out.println("EXTRA HOURS FOR 40 HOURS " +extrahour);
System.out.println("ADDITIONAL RATE:" +rate);
System.out.println("HOURLY SALARY " +salary*8);
System.out.println("WEEKLY SALARY:" +grosssalaryweek);
System.out.println("MONTHLY SALARY: "+netsalary);
}
		
}

class hourlyEmployee extends employee{

public  int hoursalary( ) {
System.out.println("PLEASE ENTER WAGE AMOUNT");
Scanner in = new Scanner(System.in);
int salary = in.nextInt();
return salary*8;		
	
}
// declaration of new child class.
class weeklyEmployee extends employee{
public  int weeklysalary()

{
System.out.println("PLEASE ENTER WAGE AMOUNT");
Scanner in = new Scanner(System.in);
int salary = in.nextInt();
grosssalary = salary*40;
return grosssalary;
	
}
}
// declaration of new child class.
	
class monthlyEmployee extends employee{

public  int monthlysalary() {
System.out.println("PLEASE ENTER SALARY AMOUNT");
Scanner in = new Scanner(System.in);
int salary = in.nextInt();
tax = (25*salary)/100;
RSSB = (5*salary)/100;
deduction = tax-RSSB;
grosssalary = salary*160;
netsalary = grosssalary-deduction;
return  netsalary;
}		
}


public static void main(String args[]){
	
System.out.println("enter the salary amount");
Scanner in = new Scanner(System.in);
int salary = in.nextInt();
int grossalary = in.nextInt();
int netsalary = in.nextInt();
System.out.println("grosssalary:"+ grosssalary);
System.out.println("netsalary:"+ netsalary);
System.out.println("salary" +salary*8);
}
}


 







