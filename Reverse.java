package week1.day3;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String txt = "welcome";
			 
			/*for (int i = txt.length()-1; i>=0; i--)
				System.out.print(txt.charAt(i));		
			System.out.println();*/
		
		char[] chr = txt.toCharArray();
		for (int i = chr.length-1; i>=0; i--)
			System.out.print(chr[i]);
		//System.out.println(chr[i]);
		
	}

	}

