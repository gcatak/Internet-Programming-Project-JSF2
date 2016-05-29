import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;



@ManagedBean(name="passwordAction")
@ViewScoped
public class ChangePasswordAction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String oldPassword;
	private String newPassword;
	private String confirmPassword;
	private String mess1;
	private String mess2;
	public ChangePasswordAction(){
		
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String studentController() throws ClassNotFoundException, SQLException{
		FacesContext context = FacesContext.getCurrentInstance();
        //Application application = context.getApplication();
        StudentLogin user = context.getApplication().evaluateExpressionGet(context, "#{userStudent}", StudentLogin.class);
        mess1=null;
        mess2=null;
        String temp="Back";
        if(!oldPassword.trim().equals(user.getPassword())){
        	mess1="Old password is wrong";
        	temp=null;
        }
        if(!newPassword.trim().equals(confirmPassword.trim())){
        	mess2="New password and confirm password is not equal";
        	temp=null;
        }
        if(temp!=null){
        	Class.forName("com.mysql.jdbc.Driver");
  	  		Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/termProjectdb",
  	            "root", "root2");
  	  		Statement st = con.createStatement();
  	  		st.executeUpdate("UPDATE Student " +
                   "SET password ='"+newPassword+"' WHERE student_id='"+user.getStudentId()+"'");
  	  		user.setPassword(newPassword);
  	  		con.close();
        }
        return temp;
	}
	public String getMess1() {
		return mess1;
	}
	public void setMess1(String mess1) {
		this.mess1 = mess1;
	}
	public String getMess2() {
		return mess2;
	}
	public void setMess2(String mess2) {
		this.mess2 = mess2;
	}
	
}
