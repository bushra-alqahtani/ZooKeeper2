package zooKeeper1;

public class Bat extends Mammal{
	

	
	//Create a Bat class that can fly(), eatHumans(), and attackTown() and has a default energy level of 300.
	Bat(){
		this.energyLevel=300;
	}
	void fly() {
		//For the fly() method, print the sound a bat taking off and decrease its energy by 50.
		System.out.println("sososososos");
		energyLevel -= 50;
	}
	void eatHumans() {
		//For the eatHumans() method, print the so- well, never mind, just increase its energy by 25.
		System.out.println("so- well, never mind");
		this.energyLevel += 25;
		
	}
	void attackTown(){
		//For the attackTown() method, print the sound of a town on fire and decrease its energy by 100.
		System.out.println("slfhsidughfosiu");
		this.energyLevel -= 100;
		
	}
	
}
