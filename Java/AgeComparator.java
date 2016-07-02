import java.util.Comparator;
public class AgeComparator implements Comparator<PersonExam3> {
	public int compare(PersonExam3 p1, PersonExam3 p2) {
		if (p1.age != p2.age) {
			return p1.age - p2.age;
		} else if (p1.ssn != p2.ssn) {
			return p1.ssn - p2.ssn;
		} else {
			return p1.name.compareTo(p2.name);
		}
	}
}