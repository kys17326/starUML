package daelim.uml;

public class Marine0version {
	
	private String name;
	public int health;
	protected int attackPower;
	
	public String getname() {
		return name;
	}

	public void setname(String name) {
		name = name;
	}

	private void Move() {
		System.out.println("마린 이동한다.");
	}
	
	public void Attack() {
		System.out.println("마린 공격한다.");
	}
	
	public void UnderAttack(Charactor charactor) {
		Move();
		System.out.println(charactor + "마린 공격 받는다.");
	}

}