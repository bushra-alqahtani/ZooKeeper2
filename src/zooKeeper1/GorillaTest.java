package zooKeeper1;

public class GorillaTest {

	public static void main(String[] args) {
		
		//Create a GorillaTest class to instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.
		Gorilla g1=new Gorilla();
		
		g1.displayEnergy();
		g1.throwSomething();
		g1.throwSomething();
		g1.throwSomething();
		g1.eatBananas();
		g1.eatBananas();
		g1.climb();
		g1.displayEnergy();
	}

}
