package houserentals.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import houserentals.dao.Service;
import houserentals.dto.AddRentalProfile;
import houserentals.dto.RegisterProfile;
import housrentals.util.Validations;

@WebServlet("/addhouserental")
public class AddHouseRental extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		RegisterProfile user=(RegisterProfile)session.getAttribute("profile");
		String house=request.getParameter("house");
		String squareFeet=request.getParameter("squareFeet");
		String rentalCost=request.getParameter("rentalCost");
		String parkingAvaliable=request.getParameter("parkingAvaliable");
		String garden=request.getParameter("garden");
		String address=request.getParameter("address");
		
		AddRentalProfile rental=new AddRentalProfile();
		rental.setHouse(house);
		rental.setSquareFeet(squareFeet);
		rental.setRentalCost(rentalCost);
		rental.setParkingAvaliable(parkingAvaliable);
		rental.setGarden(garden);
		rental.setAddress(address);
		
		Validations validations=new Validations();
		Map<String,String>	errorMessages=validations.addHouseRentalValidation(rental);
		if(errorMessages.size()>0) {
			request.setAttribute("errorMessages",errorMessages);
			request.getRequestDispatcher("addrental.jsp").forward(request, response);
			
		}else {
			Service service=new Service();
			AddRentalProfile rentalService=service.addHouseRentalService(rental);
			if(rentalService !=null) {
				request.getRequestDispatcher("addrentaljsp").forward(request, response);
			}else {
				request.setAttribute("sql Error","some internal error occured........");
				request.getRequestDispatcher("addrental.jsp").forward(request, response);
			}
			
		}
		
	}
}
