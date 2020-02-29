package houserentals.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import houserentals.dao.Service;
import houserentals.dto.RegisterProfile;
import housrentals.util.Validations;

@WebServlet("/login")
public class  LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		
		 PrintWriter out=response.getWriter();
			Validations validations=new Validations();
			Map<String,String> errorMessages=validations.loginValidate(email,password);
			if(errorMessages.size()>0) {
				request.setAttribute("errorMessages",errorMessages);
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}else {
		        Service service=new Service();
		        RegisterProfile loginDetails=service.save(email, password);
		        if(loginDetails!=null) {
		        	HttpSession session=request.getSession();
		        	session.setAttribute("loginDetails",loginDetails);
		        	response.sendRedirect("welcome.jsp");
		        	out.print("login successful");
		        }else {
		        	request.setAttribute("sqlError","Some internal error occured");
		        	request.getRequestDispatcher("login.jsp").forward(request, response);
		        }

			
		}
	}
}
