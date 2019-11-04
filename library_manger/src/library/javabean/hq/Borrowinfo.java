package library.javabean.hq;

public class Borrowinfo {
	private int brinfo_id;								
	private int book_id;
	private int reader_id;							
	private String brinfo_borrowtime;	
	private String brinfo_returntime;
	private int brinfo_cash;
	
	public Borrowinfo(int book_id, int reader_id, String brinfo_borrowtime, String brinfo_returntime, int brinfo_cash) {
		super();
		this.book_id = book_id;
		this.reader_id = reader_id;
		this.brinfo_borrowtime = brinfo_borrowtime;
		this.brinfo_returntime = brinfo_returntime;
		this.brinfo_cash = brinfo_cash;
	}
	public int getBrinfo_id() {
		return brinfo_id;
	}
	public void setBrinfo_id(int brinfo_id) {
		this.brinfo_id = brinfo_id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getReader_id() {
		return reader_id;
	}
	public void setReader_id(int reader_id) {
		this.reader_id = reader_id;
	}
	public String getBrinfo_borrowtime() {
		return brinfo_borrowtime;
	}
	public void setBrinfo_borrowtime(String brinfo_borrowtime) {
		this.brinfo_borrowtime = brinfo_borrowtime;
	}
	public String getBrinfo_returntime() {
		return brinfo_returntime;
	}
	public void setBrinfo_returntime(String brinfo_returntime) {
		this.brinfo_returntime = brinfo_returntime;
	}
	public int getBrinfo_cash() {
		return brinfo_cash;
	}
	public void setBrinfo_cash(int brinfo_cash) {
		this.brinfo_cash = brinfo_cash;
	}
	@Override
	public String toString() {
		return "Borrowinfo [brinfo_id=" + brinfo_id + ", book_id=" + book_id + ", reader_id=" + reader_id
				+ ", brinfo_borrowtime=" + brinfo_borrowtime + ", brinfo_returntime=" + brinfo_returntime
				+ ", brinfo_cash=" + brinfo_cash + "]";
	}	

}
