package kr.ac.dealim.uml.strategy;

public abstract class Animal {

	protected IFly fly;
	protected ICry cry;
	
	public Animal() {
		//생성자
	}
	public void display(){	}
	public void move() {
		System.out.println("Animal: move");
	}
	public void PerformFly() {
		fly.Fly();
	}
	public void PerformCry() {
		cry.Cry();
	}
}
