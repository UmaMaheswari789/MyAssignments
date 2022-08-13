package week1.day2;
import java.util.Arrays;

public class MissingElementsInArray {
	public static void main(String[] args) {
		int[] arr = {6,2,7,4,9,};
		Arrays.sort(arr);
		int length = arr.length;
		System.out.println(length);
		for(int i=0; i<7; i++) {
			if(arr[4]==i+1) {

				System.out.println("Missing Element in arry is: " +i); 	

			}
		}


}
}
