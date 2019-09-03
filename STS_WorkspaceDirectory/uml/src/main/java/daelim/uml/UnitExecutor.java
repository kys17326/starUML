package daelim.uml;

public class UnitExecutor {

	public static void main(String[] args) {
		Unit unit = new Unit();
		unit.Move();
		
		Marine marine = new Marine();
		marine.name = "marine";
		marine.Move();
		marine.Attack();
		
		Medic medic = new Medic();
		medic.name = "medic";
		medic.Move();
		medic.Healing(null);
	}

}
