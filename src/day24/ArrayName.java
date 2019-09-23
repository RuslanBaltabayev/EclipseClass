package day24;

public class ArrayName {

	public static void main(String[] args) {
		
		char [] name = new char[6];
		name [0]='R';
		name [1]='U';
		name [2]='S';
		name [3]='L';
		name [4]='A';
		name [5]='N';
	
		for(int i=0;i<name.length;i++) {
		System.out.print(name[i]);
	}
		System.out.println();

		
		char[] name1 = new char[]{'R','U','S','L','A','N'};
		
		char[] name2 = {'R','U','S','L','A','N'};
		
		System.out.println(name[name.length-1]);

		System.out.println(name1[name1.length/2]);
	}

}
