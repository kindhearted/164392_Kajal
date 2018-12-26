
public class Fruit {

	private String name;
	private String color;
	private int price;
	private int calorie;
	
	public Fruit(String name,int price,int calorie,String color) {
		
		this.name=name;
		this.price=price;
		this.calorie=calorie;
		this.color=color;	
		
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", color=" + color + ", price=" + price + ", calorie=" + calorie + "]\n";
	}
	
	
	
	
}
