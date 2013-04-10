package ie.gcdassignment2;
/**
 * * @author philips emonina
 * 2831915
 * A student extend class person with
 * student number, subject of study, year of study
 * year of completion is 
 * present year plus 5 less the year of study
 *
 */

public class Student extends Person {
	private int studentNumber;
	public String subjectOfStudy;
	public int yearOfStudy;
	public int presentYear;

	public Student(String name, String address, String sex, 
			int i, String abc, 
			int j, int k) {
		super(name, address, sex);
		this.setPresentYear(k);
		this.setStudentNumber(i);
		this.setSubjectOfStudy(abc);
		this.setYearOfStudy(j);
	}

	/**
	 * @return the studentNumber
	 */
	public int getStudentNumber() {
		return studentNumber;
	}

	/**
	 * @param studentNumber 
	 * @param studentNumber the studentNumber to set
	 */
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	/**
	 * @return the subjectOfStudy
	 */
	public String getSubjectOfStudy(String abc) {
		return abc;
	}

	/**
	 * @param subjectOfStudy the subjectOfStudy to set
	 */
	public void setSubjectOfStudy(String abc) {
		this.subjectOfStudy = abc;
	}

	/**
	 * @return the yearOfStudy
	 */
	public int getYearOfStudy(int j) {
		return j;
	}

	/**
	 * @param yearOfStudy the yearOfStudy to set
	 */
	public void setYearOfStudy(int j) {
		this.yearOfStudy = j;
	}

	/**
	 * @return the presentYear
	 */
	public int getPresentYear(int k) {
		return k;
	}

	/**
	 * @param presentYear the presentYear to set
	 */
	public int setPresentYear(int k) {
		return presentYear = k;
	}

	@Override
	public String toString() {
		return  "Student [Student Num ="+ studentNumber + ", " +
				" Subject studied =" + subjectOfStudy + ", " +
						"Year of study = "+ yearOfStudy + super.toString()
	+ "]";
	}

	@Override
	public int completionYear() {
		return presentYear + 5 - yearOfStudy;
	}

}
