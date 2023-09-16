package interviewQuestionss;

public class ReverseString {

	public static void main(String[] args) {
		

		 String word = "highlight";
		 
		 char[] myArray = word.toCharArray();
		 
		 
		 String reverseword = "";
		 
		 
		 for(int i =word.length()-1; i>=0; i--) {
			 reverseword = reverseword + myArray[i];
		 }
			 
			  System.out.println("The reverseWord: " + reverseword);
			 
			 if(word.equalsIgnoreCase(reverseword)) {
				 System.out.println("palindrome!");
				 
				 }else {
					 
					  System.out.println("Not Plaindrome!");
				 }
	}
	
	

}
