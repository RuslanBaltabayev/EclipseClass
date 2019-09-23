package day40;

public class PhoneFactory {

	public static void main(String[] args) {
		
		Phone iphone = new Phone();
		iphone.attribute = "Apple";
		iphone.OS = "IOS";
		iphone.capacity = 64;
		iphone.ring();
		iphone.dial(4252332141L);
		iphone.displayAttribute();
		
		System.out.println();
		
		Phone android = new Phone();
		android.attribute = "Samsung";
		android.OS = "Android";
		android.capacity = 128;
		android.ring();
		android.dial(4252331492l);
		android.displayAttribute();
		
		System.out.println();
		
		Phone pixel = new Phone();
		pixel.attribute = "Google";
		pixel.capacity = 256;
		pixel.OS = "Google OS";
		pixel.ring();
		pixel.dial(4252141414l);
		pixel.displayAttribute();
	}

}
