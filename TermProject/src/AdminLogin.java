	

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.faces.bean.*;

@ManagedBean(name="usersAdmin")
@SessionScoped
public class AdminLogin implements Serializable { 
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String adminID, password;
  private String message;
  private Course selectedCourse;
  private Assignment selectedAss;
  private boolean loggedIn;
  public String getAdminID() {
    return(adminID);
  }

  public void setAdminID(String adminID) {
    this.adminID = adminID.trim();
    if (this.adminID.isEmpty()) {
      this.adminID = "(none entered)";
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
	    
	    rs = st.executeQuery("select name from admin where name='"+adminID+
	    		"' and password='"+password + "'");
    if (rs.next()==false) {
      message="such entry not found";
      return null;
    }
    message=null;
    loggedIn=true;
    return null;
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