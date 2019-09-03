package kr.ac.dealim.uml.strategy;

public class Tiger extends Animal{

	public Tiger() {
		cry = new TigerCry();
		fly = new FlyNoWay();				
	}
	@Override
	public void PerformCry() {
	
		super.PerformCry();
	}
	@Override
	public void PerformFly() {
	
		super.PerformFly();
	}
	@Override
	public void display() {
		System.out.println("호랑이");
		super.display();
	}
}
