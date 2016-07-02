import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class PersonExam3 implements Comparable<PersonExam3> {
	protected int age, ssn;
	protected String name;
	public PersonExam3(String name, int age, int ssn) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}
	public int compareTo(PersonExam3 o) {
	    return this.name.compareTo(o.name);
	}
	public String toString() {
		return this.name + " (" + age + ", " + ssn + ")";
	}
	public String getName() {
		return this.name;
	}
	public static void main(String... args) {
	    List peeps = new ArrayList();
	    PersonExam3 krishna = new PersonExam3("Krishna Ramdeep", 18, 529618);
	    PersonExam3 bruce = new PersonExam3("Bruce Wayne", 31, 111200);
	    PersonExam3 gray = new PersonExam3("Grayson Fullbuster", 18, 800135);
	    PersonExam3 rp7 = new PersonExam3("Robert Pires", 41, 200307);
	    PersonExam3 th14 = new PersonExam3("Thierry Henry", 38, 200114);
	    PersonExam3 as17 = new PersonExam3("Alexis Sanchez", 26, 172015);
	    PersonExam3 mo11 = new PersonExam3("Mesut Ozil", 26, 112014);
	    PersonExam3 leprofeseur = new PersonExam3("Arsene Wenger", 65, 491996);
	    PersonExam3 titania = new PersonExam3("Eliza Fernandes", 19, 800181);
	    peeps.add(krishna); peeps.add(bruce); peeps.add(gray); peeps.add(titania); peeps.add(leprofeseur);
	    peeps.add(as17); peeps.add(mo11); peeps.add(th14); peeps.add(rp7);
	    //System.out.println(krishna::getName); //method reference != method call
	    //peeps.add(92); //will compile (with warnings), but will not run.
	    // Collections.sort(peeps);
	    // System.out.println("Name comparison-- using Comparable<PersonExam3> " + peeps);
	    //Collections.sort(peeps, new AgeComparator());														REGULAR WAY, CREATING AN AGECOMPARATOR CLASS




	  //   Collections.sort(peeps, new Comparator<PersonExam3>() {
	  //   	public int compare(PersonExam3 p1, PersonExam3 p2) {
			// 	if (p1.age != p2.age) {
			// 		return p1.age - p2.age;
			// 	} else if (p1.ssn != p2.ssn) {
			// 		return p1.ssn - p2.ssn;
			// 	} else {
			// 		return p1.name.compareTo(p2.name);
			// 	}
			// }
	  //   });																								CREATING AN ANONYMOUS INNER CLASS



	    Collections.sort(peeps, (PersonExam3 p1, PersonExam3 p2) -> {
			if (p1.age != p2.age) {
				return p1.age - p2.age;
			} else if (p1.ssn != p2.ssn) {
				return p1.ssn - p2.ssn;
			} else {
				return p1.name.compareTo(p2.name);
			}	    	
	    });

	    System.out.println("Age comparison-- using Comparator<PersonExam3> " + peeps);
	}
}