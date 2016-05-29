import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseId;
	private String courseName;
	private List<String> instructor = new ArrayList<String>();
	private List<String> grader = new ArrayList<String>();
	private String status;

	public Course(String id, String name,String sta,List<String> ins,List<String> gra){
		this.courseId = id;
		this.courseName = name;
		this.instructor=ins;
		this.status=sta;
		this.grader=gra;
	}

	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String id) {
		this.courseId = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String name) {
		this.courseName = name;
	}

	public List<String> getInstructor() {
		return instructor;
	}

	public void setInstructor(List<String> instructor) {
		this.instructor = instructor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getGrader() {
		return grader;
	}

	public void setGrader(List<String> grader) {
		this.grader = grader;
	}

}
