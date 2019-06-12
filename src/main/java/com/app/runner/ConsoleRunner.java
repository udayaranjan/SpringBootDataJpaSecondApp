package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;

@Component
public class ConsoleRunner implements CommandLineRunner{
	
	@Autowired
	private ProductRepository repo;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Product(10,"A",3.3));
		repo.save(new Product(11,"B",4.3));
		repo.save(new Product(12,"C",5.3));
	}

}
