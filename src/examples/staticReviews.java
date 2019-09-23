package examples;

public class staticReviews {
	
	int  x;
	
	public staticReviews(int x) {
		this.x=x;
			}

	
}

class finalreview extends staticReviews{
	
	public finalreview() {
		super(100);
		
		}
	
	public static void main(String[] args) {
		staticReviews st = new staticReviews(200);
		System.out.println(st.x);
		finalreview f = new finalreview();
		System.out.println(f.x);
	}
}

