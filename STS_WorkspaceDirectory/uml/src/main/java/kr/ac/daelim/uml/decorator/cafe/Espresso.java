package kr.ac.daelim.uml.decorator.cafe;

public class Espresso extends Beverage{

	public Espresso(){
		this.description = "에스프레스";
	}
	@Override
	public int cost() {

		return 2000;
	}

}
