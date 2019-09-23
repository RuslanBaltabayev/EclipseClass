package day60;

import java.awt.Rectangle;

import day58.Shape;
import day58.Square;
import day58.Triangle;

public class SmartTV extends TV {
	
    int channelCount = 200;
	
	@Override
	public void play() {
		System.out.println("playing Smart TV");
	}
	@Override
	public int getChannelCount() {
		
				return channelCount;
	}
	public static void doStatic() {
		System.out.println("do Smart TV static");
	}
	
	public static void main(String[] args) {
		
		TV t1 = new SmartTV();
		System.out.println(t1.channelCount);
		t1.play();
		System.out.println(t1.getChannelCount());
		t1.doStatic();
		
		System.out.println("------------------");
		
		SmartTV tv2 = new SmartTV();
		System.out.println(tv2.channelCount);
		tv2.play();
		System.out.println(tv2.getChannelCount());
		tv2.doStatic();
		
		System.out.println("----------------");
		Shape s1 = new Triangle("red", 12, 10);
		describeTheShape(s1);
		describeTheShape(new Square("blue", 5));
		
		
		
	}
	
	public static void describeTheShape(Shape anyShape) {  
	    System.out.println("calling describeTheShape(Shape anyShape)");
	    anyShape.draw();
	  }

}
