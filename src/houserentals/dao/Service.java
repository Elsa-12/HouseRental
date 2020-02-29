package houserentals.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import houserentals.dto.AddRentalProfile;
import houserentals.dto.AddRentalProfile.RentalHouse;
import houserentals.dto.RegisterProfile;

public class Service {
	
   public RegisterProfile register(RegisterProfile profile) {
	   EntityManagerFactory entityManagerFactor=Persistence.createEntityManagerFactory("houserentals");
		EntityManager entityManager=entityManagerFactor.createEntityManager();
		EntityTransaction transcation=entityManager.getTransaction();
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
		return profile;
	   
   }
   
	public RegisterProfile save(String email,String password) {
		EntityManagerFactory entityManagerFactor=Persistence.createEntityManagerFactory("houserentals");
		EntityManager entityManager=entityManagerFactor.createEntityManager();
		try {
			TypedQuery<RegisterProfile> query=entityManager.createQuery("from RegisterProfile where email=:email and password=:password",RegisterProfile.class);
			query.setParameter("email",email);
			query.setParameter("password",password);
			 return query.getSingleResult()	;	 

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public AddRentalProfile addHouseRentalService(AddRentalProfile rental) {
		EntityManagerFactory entityManagerFactor=Persistence.createEntityManagerFactory("houserentals");
		EntityManager entityManager=entityManagerFactor.createEntityManager();
		EntityTransaction transcation=entityManager.getTransaction();
		try {
			transcation.begin();
			entityManager.persist(rental);
			transcation.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			transcation.rollback();
		}finally {
			entityManager.close();
			entityManagerFactor.close();
		}
		return rental;
	}
	public AddRentalProfile userDetailsService(AddRentalProfile rental) {

		EntityManagerFactory entityManagerFactor = Persistence.createEntityManagerFactory("houserentals");
		EntityManager entityManager = entityManagerFactor.createEntityManager();

		try {
			TypedQuery<AddRentalProfile> query = entityManager.createQuery("from AAddRentalProfile where userId=:userId",
					AddRentalProfile.class);
			query.setParameter("houseId",rental.getHouseId());
			query.setParameter("house",rental.getHouse());
			query.setParameter("squareFeet",rental.getSquareFeet());
			query.setParameter("rentalCost",rental.getRentalCost());
			query.setParameter("parkingAvaliable",rental.getParkingAvaliable());
			query.setParameter("garden",rental.getGarden());
			query.setParameter("address",rental.getAddress());
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}
	
	
}

