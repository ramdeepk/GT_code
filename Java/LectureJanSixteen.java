public class LectureJanSixteen {
	public static void main(String[] args) {
		int temp = 80;
		String dinner = (temp > 60) ? "grilled" : "baked";
		/*Above is the same as:
		String dinner = null;
		if (temp > 60) {
			dinner = "grilled";
		}
		else {
			dinner = "baked";
		}
		*/
		System.out.println(dinner);
	}
}