
public class PhoneFactory1 {

	public static void main(String[] args) {
	
		PhoneClass iphone = new PhoneClass();
		iphone.brand = "Apple";
		iphone.model = "iphoneMax";
		iphone.OS = "IOS";
		iphone.storageSize = 256;
		iphone.ram = 8;
		iphone.camera = 5;
		iphone.price = 1299.99;
		iphone.color = "Gold";
		iphone.isWaterResistant = true;
		iphone.cpu = "Apple Bionic A13";
		iphone.imei = 123456789l;
		iphone.ring();
		iphone.call();
		iphone.dila(4444444444l);
		iphone.sms("hello world", 4212345678l);
		
		System.out.println("Phone brand is "+iphone.brand);
	}

}
