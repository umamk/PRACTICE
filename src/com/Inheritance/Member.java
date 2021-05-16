package com.Inheritance;

class Test  
{
	String Name;
	int Age;
	String PhoneNumber;
	String Address;
	int Salary;
	
	void printSalary() 
	{
	System.out.println(Salary);
	}
}
class Employee extends Test
{
	String Specialization;
}
class Manager extends Test
{
	String Department;
}
public class Member
{
	public static void main(String[] args) {
		Employee em = new Employee();
		em.Name = "Uma";
		em.Age = 55;
		em.PhoneNumber = "6789842972";		
		em.Address = "India";
		em.Salary = 80000;
		em.Specialization = "Developer";
		Manager ma = new Manager();
		System.out.println("Name:"+em.Name+" "+"Age:"+em.Age+" "+"PhoneNumber: "+em.PhoneNumber+" "+"Address:"+em.Address+" "+"Salary:"+em.Salary+" "+"Specialization:"+em.Specialization);
		ma.Name = "Usha";
		ma.Age = 65;
		ma.PhoneNumber = "6788578557";
		ma.Address = "India";
		ma.Salary = 909879;
		ma.Department = "IT";
		em.printSalary();
		ma.printSalary();
		System.out.println("Name:"+ma.Name+" "+"Age:"+ma.Age+" "+"PhoneNumber: "+ma.PhoneNumber+" "+"Address:"+ma.Address+" "+"Salary:"+ma.Salary+" "+"Department:"+ma.Department);
	}
}
/*It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class.
The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
 Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of 
 these classes and print the same.
*/
