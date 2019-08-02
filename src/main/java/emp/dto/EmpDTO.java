package emp.dto;

public class EmpDTO {
	private String id;
	private String pass;
	private String name;
	private String addr;
	private String hiredate;
	private String grade;
	private int point;
	private String deptNo;
	public EmpDTO(){
		
	}
	public EmpDTO(String id, String pass, String name, String addr,
			String grade, String deptNo) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
		this.grade = grade;
		this.deptNo = deptNo;
	}

	public EmpDTO(String id, String pass, String name, String addr,
			String hiredate, String grade, int point, String deptNo) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
		this.hiredate = hiredate;
		this.grade = grade;
		this.point = point;
		this.deptNo = deptNo;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "EmpDTO [id=" + id + ", name=" + name + ", pass=" + pass
				+ ", hiredate=" + hiredate + ", grade=" + grade + ", point="
				+ point + ", deptNo=" + deptNo + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	
}
