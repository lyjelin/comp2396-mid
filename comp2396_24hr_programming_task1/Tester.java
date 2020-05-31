package comp2396_24hr_programming_task1;

public class Tester {
	private Fruit fru;
	private Berry ber;
	private Vitis vit;
	private Fragaria fra;

	public static void main(String[] args) {
		//int numberOfFruits = 0;
		
		Tester t = new Tester();
		t.add(new Fruit());
		
		t.add(new Berry(3.7));
		
		t.add(new Vitis(5.2));
		
		t.add(new Fragaria());
		
		t.start();
		
		System.out.println(t.fru.numberOfFruits+" fruits are juiced");

	}
	public void add(Fruit fru) {
		this.fru = fru;
	}
	public void add(Berry ber) {
		this.ber = ber;
	}
	public void add(Vitis vit) {
		this.vit = vit;
	}
	public void add(Fragaria fra) {
		this.fra = fra;
	}
	
	public void start() {
		
		fru.prepare();
		fru.countNumberOfFruits();
		
		ber.prepare();
		fru.countNumberOfFruits();
		
		vit.prepare();
		fru.countNumberOfFruits();
		
		fra.prepare();
		fru.countNumberOfFruits();

	}

}
