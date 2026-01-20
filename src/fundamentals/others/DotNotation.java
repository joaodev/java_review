package fundamentals.others;

public class DotNotation {

	public static void main(String[] args) {
		
		String s = "Good morning X";
		s = s.replace("X", "Y");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Lorem".toUpperCase();
		System.out.println(x);
		
		String z = "Good morning Z"
				.replace("Z", "A")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(z);
		
		// Primitive types do not have the dot operator ".
		int a = 1;
		System.out.println(a);
	}
}
