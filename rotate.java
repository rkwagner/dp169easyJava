import java.util.Scanner;

public class rotate{
	public static void main(String[] args){
		int arrSize;
		Scanner in = new Scanner(System.in);
		System.out.print("Array size: ");
		arrSize = Integer.parseInt(in.nextLine());
		int [] [] array = new int[arrSize][arrSize];
		//Create array from the input.
		for(int i = 0;i < arrSize;i++){
			Scanner line = new Scanner(in.nextLine());
			for(int j = 0;j < arrSize;j++){
				array[i][j] = line.nextInt();
			}
		}
		printArray(array,arrSize,0);
		array=rotate(array, arrSize);
		printArray(array,arrSize,90);
		array=rotate(array, arrSize);
		printArray(array,arrSize,180);
		array=rotate(array, arrSize);
		printArray(array,arrSize,270);

	}

	static int[][] rotate(int[][] array, int arrSize){
		int [][]tempArray=new int[arrSize][arrSize];
		for(int i=0;i<arrSize;i++){
			for(int j=0;j<arrSize;j++){
				tempArray[j][arrSize-i-1]=array[i][j];
			}
		}
		return tempArray;
	}

	static void printArray(int[][] array, int arrSize, int angle){
		System.out.println("\nAngle: " + angle);
		for(int i = 0;i < arrSize;i++){
			for(int j = 0;j < arrSize;j++){
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
