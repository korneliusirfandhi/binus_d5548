package fla_2420.decorator;

public class BasicSite extends IComponent {
	public BasicSite() {
		this.site = "Basic Site";
	}

	@Override
	public String getSite() {
		// TODO Auto-generated method stub
		return this.site;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1200;
	}
}
