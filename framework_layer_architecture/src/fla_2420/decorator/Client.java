package fla_2420.decorator;

public class Client {
	private IComponent basicSite;
	
	public Client() {
		this.basicSite = new BasicSite();
		this.basicSite = this.wrapComponent(this.basicSite); 
		String siteShow = this.basicSite.getSite(); 
		String format = " \nTotal: $";
		double price = this.basicSite.getPrice();
		System.out.print(siteShow+format+price);
	}

	private IComponent wrapComponent (IComponent component) {
		component = new Maintenance (component);
		component = new Video (component);
		component = new Database(component);
		component = new Security(component);
		return component;
	}
}