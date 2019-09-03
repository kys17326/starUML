package kr.ac.dealim.uml.strategy;

public class Zoo {

	public static void main(String[] args) {
		Animal tiger = new Tiger();
		Eagle eagle = new Eagle();
		Turtle turtle = new Turtle();
		
		tiger.display();
		tiger.PerformCry();
		tiger.PerformFly();
		
		eagle.display();
		eagle.PerformCry();
		eagle.PerformFly();
		
		turtle.display();
		turtle.PerformCry();
		turtle.PerformFly();
	}

}