package mainpack;

class Employee {
	public void netSalary() {
		System.out.println("Employee Salary");
	}

}

class Intern extends Employee {
	public void netSalary() {
		System.out.println("Intern's Stipend");
	}
}

class Confirmed extends Employee {
	public void transport() {
		System.out.println("COnfirmed EMployee's Salary");
	}
}

class HR {
	public Employee recruit(String empType) {
		if (empType.equals("I")) {
			return new Intern();
		} else if (empType.equals("C")) {
			return new Confirmed();
		}
		return null;
	}
}


class Finance{
	public void processSalary(Employee emp){
		emp.netSalary();if(emp instanceof Confirmed){
			Confirmed conf = (Confirmed) emp;
			conf.transport();
		}
	}
}
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR hr = new HR();
		Finance finance = new Finance();
		
		Employee employee = hr.recruit("C");
		if (employee != null) {
			finance.processSalary(employee);
		}

		employee = hr.recruit("I");
		if (employee != null) {
			finance.processSalary(employee);
		}
		employee = hr.recruit("I");
		if (employee!=null){
			finance.processSalary(employee);
		}
	}

}
