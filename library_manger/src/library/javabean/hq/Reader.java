package library.javabean.hq;

public class Reader {
	private int reader_id;
	private String reader_borrowno;	
	private String reader_name;						
	private String reader_sex;					
	private String reader_phone;
	private String reader_school;				
	private String reader_class;
	
	public Reader() {
		super();
	}
	public Reader(String reader_borrowno, String reader_name, String reader_sex, String reader_phone,
			String reader_school, String reader_class) {
		super();
		this.reader_borrowno = reader_borrowno;
		this.reader_name = reader_name;
		this.reader_sex = reader_sex;
		this.reader_phone = reader_phone;
		this.reader_school = reader_school;
		this.reader_class = reader_class;
	}
	public int getReader_id() {
		return reader_id;
	}
	public void setReader_id(int reader_id) {
		this.reader_id = reader_id;
	}
	public String getReader_borrowno() {
		return reader_borrowno;
	}
	public void setReader_borrowno(String reader_borrowno) {
		this.reader_borrowno = reader_borrowno;
	}
	public String getReader_name() {
		return reader_name;
	}
	public void setReader_name(String reader_name) {
		this.reader_name = reader_name;
	}
	public String getReader_sex() {
		return reader_sex;
	}
	public void setReader_sex(String reader_sex) {
		this.reader_sex = reader_sex;
	}
	public String getReader_phone() {
		return reader_phone;
	}
	public void setReader_phone(String reader_phone) {
		this.reader_phone = reader_phone;
	}
	public String getReader_school() {
		return reader_school;
	}
	public void setReader_school(String reader_school) {
		this.reader_school = reader_school;
	}
	public String getReader_class() {
		return reader_class;
	}
	public void setReader_class(String reader_class) {
		this.reader_class = reader_class;
	}
	@Override
	public String toString() {
		return "Reader [reader_id=" + reader_id + ", reader_borrowno=" + reader_borrowno + ", reader_name="
				+ reader_name + ", reader_sex=" + reader_sex + ", reader_phone=" + reader_phone + ", reader_school="
				+ reader_school + ", reader_class=" + reader_class + "]";
	}					

}
