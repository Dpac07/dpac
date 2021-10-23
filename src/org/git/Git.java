package org.git;

public class Git {
	public void empid() {
		System.out.println("emp id is 123");
			}
private void empName() {
System.out.println("emp name is xyz");

}
//<<<<<<< HEAD
private void companyName() {
	System.out.println("company name is greens");
}
//=======
private void empNumber() {
	System.out.println("employee number is");
//>>>>>>> 2fbf55efe48a410b69bd6e5b0b6a675f1d38585c
}
public static void main(String[] args) {
	Git g=new Git();
	g.empid();
	g.empName();
}
}
