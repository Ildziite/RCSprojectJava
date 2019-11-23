package lecture9;
class Book{
	String author;
	int pages;
	String title;
	
	public Book(){
		this("",0,"");
	}
	
	public Book(String author, int pages, String title){
		this.author=author;
		this.pages=pages;
		this.title=title;
	}
	
	public Book(String title){
		this.title=title;
		this.author="";
		this.pages=0;
	}
	
	String output(){
		return "Title: "+title+" author: "+author+" pages: "+pages;
	}
	
	String getAuthor() {
		return author;
	}
	
	String gettitle() {
		return title;
	}
	
	int getPages() {
		return pages;
	}
	
	void setAuthor(String author) {
		this.author = author;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	
	void sePages(int pages) {
		this.pages = pages;
	}
}
public class ConstructorTask {

	public static void main(String[] args) {
		Book book1 = new Book();
		System.out.println(book1.output());
		Book book2 = new Book("Abele",154,"Ziedi");
		System.out.println(book2.output());
		Book book3 = new Book("Makoni");
		System.out.println(book3.output());
		

	}

}
