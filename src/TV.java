
public class TV {

	private int channel=1;
	private int volumeLevel=1;
	private boolean on=false ;
	private String brand="undefined";
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel>0&&channel<=120)
		this.channel = channel;
	}
	public int getVolumeLevel() {
		return volumeLevel;
	}
	public void setVolumeLevel(int volumeLevel) {
		if(volumeLevel>=1&&volumeLevel<=7)
		this.volumeLevel = volumeLevel;
	}
	public boolean getOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void channelUp() {
		if(on==true) {
			if(channel>0&&channel<120)
			channel++;
		else
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
		else
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		
	}
	public void channelDown() {
		if(on==true) {
			if(channel>1&&channel<121)
			channel--;
		else
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
		else
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		
	}
	
	public void volumeUp() {
		if(on==true) {
			if(volumeLevel>0&&volumeLevel<7)
				volumeLevel++;
			else
				System.out.println("ERROR: TV is either OFF or invalid Volume level");	
		}
		else
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
	}
	
	public void volumeDown() {
		if(on==true) {
			if(volumeLevel>1&&volumeLevel<8)
				volumeLevel--;
			else
				System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
		else
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
	}
	
	public TV() {
		System.out.println("Creating TV object using no Args-constructor");
	}
	
	public TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}
	
	public boolean isOn() {
		return on;
	}
	public void turnOn() {
		if(on==false)
			on=true;
		else
			System.out.println("TV is already ON"); 
	}
	public void turnOff() {
		if(on==true)
		on=false;
	else
		System.out.println("TV is already OFF"); 
	}
	
	
	
}
