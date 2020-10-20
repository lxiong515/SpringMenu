package dmacc;

//Luke Xiong

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Menu;
import dmacc.beans.Restaurants;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.MenuRepository;

@SpringBootApplication
public class SpringMenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMenuApplication.class, args);
	/*
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		Menu m = appContext.getBean("menu", Menu.class);
		
		System.out.println(m.toString());
		*/
	}
	
	@Autowired
	MenuRepository repo;
	
	//@Override
	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//using an existing bean
		Menu m = appContext.getBean("menu", Menu.class);
		m.setEntree("Steak");
		repo.save(m);
		
		//creating a bean to use - not managed by spring
		Menu n = new Menu("Fried Chicken", "Corn", "Juice", "Pie");
		Restaurants r = new Restaurants("Bubba", "Des Moines", "IA");
		n.setRestaurants(r);
		repo.save(n);
		
		List<Menu>allMyMenu = repo.findAll();
		for(Menu food: allMyMenu) {
			System.out.println(food.toString());
		}
		((AbstractApplicationContext) appContext).close();
		
	}

}
