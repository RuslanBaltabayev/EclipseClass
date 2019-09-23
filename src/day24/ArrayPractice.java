package day24;

public class ArrayPractice {

	public static void main(String[] args) {

		int[] numbers = { 1, 4, 6, 8, 9 };

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println();
		numbers[2] *= 2;

		numbers[3] = numbers[0] + numbers[1];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < numbers.length; i++) {
			int x;
			x = numbers[0];
			numbers[0] = numbers[numbers.length-1];
			numbers[numbers.length-1] = x;
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		int sum =0;
		for(int i=0;i<numbers.length;i++) {
			sum = sum+numbers[i];
		}
		System.out.println(sum);
		
		int max=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
			
		}
			
			System.out.print(max);
			
			
			
		

	}

}
