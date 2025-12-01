package fla_2420.decorator;

public class Maintenance extends Decorator {
	public Maintenance(IComponent current) {
		this.siteNow = current;
	}

	@Override
	public String getSite() {
		// TODO Auto-generated method stub
		String format = "\t\nMaintenace";
		return this.siteNow.getSite() + format;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 950 + this.siteNow.getPrice();
	}
	

}
