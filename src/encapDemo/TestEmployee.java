package encapDemo;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.setAge(25656);
		emp1.setEmpid("265461");
		emp1.setName("Ajay");
	//	emp1.setOrgName("XYZ");
		emp1.setUid("2649-1546-4949");
		
		System.out.println(emp1.getAge());
		System.out.println(emp1.getEmpid());
		System.out.println(emp1.getName());
		System.out.println(emp1.getOrgName());
		System.out.println(emp1.getUid());
		
		
	}
}
