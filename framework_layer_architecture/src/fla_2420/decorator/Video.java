package fla_2420.decorator;

public class Video extends Decorator {
	public Video(IComponent current) {
		this.siteNow = current;
	}

	@Override
	public String getSite() {
		// TODO Auto-generated method stub
		String format = "\t\nVideo";
		return this.siteNow.getSite() + format;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 350 + this.siteNow.getPrice();
	}
	

}
