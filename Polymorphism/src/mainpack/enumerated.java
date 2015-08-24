package mainpack;


enum Apple{
	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
	
	private int price;
	Apple(int p){price =p;}
	int getPrice(){return price;}
}
public class enumerated {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apple ap = Apple.Jonathan;
		System.out.println("Winesap costs "+ Apple.Winesap.getPrice()+"cents.\n");
		System.out.println(Apple.values());
		System.out.println(ap);
		
		System.out.println("All Apples Prices:");
		for(Apple a : Apple.values())
			System.out.println(a + " costs "+ a.getPrice()+"cents.");
		
		
	}

}
