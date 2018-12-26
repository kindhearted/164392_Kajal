package orderPackage;

public class Order {

	private int orderId;
	private int price;
	private String status;
	
	public Order(int orderId,int price,String status) {
		
		this.orderId=orderId;
		this.price=price;
		this.status=status;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "[orderId=" + orderId + ", price=" + price + ", status=" + status + "]\n";
	}
	
	
}
