package zooKeeper1;


public class BatTest {

	public static void main(String[] args) {
		// Create a BatTest class to instantiate a bat and have it attack three towns, eat two humans, and fly twice.
		Bat b1 = new Bat();
		
		
		b1.displayEnergy();
		b1.attackTown();
		b1.attackTown();
		b1.attackTown();
		b1.eatHumans();
		b1.eatHumans();
		b1.fly();
		b1.fly();
		b1.displayEnergy();
	
	}

}
