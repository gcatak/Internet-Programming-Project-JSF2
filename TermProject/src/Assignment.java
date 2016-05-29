

public class Assignment {
	private int assId;
	private String assName;
	private String dueDate;
	private String assStatus;
	private String stuStatus;
	private int grade;
	public Assignment(int assId,String assName,String dueDate,String assStatus,String stuStatus,int grade){
		this.assId=assId;
		this.assName=assName;
		this.dueDate=dueDate;
		this.assStatus=assStatus;
		this.stuStatus=stuStatus;
		this.grade=grade;
	}
	public int getAssId() {
		return assId;
	}
	public void setAssId(int assId) {
		this.assId = assId;
	}
	public String getAssName() {
		return assName;
	}
	public void setAssName(String assName) {
		this.assName = assName;
	}
	public String getAssStatus() {
		return assStatus;
	}
	public void setAssStatus(String assStatus) {
		this.assStatus = assStatus;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getStuStatus() {
		return stuStatus;
	}
	public void setStuStatus(String stuStatus) {
		this.stuStatus = stuStatus;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
