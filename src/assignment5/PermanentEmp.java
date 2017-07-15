package assignment5;

public class PermanentEmp extends Employee
{
	int paid_leave, sick_leave, casual_leave;	// initializing type of leave variables
	double basic, hra, pfa;	// initializing double data member variables to calculate salary
	PermanentEmp(int empId, String empName, int total_leaves, double total_Salary, double basic, int paid_leave, int sick_leave, int casual_leave)	// initializing parameterized constructor
	{
		super(empId, empName, total_leaves, total_Salary);// calling parent abstract class
		this.basic = basic;// setting basic value
		this.paid_leave = paid_leave;// setting paid leave value
		this.sick_leave = sick_leave;// setting sick leave value
		this.casual_leave = casual_leave;// setting casual leave value
	}
	void calculate_balance_leaves() 
	{
		int balance_leaves = total_leaves - sick_leave - casual_leave - paid_leave;		// initializing balance leave variable
		System.out.println("Balance leave for " + empName + " is " + balance_leaves);	// prints Balance leave for employee name is balance leave
	}
	boolean avail_leave(int no_of_leaves, char type_of_leave) 
	{
		if (no_of_leaves > total_leaves) 
		{
			return false;
		} 
		else 
		{
			return true;
		}
	}
	void calculate_salary() 
	{
		pfa = 12 * basic / 100;	// calculating pfa
		hra = 50 * basic / 100;	// calculating hra
		total_Salary = basic + hra - pfa;	// calculating total salary using hra and pfa
		System.out.println("Total Salary " + total_Salary);	// prints Salary after pf and hra is 20700.0
	}
	public void print_leave_details() 		// declaring print leave details method
	{
		System.out.println("Total Leaves Allowed: " + total_leaves);	// prints Total leaves Allowed: total leaves
		calculate_balance_leaves();	// calling balance leave method
	}
}