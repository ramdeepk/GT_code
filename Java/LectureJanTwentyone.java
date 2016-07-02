public class LectureJanTwentyone {
	public static void main(String[] args) {
		while (boolean condition) {
			/*body of loop*/
		}
		for (initialization; condition; update) {
			/*body of loop*/
		}
		do {
			/*body of loop*/
		} while (boolean condition);

		//for loops can be made into an equivalent while loop
		for(int i = 1; i < 10; i++) { //i is not visible in some part of the program: 
			//if you tried to print i outside the for loop, you're completely fucked.
			/*body*/
		}
		//is equivalent to
		int i = 1;
		while(i < 10) {
			i++;
		}
	}
}	