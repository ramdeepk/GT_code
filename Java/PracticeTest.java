import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparable;
import java.util.Comparator;
import java.util.Collections;
public class PracticeTest {
	public class A implements Comparable<A> {
		protected int x;
		public A(int kk) {
			x = kk;
		}
		public int compareTo(A a) {
			return x - a.x;
		}
	}
	public class B extends A {
		protected int y;
		public B(int d, int fd) {
			super(d);
			y = fd;
		}
	}
	public class MyComp implements Comparator<A> {
		protected boolean z;
		public MyComp() {
			z = true;
		}
		public int compare(MyComp one, MyComp two) {
			return 0;
		}
	}
	public static void main(String[] args) {
		List<A> aList = new ArrayList<A>();
		aList.add(new A(10));
		aList.add(new A(11));
		List<B> bList = new ArrayList<B>();
		bList.add(new B(10, 90));
		bList.add(new B(11, 89));
		List<MyComp> cList = new ArrayList<>();
		cList.add(new MyComp());
		cList.add(new MyComp());
		Collections.sort(aList);
		Collections.sort(bList);
		Collections.sort(cList);
	}
	// public static void main(String[] args) {
	// 	Map<String, String> capitals = new HashMap<>();
	// 	capitals.put("Georgia", "Atlanta");
	// 	capitals.put("Alabama", "Montgomery");
	// 	capitals.put("Florida", "Tallahassee");
	// 	capitals.put("Tennesee", "Atlanta");
	// 	System.out.println(capitals.size());	
	// }
}