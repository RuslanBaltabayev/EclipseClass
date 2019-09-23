
public class ArrayPractice {

	public static void main(String[] args) {
		
		int [] arr = new int[3];     //arr[]={4,2,6};    BAD CODE...
		arr[0] = 4;
		arr[1] = 2;
		arr[2] = 6;
		int [] arr1 = new int[] {3,5,7};
		int [] arr2 = {4,8,11,12};
		
		int[]arr3 = new int[3];
		int x= 1;
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=x;
			x+=2;	
			
		}
	
			
		}
	public static int[] addElements(int[] ints1,int[] ints2) {
		
		int[] ints = new int[ints1.length];
		for(int i = 0;i<ints.length;i++) {
			ints[i]=ints1[i]+ints2[i];
			
		}
		return ints;

	}

}
