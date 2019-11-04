package library.javabean.hq;

public class Book {
private int book_id;
private String book_name;						
private String book_type;						
private String book_author;						
private String book_publish;						
private String book_condition;

public Book() {
	super();
}
public Book(String book_name, String book_type, String book_author, String book_publish, String book_condition) {
	super();
	this.book_name = book_name;
	this.book_type = book_type;
	this.book_author = book_author;
	this.book_publish = book_publish;
	this.book_condition = book_condition;
}
public int getBook_id() {
	return book_id;
}
public void setBook_id(int book_id) {
	this.book_id = book_id;
}
public String getBook_name() {
	return book_name;
}
public void setBook_name(String book_name) {
	this.book_name = book_name;
}
public String getBook_type() {
	return book_type;
}
public void setBook_type(String book_type) {
	this.book_type = book_type;
}
public String getBook_author() {
	return book_author;
}
public void setBook_author(String book_author) {
	this.book_author = book_author;
}
public String getBook_publish() {
	return book_publish;
}
public void setBook_publish(String book_publish) {
	this.book_publish = book_publish;
}
public String getBook_condition() {
	return book_condition;
}
public void setBook_condition(String book_condition) {
	this.book_condition = book_condition;
}
@Override
public String toString() {
	return "Book [book_id=" + book_id + ", book_name=" + book_name + ", book_type=" + book_type + ", book_author="
			+ book_author + ", book_publish=" + book_publish + ", book_condition=" + book_condition + "]";
}						

}
