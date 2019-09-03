package kr.ac.dealim.uml.strategy;

public class Turtle extends Animal{
	public Turtle() {
		cry = new CryNoWay();
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
		System.out.println("거북이");
		super.display();
	}
}
