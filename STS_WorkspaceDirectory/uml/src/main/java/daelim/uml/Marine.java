package daelim.uml;

public class Marine extends Unit {
	
	protected int AttackPower;
	
	@Override
	public void Move() {

		super.Move();
		System.out.println("마린 이동합니다.");
	}
	
	@Override
	public void UnderAttack(Charactor charactor) {

		super.UnderAttack(charactor);
		System.out.println("마린이 공격 받고 있습니다.");
		
	}
	
	public void Attack() {
		System.out.println("마린 공격합니다.");
	}

}
