package kr.ac.daelim.uml.decorator.cafe;

public class Decaf extends Beverage{

	public Decaf()
	{
		this.description = "디카프";
	}
	@Override
	public int cost() {

		return 2500;
	}

}
