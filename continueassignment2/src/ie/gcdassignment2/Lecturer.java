package ie.gcdassignment2;
/**
 * 
 * @author philips emonina
 * 2831915
 * A lecturer extend the class person
 * with additional department, staff number
 * it include method to print
 * year of completion is
 * present year plus 65 less the decimal integer got by taking the 
 * first two digits of the staff number
 *
 */

public class Lecturer extends Person {
	public String department;
	public String staffNumber;
	public int presentYear;

	public Lecturer(String name, String address, String sex, 
			String department, String staffNumber) {
		super(name, address, sex);
		this.setDepartment(department);
		this.setPresentYear(presentYear);
		this.setStaffNumber(staffNumber);
		
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the staffNumber
	 */
	public String getStaffNumber() {
		return staffNumber;
	}

	/**
	 * @param staffNumber the staffNumber to set
	 */
	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}

	/**
	 * @return the presentYear
	 */
	public int getPresentYear() {
		return presentYear;
	}

	/**
	 * @param presentYear the presentYear to set
	 */
	public void setPresentYear(int presentYear) {
		this.presentYear = presentYear;
	}

	@Override
	public String toString() {
		return "Lecturer [department=" + department + ", staffNumber="
				+ staffNumber + ", presentYear=" + presentYear
				+ super.toString() + "]";
	}

	@Override
	public int completionYear() {
		
		return presentYear + 65 - 
				Integer.parseInt(staffNumber.substring(0, 2));
	}

}
