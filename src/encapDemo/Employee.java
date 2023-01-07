package encapDemo;
//POJO- : Plain old Java Object
public class Employee {
	
	 Employee() {
		// TODO Auto-generated constructor stub
	}

	private String uid;
	private String empid;
	private String orgName= "XYZ";
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=18 && age <=60) {
			this.age = age;
		}else {
			System.out.println("Invalid age");
		}
		
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getOrgName() {
		return orgName;
	}
//	public void setOrgName(String orgName) {
//		this.orgName = orgName;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
