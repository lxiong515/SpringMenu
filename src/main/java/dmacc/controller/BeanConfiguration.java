package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Menu;
import dmacc.beans.Restaurants;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Menu menu() {
		Menu bean = new Menu ();
		//bean.setEntree("Steak");
		//bean.setSides("mashed potatoes");
		//bean.setDrinks("water");
		//bean.setDesserts("ice cream");
		return bean;
	}
	
	@Bean
	public Restaurants restaurants() {
		Restaurants bean = new Restaurants("Bubba", "Des Moines", "IA");
		return bean;
	}

}
