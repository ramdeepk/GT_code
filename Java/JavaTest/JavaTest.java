public class JavaTest {
	public static void main(String[] args) {
		Card x = new Card();
		String rank = "gay";
		x.setRank(rank);
		x.setSuit("base");

		System.out.println(x);
		System.out.println(rank);
	}
}