	

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.faces.bean.*;

@ManagedBean(name="userStudent")
@SessionScoped
public class StudentLogin implements Serializable { 
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String studentId, password;
  private String message;
  private Course selectedCourse;
  private Assignment selectedAss;
  private boolean loggedIn;
  public String getStudentId() {
    return(studentId);
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId.trim();
    if (this.studentId.isEmpty()) {
      this.studentId = "(none entered)";
    }
  }

  public String getPassword() {
	  return(password);
  }

  public void setPassword(String password) {
    this.password = password;
  }
  
  public String getMessage() {
	    return(message);
	  }

	  public void setMessage(String message) {
	    this.message = message;
	  }
  
 

  public String loginControl() throws ClassNotFoundException, SQLException {
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/termProjectdb",
	            "root", "root2");
	    Statement st = con.createStatement();
	    ResultSet rs;
	    
	    rs = st.executeQuery("select student_id from Student where student_id='"+studentId+
	    		"' and password='"+password+ "' and state='open'");
    if (rs.next()==false) {
      message="such entry not found";
      return null;
    }
    message=null;
    loggedIn=true;
    return ("Student_Course_Page");
  }

public boolean isLoggedIn() {
	return loggedIn;
}

public void setLoggedIn(boolean loggedIn) {
	this.loggedIn = loggedIn;
}

public Course getSelectedCourse() {
	return selectedCourse;
}

public String setSelectedCourse(Course selectedCourse) {
	this.selectedCourse = selectedCourse;
	return "Student_Assignment_Page";
}

public Assignment getSelectedAss() {
	return selectedAss;
}

public void setSelectedAss(Assignment selectedAss) {
	this.selectedAss = selectedAss;
}
}