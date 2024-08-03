package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class studentservlet extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String name = req.getParameter("username");
		String email = req.getParameter("email");
		String branch = req.getParameter("branch");
		PrintWriter pw = resp.getWriter();
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "root@123");
			String sql = "insert into register(username,email,branch) values(?,?,?)";
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, name);
			pmst.setString(2, email);
			pmst.setString(3, branch);
			
			int i = pmst.executeUpdate();
			if(i>0) {
				pw.println("Successfully Registered");
			}
			else {
				pw.println("Error");
			}
			conn.close();
			pmst.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
