package newhibernate_ex.newhibernate;

public class Employee {
	private int id;
	private String empName;
	private String branch;
	public Employee(int id, String empName, String branch) {
		super();
		this.id = id;
		this.empName = empName;
		this.branch = branch;
	}
	public Employee(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", branch=" + branch + "]";
	}
}
