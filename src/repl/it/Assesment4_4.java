package repl.it;

import java.util.ArrayList;

public class Assesment4_4 {
	 String s;
	
	//public final static  int foo =7;
int x = Integer.valueOf("1");
		int y = Integer.valueOf("2");
	public static void main(String[] args) {
		
		System.out.println(!false);
		String str;
		//System.out.println(str);
		
		int x=5;
		
		System.out.println(x);
		
		float f = 5.0f;
		int i ; double d=7;
		
		double h = new Double(12);
		Double k = new Double(13);
		double j = Double.valueOf(k);
		System.out.println(j);
		
		Integer sa = Integer.parseInt("5");
		System.out.println(sa);
		
		Character c = new Character('a');
		//Byte b = new Byte(2);
		
		Double l = d;
		System.out.println(h+" "+k);
		
		Assesment4_4 foo = new Assesment4_4();
		System.out.println(foo.x);
		System.out.println(foo.s);
//		int a = 3;
//		int b = 5;
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a+" "+b);
	
	}
	public void removeEveryOther(ArrayList<ArrayList<String>> words){
		 for(int i=0;i<words.size();i++)
			 words.remove(i);
			
		}
		}

