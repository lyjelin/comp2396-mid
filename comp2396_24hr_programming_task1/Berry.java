package comp2396_24hr_programming_task1;
/**
 * Berry is the Child class inheriting Fruit class
 * @author Lee Yoon Jeong
 * @since 2020-04-24
 *
 */
public class Berry extends Fruit {
	
	private double weight;
	/**
	 * Berry is Parameterized constructor
	 * @param weight of seeds in Berry
	 */
	public Berry(double weight) {
		this.weight = weight;
	}
	/**
	 * toString returns the string representation of the object
	 */
	public String toString() {
		return "one " + this.weight + "g berry";
	}
	/**
	 * Prints that Berry is deseeded of seeds input amount of weight
	 */
	public void prepare() {
		System.out.print("Seed from ");
		System.out.print(this);
		System.out.println(" removed");
	}
		
}

