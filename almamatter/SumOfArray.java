package almamatter;

public class SumOfArray {

	public static void main(String[] args) {

		int[] array = {1, 2, 3, 4, 5};
		int sum = 0;
		//Advanced for loop
		for( int num : array) {
		sum = sum+num;
		}
		System.out.println("Sum of array elements is:"+sum);

	}

}
