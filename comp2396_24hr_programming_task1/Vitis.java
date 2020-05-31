package comp2396_24hr_programming_task1;

/**
 * Vitis is the Child class inheriting Fruit class
 * @author Lee Yoon Jeong
 * @since 2020-04-24
 *
 */
public class Vitis extends Fruit{

	private double weight;
	/**
	 * Vitis is Parameterized constructor
	 * @param weight of seeds in Vitis
	 */
	public Vitis(double weight) {
		this.weight = weight;
	}
	/**
	 * toString returns the string representation of the object
	 */
	public String toString() {
		return "one " + this.weight + "g vitis";
	}
	/**
	 * Prints that Vitis is deseeded of seeds input amount of weight
	 */
	public void prepare() {
		System.out.print("Seed from ");
		System.out.print(this);
		System.out.println(" removed");
	}
}
