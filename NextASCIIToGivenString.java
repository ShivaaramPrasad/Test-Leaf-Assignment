package weektwo;

public class NextASCIIToGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputText = "A2C3D4";
		String outputText = "";
		
		for(int index = 0; index < inputText.length() ; index++)
		{
			//get each character
			char eachChar = inputText.charAt(index);
			System.out.println(eachChar);
			
			//convert to ASCII and add 1 and convert to Char
			int asciiForEachChar = eachChar;
			asciiForEachChar = asciiForEachChar + 1;
			eachChar = (char) asciiForEachChar;
			System.out.println(eachChar);
			
			outputText = outputText.concat(Character.toString(eachChar));
		}
		System.out.println("The outout of the input string "  + inputText + " is " + outputText);

	}

}
