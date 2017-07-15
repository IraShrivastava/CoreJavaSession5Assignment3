package assignment5;

public class TemporaryEmp extends Employee 
{
	int no_of_leaves;	// initializing number of leave variable
	TemporaryEmp(int empId, String empName, int total_leaves, double total_Salary) // initializing parameterized constructor
	{
		super(empId, empName, total_leaves, total_Salary);	// calling abstract parent class constructor
	}
	void calculate_balance_leaves() 
	{
		int balance_leaves = total_leaves - no_of_leaves;	// initializing balance leave variable
		System.out.println("Total Leaves Allowed: "+ total_leaves);
		System.out.println("Balance leave for " + empName + " is " + balance_leaves);	// prints Balance leave for employee name is balance leave
	}
	boolean avail_leave(int no_of_leaves, char type_of_leave) 
	{
		this.no_of_leaves = no_of_leaves;
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
		System.out.println("Total salary for " + empName + " is " + total_Salary);	// prints Total salary for employee name is total salary
	}
}
