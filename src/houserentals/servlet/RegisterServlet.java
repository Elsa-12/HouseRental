package houserentals.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import houserentals.dao.Service;
import houserentals.dto.RegisterProfile;
import housrentals.util.Validations;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname=request.getParameter("fullname");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String owner=request.getParameter("owner");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String confirmpassword=request.getParameter("confirmpassword");
		
		RegisterProfile profile=new RegisterProfile();
		profile.setFullname(fullname);
		profile.setEmail(email);
		profile.setMobile(mobile);
		profile.setOwner(owner);
		profile.setUsername(username);
		profile.setPassword(password);
		profile.setConfirmpassword(confirmpassword);
		
	    PrintWriter out=response.getWriter();
		Validations validations=new Validations();
		Map<String,String> errorMessages=validations.validate(profile);
		if(errorMessages.size()>0) {
			request.setAttribute("errorMessages",errorMessages);
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}else {
			  Service service=new Service();
		       RegisterProfile registerDetails=service.register(profile);
		        if(registerDetails !=null) {
		        	//request.setAttribute("registerDetails",registerDetails);
		        	request.getRequestDispatcher("login.jsp").forward(request, response);
		        	out.print("registration successful");
		        }else {
		        	request.setAttribute("sqlError","Some internal error occured");
		        	request.getRequestDispatcher("register.jsp").forward(request, response);
		        }
		}
	}

}
