package day49;

public class WarmUp {

	public static void main(String[] args) {

	Book b1 = new Book();
	b1.author="Jon Snow";
	b1.chapterCount=8;
	b1.pageCount=300;
	b1.price=19.99;
	
	AudioBook au1 = new AudioBook();
	au1.author="Spartan";
	au1.audioLength=129.8f;
	au1.chapterCount=7;
	au1.pageCount=120;
	au1.price=12.99;
	
	PaperBook p1 = new PaperBook();
	p1.author="Batch11";
	p1.chapterCount=5;
	p1.pageCount=30;
	p1.price=5.99;
	p1.weight=10.5;
	p1.hardCover=true;
	}

}
