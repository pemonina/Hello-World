/**
 * 
 */
package ie.gcdassignment2;

/**
 * @author Philips Emonina
 * 2831915
 * A computer program for an abstract class of person
 * encapsulate what is common to person
 * name, address, sex
 * and a constructor
 * abstract method completion year with return type int
 * also a method toString
 * 
 *
 */
public abstract class Person {
	private String name;
	public String address;
	public String sex;
	public abstract int completionYear();
	public Person(String name, String address, String sex) {
		super();
		this.name = name;
		this.address = address;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", address=" + address + ", sex=" + sex
				+ "]";
	}

}
