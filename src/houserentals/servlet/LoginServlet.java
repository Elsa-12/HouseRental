package houserentals.servlet;

import java.io.IOException;
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

import houserentals.dto.RegisterProfile;
import housrental.util.Validations;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		
		Validations validations=new Validations();
		boolean loginProfile=validations.validate(email,password);
		

		if (loginProfile) {
			request.setAttribute("loginProfile", loginProfile);
			request.setAttribute("sqlError", "No Record exited with "+email);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			EntityManagerFactory entityManagerFactor=Persistence.createEntityManagerFactory("houserental");
			EntityManager entityManager=entityManagerFactor.createEntityManager();
			
			
		}
	}
}
