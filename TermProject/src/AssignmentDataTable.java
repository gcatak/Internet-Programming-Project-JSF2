//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class AssignmentDataTable implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public List<Assignment> getAssignments() throws ClassNotFoundException, SQLException{
		List<Assignment> assignments=new ArrayList<Assignment>();
		FacesContext context = FacesContext.getCurrentInstance();
        StudentLogin user = context.getApplication().evaluateExpressionGet(context, "#{userStudent}", StudentLogin.class);
        Class.forName("com.mysql.jdbc.Driver");
	  	Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/termProjectdb",
	            "root", "root2");
	  	Statement st=con.createStatement();
	  	Statement st2=con.createStatement();
	  	Statement st3=con.createStatement();
	  	
	  	ResultSet assgn=st.executeQuery("select assignment_id,name,due_date,state from Assignment where "
	  			+ "Course_course_id='"+user.getSelectedCourse().getCourseId()+"'");
	  	while(assgn.next()){
	  		ResultSet stuAss=st2.executeQuery("select state,grade from Student_has_Assignment"
	  				+ " where Student_student_id='"+user.getStudentId()+"'");
	  		if(!stuAss.next()){
	  			st3.executeUpdate("insert into Student_has_Assignment values("+assgn.getInt("assignment_id")+","
	  		+user.getStudentId()+",'new',0)");
	  			assignments.add(new Assignment(assgn.getInt("assignment_id"),
	  					assgn.getString("name"), assgn.getString("due_date"),
	  					assgn.getString("state"), "new",0));
	  		}
	  		else{
	  			assignments.add(new Assignment(assgn.getInt("assignment_id"),
	  					assgn.getString("name"), assgn.getString("due_date"),
	  					assgn.getString("state"), stuAss.getString("state"),stuAss.getInt("grade")));
	  		}
	  	}
	  	con.close();
	  	st.close();
	  	st2.close();
	  	st3.close();
		return assignments;
	}
}
