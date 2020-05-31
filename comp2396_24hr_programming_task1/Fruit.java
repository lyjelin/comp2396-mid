package comp2396_24hr_programming_task1;
/**
 * Fruit is the Parent class
 * @author Lee Yoon Jeong
 * @since 2020-04-24
 *
 */
public class Fruit{
	
	public int numberOfFruits=0;
	
	/**
	 * toString returns the string representation of the object
	 */
	public String toString() {
		return "a fruit";
	}
	
	/**
	 * Prints that fruit(s) are ready to be juiced by cleansing
	 */
	public void prepare() {
		System.out.print("Cleaned ");
		System.out.println(this);
	}
	
	/**
	 * Counts the number of fruits created
	 */
	public void countNumberOfFruits() {
		numberOfFruits++;
	}
	
	
}
