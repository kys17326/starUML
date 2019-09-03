package kr.ac.dealim.uml.strategy;

public class Eagle extends Animal{

		public Eagle(){
			cry = new BirdCry();
			fly = new FlyWithWings();
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
			System.out.println("독수리");
		super.display();
		}
		
}
