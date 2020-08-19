package com.example.DesignPatten;

import com.example.DesignPatten.Adapter.Alipay;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPattenApplication {

	public static void main(String[] args) {
		System.out.println(new Alipay().addPayment());
		SpringApplication.run(DesignPattenApplication.class, args);
	}

}
