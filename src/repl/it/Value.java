package repl.it;

public class Value {
	
	 int i;
	 boolean modified;
	
	public Value() {
		
	}

	public Value(int i) {

		this.i = i;
	}
	
	public void setVal(int i) {
		this.i=i;
		modified=true;
		
	}
	public boolean wasModified() {
		
		if(modified==true)
			return true;
		else
			return false;
		
	}
	public int getVal() {
		if(modified==true)
			return i;
		else if(modified==false)
			return i;
		else
			return 0;
	}

	
	
	

	
}
