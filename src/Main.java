import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int A[] = {-1, -1, 6, 1,  9, 3, 2, -1, 4,-1}; 
		
		
    System.out.println(Arrays.toString(fixArray(A))); 

	}
	private static int[] fixArray(int[] array) {
		for(int i = 0; i< array.length; i++) {
			if(array[i] != -1 && array[i]!=i) {
				
				int x = array[i];
				while (array[x] != -1 && array[x]!=x) {
					int y = array[x];
					array[x] = x;
					x = y;
				}
				array[x] = x;
				
				if(array[i] != i){
					array[i] = -1;
				}
			}
		}
		return array;
	}
}
