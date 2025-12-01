package fla_2420.decorator;

public abstract class IComponent {
	protected IComponent siteNow;
	protected String site;
	public abstract String getSite();
	public abstract double getPrice();
}
