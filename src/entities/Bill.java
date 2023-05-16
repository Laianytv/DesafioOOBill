package entities;

public class Bill {
	static final double BEER_PRICE = 5.0;
	static final double SOFT_DRINK_PRICE = 3.0;
	static final double BARBECUE_PRICE = 7.0;
	static final double MAN_TICKET = 10.0;
	static final double WORMAN_TICKET = 8.0;
	static final double FEEDING_MIN = 30.0;
	static final double COVER_PRICE = 4.0;

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double cover() {
		double consumption = (BEER_PRICE * beer) + (SOFT_DRINK_PRICE * softDrink) + (BARBECUE_PRICE * barbecue);
		if (consumption > 30) {
			return 0;
		} else {
			return 4.00;
		}
	}

	public String toString() {
		if (cover() == 0) {
			return "Isento de Couvert ";
		} else {
			return  "Couvert = R$" + 
					String.format("%.2f",cover());
		}

	}

	public double feeding() {
		double feeding = (BEER_PRICE * beer) + (SOFT_DRINK_PRICE * softDrink) + (BARBECUE_PRICE * barbecue);
		return feeding;
	}

	public double ticket() {
		if (gender == 'F') {
			return 8.00;
		} else {
			return 10.00;
		}
	}

	public double total() {
		return cover() + feeding() + ticket();
	}

}
