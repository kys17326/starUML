package daelim.uml;

public class Unit {
	public String name;
	public int health;
	
	public void Move() {
		System.out.println(name+"이 이동합니다.");
	}
	public void UnderAttack(Charactor charactor) {
		System.out.println(name+"이 공격 받고 있습니다.");
	}

}
