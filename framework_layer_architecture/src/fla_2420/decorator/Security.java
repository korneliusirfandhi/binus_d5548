package fla_2420.decorator;

public class Security extends Decorator {
	public Security(IComponent current) {
		this.siteNow = current;
	}

	@Override
	public String getSite() {
		// TODO Auto-generated method stub
		String format = "\t\nSecurity";
		return this.siteNow.getSite() + format;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1500 + this.siteNow.getPrice();
	}
	

}
