package dmacc.beans;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="food_menu")
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="entree")
	private String entree;
	@Column(name="sides")
	private String sides;
	@Column(name="drinks")
	private String drinks;
	@Column(name="desserts")
	private String desserts;
	//add new instance variable
	@Autowired
	private Restaurants restaurants;
	
	@Column(name="timestamp")
	@CreationTimestamp
	private LocalDateTime timestamp;
	
	public Menu() {
		//omitted for space
		super();
		//this.drinks = "apple cider";
	}
	
	public Menu(String entree) {
		//omitted for space
		this.entree = entree;
	}
	
	public Menu(String entree, String sides, String drinks, String desserts) {
		//omitted for space
		this.entree=entree;
		this.sides=sides;
		this.drinks=drinks;
		this.desserts=desserts;
	}

	//create getters and setters

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEntree() {
		return entree;
	}

	public void setEntree(String entree) {
		this.entree = entree;
	}

	public String getSides() {
		return sides;
	}

	public void setSides(String sides) {
		this.sides = sides;
	}

	public String getDrinks() {
		return drinks;
	}

	public void setDrinks(String drinks) {
		this.drinks = drinks;
	}

	public String getDesserts() {
		return desserts;
	}

	public void setDesserts(String desserts) {
		this.desserts = desserts;
	}
	
	@Override
	public String toString() {
		//return "Menu [id= " + id + ", entree= " + entree + " sides= " + sides + ", drinks = " + drinks + ", desserts= " + desserts + "]";
		
		return "Menu [id= " + id + ", entree= " + entree + " sides= " + sides + ", drinks = " + drinks + ", desserts= " + desserts + ", restaurant= " + restaurants + " ]";
	}

	public void setRestaurants(Restaurants r) {
		// TODO Auto-generated method stub
		this.restaurants = r;
	}

}
