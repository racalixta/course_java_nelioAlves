
public class Main {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG   ";
		System.out.println("Original: ~" + original + "~");

		String s1 = original.toLowerCase();
		System.out.println("\ntoLowerCase: ~" + s1 + "~");
		
		String s2 = original.toUpperCase();
		System.out.println("\ntoUpperCase: ~" + s2 + "~");

		String s3 = original.trim();
		System.out.println("\ntrim: ~" + s3 + "~");
		
		String s4 = original.substring(2);
		System.out.println("\nsubstring(2): ~" + s4 + "~");
		
		String s5 = original.substring(2, 9);
		System.out.println("\nsubstring(2, 9): ~" + s5 + "~");
		
		String s6 = original.replace('a', '7');
		System.out.println("\nreplace('a', '7'): ~" + s6 + "~");
		
		String s7 = original.replace("abc", "61");
		System.out.println("\nreplace(abc, 61): ~" + s7 + "~");
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("\nindexOf 'bc': " + i);
		System.out.println("\nlastIndexOf 'bc': " + j);
		
		System.out.println("\n------------------------------");
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
	}

}
