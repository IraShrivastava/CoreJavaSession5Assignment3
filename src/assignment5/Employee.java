package assignment5;
public abstract class Employee 
{
	int empId;	// declaring employee id variable of type integer
	String empName;	// declaring employee name variable of type String
	int total_leaves;	// declaring total leaves variable of type integer
	double total_Salary;	// declaring total salary variable of type double
	Employee(int empId, String empName, int total_leaves, double total_Salary)		// defining parameterized constructor
	{
		this.empId = empId;		// setting employee id
		this.empName = empName;		// setting employee name
		this.total_leaves = total_leaves;		// setting total leaves
		this.total_Salary = total_Salary;		// setting total salary
	}
	abstract void calculate_balance_leaves();		// declaring abstract method for calculating balance leaves
	abstract boolean avail_leave(int no_of_leaves, char type_of_leave);		// declaring abstract method for checking available leaves
	abstract void calculate_salary();		// declaring abstract method for calculating total salary
}