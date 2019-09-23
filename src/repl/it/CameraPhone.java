package repl.it;

public class CameraPhone extends Phone {

	int imageSize;
	  int memorySize;
	  
	  public CameraPhone(int a,int b){
	    this.imageSize=a;
	    this.memorySize=b;
	  }
	  public int numPictures(){
	    int numPic=memorySize*1000/imageSize;
	    return numPic;
	  }
}
