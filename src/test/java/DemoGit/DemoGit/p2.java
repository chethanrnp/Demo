package DemoGit.DemoGit;

public class p2 {

	public static void main(String[] args) {
		String s="madam";
		String rev="";
		
		for (int i = s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev))
			System.out.println("Is polindrome");
		
		else
			System.out.println("Is not a polindrome");
	}

}
