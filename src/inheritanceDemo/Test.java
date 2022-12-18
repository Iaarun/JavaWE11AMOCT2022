package inheritanceDemo;

public class Test {
	public static void main(String[] args) {
            HR sam = new HR();
           sam.department="HR";
           
           
           Developer dev1 = new Developer();
           dev1.skillSet = "Java";
           dev1.salary = 50000;
           
           
           JrDeveloper jdev = new JrDeveloper();
           
           jdev.department = "Dev";
           jdev.skillSet= "JavaScript";
           jdev.workingonProject();
           
	}
}
