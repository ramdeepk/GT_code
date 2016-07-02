public class LectureJanTwentysix {
	public static void main(String[] args) {
		double[] scores = new double[5];
		//for (int i = 0; i < scores.length; i++) {
		//	System.out.println(scores[i]);
		//}
		//System.out.println(scores[6]); runtime error, arrayindexoutofbounds exception
		for (int i = 0; i < 5; i++) {
			System.out.println(i * i);
		}
		System.out.println("\n\n\n\n");
		for (int i = 0; i < 5; ++i) {
			System.out.println(i * i);
		}
	}
}