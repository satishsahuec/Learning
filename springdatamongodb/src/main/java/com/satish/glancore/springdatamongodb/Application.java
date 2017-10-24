package com.satish.glancore.springdatamongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;


@SpringBootApplication
public class Application implements CommandLineRunner {

		@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();
		
		

		// save a couple of customers
		repository.save(new Customer("satish", "sahu"));
		repository.save(new Customer("ankit", "rai"));
		
		System.out.println("repository.count() "+repository.count());
		
		
	/*	Query query = new Query();
		query.addCriteria(Criteria.where("name").is("Markus"));
		Update update = new Update();
		update.set("name", "Nick");
		repository.upsert(query, update, User.class);*/
		
		
		//repository.findOne(Query.query(Criteria.where("name").is("Jack")), Customer.class);

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('satish'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("satish"));

		System.out.println("Customers found with findByLastName('sahu'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("sahu")) {
			System.out.println(customer);
		}

	}


}
