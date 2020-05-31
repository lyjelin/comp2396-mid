package comp2396_24hr_programming_task1;

/**
 * Fragaria is the Child class inheriting Fruit class
 * @author Lee Yoon Jeong
 * @since 2020-04-24
 *
 */
public class Fragaria extends Fruit {
	/**
	 * toString returns the string representation of the object
	 */
	public String toString() {
		return "a fragaria";
	}
	/**
	 * Prints that Fragaria's caps and stems are removed
	 */
	public void prepare() {
		System.out.print("Caps and stems removed from ");
		System.out.println(this);
	}
	
}