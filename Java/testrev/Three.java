public class Three extends One {
	private int z, y;
public Three() {
this(0);
}
public Three(int n) {
z = x + y + n;
System.out.println(" fly times " + z);
}
public static void main(String[] args) {
Two d = new Two();
int delta = 1;
Three f = new Three(delta);
}
}
