package interviewQuestionss;

public class sortArrayVersionTwo {

	public static void main(String[] args) {
		
		 int[] myArray = {5,1,8,6,2};
		 
		 int temp;
		 
		 for(int i=0; i<myArray.length; i++) {
			 for(int j=0; j< myArray.length; j++) {
			 
			 if(myArray[i] < myArray[j]) {
				 temp = myArray[i];
	            myArray[i] = myArray[j];
			 }
			 
			 }
		 }

	}

}
