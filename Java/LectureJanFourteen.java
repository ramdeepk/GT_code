public class LectureJanFourteen {
	public static void main(String[] args) { //public means you can reference the method outside the class, 
		//and static means you do not have to instantiate a member of the class to use its methods
		//just like other primitives, strings can be assigned, and
		//void means the method doesn't mean anything
		//the JVM calls the main method before any other when you run a program
		String name = "Krishna Ramdeep";
		//the + operator is overloaded for Strings, it concatenates them
		String major = "Computer Science";
		String title = name + " " + major;
		//String is a class within the default java.lang package   //API means Application Programmer Interface
		//the . (dot) operator is used to invoke methods on an object

		//A NULLPOINTEREXCEPTION IS WHEN YOU TRY TO REFERENCE SOMETHING THAT DOES NOT EXIST
		/*System.out.println(major.substring(0, 6)); //Comput
		System.out.println(name.indexOf("dee")); //11 */


		//using command line arguments
		int[] numsToSum = new int[5];
		for(int i = 0; i < 5; i++) {
			numsToSum[i] = Integer.parseInt(args[i]);
		}

		System.out.println(getAverage(numsToSum));
	}

	public static double getAverage(int[] toAverage) {
			double sum = 0.0;
			for(int i = 0; i < toAverage.length; i++) {
				sum = sum + toAverage[i];
			}
			double average = sum / toAverage.length;
			return average;
		}
}