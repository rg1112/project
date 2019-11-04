package hq.javabean.com;

public class FengYi {
private int start;
private int row=3;

public FengYi(int start, int row) {
	super();
	this.start = start;
	this.row = row;
	
}
public FengYi() {
	super();
}
public int getStart() {
	return start;
}
public void setStart(int start) {
	this.start = start;
}
public int getRow() {
	return row;
}
public void setRow(int row) {
	this.row = row;
}


}
