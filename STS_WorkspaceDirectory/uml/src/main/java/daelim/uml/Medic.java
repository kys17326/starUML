package daelim.uml;

public class Medic extends Unit {
	
	@Override
	public void Move() {
		
		super.Move();
	}
	@Override
	public void UnderAttack(Charactor charactor) {
	
		super.UnderAttack(charactor);
	}
	
	public void Healing(Charactor charactor) {
		System.out.println("메딕 치료합니다.");
	}
}
