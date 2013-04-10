package ie.gcdassignment2;

public class TestUniversity {

	/**
	 * author philips emonina
	 * 2831915
	 * test code for person, student, lecturer
	 * @param args
	 */
	public static void main(String[] args) {
		// Person p = new Person();
		Student st = new Student("Abel","36 lambourn rd","Male", 
				1, "Arts", 2, 3 );
		Lecturer lt = new Lecturer("Bright", "225 whitestown ave", 
				"Male", "Accounts", "01234");
		System.out.println("Student Year of Completion: "
				+st.completionYear());
		System.out.println(st.toString());
		System.out.println("Lecturer Year of Completion: "
		+lt.completionYear());
		System.out.println(lt.toString());

	}

}
