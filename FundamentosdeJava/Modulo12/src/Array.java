
public class Array {

	public static void main(String[] args) {
		int[] array = new int[5];
		
		array[0] = 0;
		array[1] = 1;
		array[4] = 4;
		
//		for (int i = 0; i < array.length; i++){
//			System.out.println(array[i]);
//		}
		
		for (int i : array) {
			System.out.println(array[i]);
		}


	}

}
