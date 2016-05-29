import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
@ManagedBean(name="courseDatas")
@ViewScoped
public class CourseDataTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public List<Course> getCourses() throws ClassNotFoundException, SQLException {
		List<Course> courses=new ArrayList<Course>();
		FacesContext context = FacesContext.getCurrentInstance();
        StudentLogin user = context.getApplication().evaluateExpressionGet(context, "#{userStudent}", StudentLogin.class);
        Class.forName("com.mysql.jdbc.Driver");
	  		Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/termProjectdb",
	            "root", "root2");
	  	Statement st = con.createStatement();
	  	Statement st2 = con.createStatement();
	  	Statement st3 = con.createStatement();
	  	ResultSet crs=st.executeQuery("select course_id,name,state from Courses_of_Students "+
	  	"where student_id='"+user.getStudentId()+"'");
	  	while(crs.next()){
	  		String temp=crs.getNString("course_id");
	  		ResultSet inst=st2.executeQuery("select full_name from Courses_of_Instructors "+
	  				"where course_id='"+temp+"'");
	  		List<String> ins=new ArrayList<String>();
	  		while(inst.next()){
	  			ins.add(inst.getNString("full_name"));
	  		}
	  		ResultSet grd=st3.executeQuery("select full_name from Courses_of_Graders "+
	  				"where course_id='"+temp+"'");
	  		List<String> gra=new ArrayList<String>();
	  		while(grd.next()){
	  			gra.add(grd.getNString("full_name"));
	  		}
	  		courses.add(new Course(crs.getNString("course_id"),crs.getNString("name"),
	  				crs.getNString("state"),ins,gra));
	  	}
	  	con.close();
	  	st.close();
	  	st2.close();
	  	st3.close();
		return courses;
	}

	

}
