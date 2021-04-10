class Author{
	String name;
	String email;
	char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
}
public class Book {
	Author author=new Author("Herbert","hb@gmail.com",'M');
    String name;
    double price;
    int qtyInStock;
    
    Book(String name){
    	this.name=name;
    }
    //getter
    public void getAuthor() {
    	System.out.println("The name of the author is:"+author.name);
    	System.out.println("The email id of the author is:"+author.email);
    	System.out.println("The gender of the author is:"+author.gender);
    }
    public String getName() {
    	return name;
    }
    public double getPrice() {
    	return price;
    }
    public int getQuantity() {
    	return this.qtyInStock;
    }
    //setter
    public void setPrice(double price) {
    	this.price=price;
    }
    public void setQuantity(int quantity) {
    	this.qtyInStock=quantity;
    }
    //main
    public static void main(String args[]) {
    	Book b=new Book("Java");
    	b.setPrice(1000);
    	b.setQuantity(3);
    	System.out.println("The name of the book is:"+b.getName());
    	System.out.println("The price of the book is:"+b.getPrice());
    	System.out.println("The stock of the book is:"+b.getQuantity());
    	b.getAuthor();
    	
    }
}

