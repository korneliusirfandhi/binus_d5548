package fla_2420.decorator;

public class Database extends Decorator {
	public Database(IComponent current) {
		this.siteNow = current;
	}

	@Override
	public String getSite() {
		// TODO Auto-generated method stub
		String format = "\t\nMySQLDatabase";
		return this.siteNow.getSite() + format;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 800 + this.siteNow.getPrice();
	}
	

}
