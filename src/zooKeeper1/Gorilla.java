package zooKeeper1;

public class Gorilla extends Mammal{
	
	void throwSomething() {
		System.out.println(" throwing somthing");
		this.energyLevel -= 5;
	}
	
	void eatBananas() {
		System.out.println(" eatBananas");
		this.energyLevel += 10;
	}
	void climb() {
		System.out.println("climbed a tree");
		this.energyLevel -= 10;
	}
	

}
