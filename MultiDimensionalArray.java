import java.util.Arrays;

public class MultiDimensionalArray {
	
	
	

	public static void main(String[] args) {
		int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
		int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};
		
		System.out.println("Values in array1 by row are");
		outPutArray(array1);
		
		System.out.printf("%nValues in array2 by row are%n");
		outPutArray(array2);
		
	}
		
		public static void outPutArray(int [][] array) {
			for (int row=0; row<array.length; row++) {
				for (int column=0; column<array[row].length; column++) {

					System.out.printf("%d  ", array[row][column]);
//					System.out.println(Arrays.deepToString(array));
					System.out.println();
					
					
				
			}
			
		}

	}

}


