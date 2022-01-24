package spl.org.payMyBuddy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spl.org.payMyBuddy.service.InitApp;

@SpringBootApplication
public class PayMyBuddyApplication implements CommandLineRunner{
	@Autowired
	private InitApp initapp;
	public static void main(String[] args) {
		SpringApplication.run(PayMyBuddyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// DataBase PayMyBuddyTest inititialization
		initapp.initUser();
		initapp.initConnection();
		 initapp.initTransaction(); 
		
	}

}
