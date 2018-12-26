
public class MyDate{

	@Override
	public String toString() {
		return dd + "/" + mm + "/" + yyyy;
	}

	int dd;
	int mm;
	int yyyy;

	public MyDate(int dd, int mm, int yyyy) {
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}

	public int getDd() {
		return dd;
	}

	public int getMm() {
		return mm;
	}

	public int getYyyy() {
		return yyyy;
	}

}
