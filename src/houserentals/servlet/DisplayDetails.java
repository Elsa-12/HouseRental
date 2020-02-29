package houserentals.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import houserentals.dao.Service;
import houserentals.dto.RegisterProfile;


@WebServlet("/display")
public class DisplayDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RegisterProfile rental = (RegisterProfile) session.getAttribute("profile");
		PrintWriter out = response.getWriter();
		Service service = new Service();
	}
	}
