package assignment5;

public class Assignment5_5
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PermanentEmp emp1 = new PermanentEmp(1, "Samar", 20, 0, 25000, 2, 4, 8);	// creating object instance for permanent employee class
		TemporaryEmp emp2 = new TemporaryEmp(2, "Akira", 15, 17000);	// creating object instance for temporary employee class
		System.out.println("Employee Id: " + emp1.empId + "\n" + "Employee Name: " + emp1.empName + "\n" + "Basic salary is " + emp1.basic);
		emp1.calculate_salary();	// calling calculate salary method for permanent employee
		emp1.print_leave_details();	// calling print leave details method in permanent employee class
		emp1.avail_leave(5, 's');	// calling available leave method in permanent employee class
		System.out.println("Employee Id: " + emp2.empId + "\n" + "Employee Name: " + emp2.empName);
		emp2.calculate_salary();	// calling calculate salary method for temporary employee
		emp2.calculate_balance_leaves();	// calling calculate balance leave method for temporary employee
	}
}