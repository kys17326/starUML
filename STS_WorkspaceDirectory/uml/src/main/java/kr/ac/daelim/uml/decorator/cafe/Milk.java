package kr.ac.daelim.uml.decorator.cafe;

public class Milk extends CondimentDecorator{
	
	private Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
		
	}
	
	@Override
	public int cost() {

		return beverage.cost()+ 500;
	}

	@Override
	public String getDescription() {

		return beverage.getDescription()+", 우유";
	}

}
