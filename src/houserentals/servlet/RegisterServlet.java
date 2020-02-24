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

import houserentals.dto.RegisterProfile;
import housrental.util.Validations;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname=request.getParameter("fullname");
		String email=request.getParameter("email");
		String mobileno=request.getParameter("mobileno");
		String owner=request.getParameter("owner");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String confirmPassword=request.getParameter("confirmPassword");
		
		RegisterProfile profile=new RegisterProfile();
		profile.setFullName(fullname);
		profile.setEmail(email);
		profile.setMobileno(mobileno);
		profile.setOwner(owner);
		profile.setUsername(username);
		profile.setPassword(password);
		profile.setConfirmPassword(confirmPassword);
		
	    PrintWriter out=response.getWriter();
		Validations validations=new Validations();
		Map<String,String> errorMessages=validations.validate(profile);
		if(errorMessages.size()>0) {
			request.setAttribute("errorMessages",errorMessages);
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}else {
		EntityManagerFactory entityManagerFactor=Persistence.createEntityManagerFactory("houserental");
		EntityManager entityManager=entityManagerFactor.createEntityManager();
		EntityTransaction transcation=entityManager.getTransaction();
		out.println("Inserted");
		try {
			transcation.begin();
			entityManager.persist(profile);
			transcation.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transcation.rollback();
		}finally {
			entityManager.close();
			entityManagerFactor.close();
		}
		}
	}

}
