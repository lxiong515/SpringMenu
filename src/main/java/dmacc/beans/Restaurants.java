package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Restaurants {
	private String name;
	private String city;
	private String state;
	
	public Restaurants() {
		//omitted to save space;
	}
	
	public Restaurants(String name, String city, String state){
		//omitted to save space;
		this.name = name;
		this.city = city;
		this.state = state;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Restaurant [name= " + name + " , city= " + city + " , state= " + state + "]";
	}

	
}
