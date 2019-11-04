package hq.javabean.com;

public class Jiao_Yi {
private int j_id;
private int g_id;
private int j_num;
private int j_c_num;
private double j_profit;
private double g_cb_price;
private double g_xs_price;
private String g_name;
public Jiao_Yi(int j_id, int g_id, int j_c_num, double j_profit, double g_cb_price, double g_xs_price, String g_name) {
	super();
	this.j_id = j_id;
	this.g_id = g_id;
	this.j_num = j_c_num;
	this.j_profit = j_profit;
	this.g_cb_price = g_cb_price;
	this.g_xs_price = g_xs_price;
	this.g_name = g_name;
}
public Jiao_Yi() {
	super();
}

public Jiao_Yi(int g_id, int j_num, double j_profit, double g_cb_price, double g_xs_price, String g_name) {
	super();
	this.g_id = g_id;
	this.j_num = j_num;
	this.j_profit = j_profit;
	this.g_cb_price = g_cb_price;
	this.g_xs_price = g_xs_price;
	this.g_name = g_name;
}

public int getJ_c_num() {
	return j_c_num;
}
public void setJ_c_num(int j_c_num) {
	this.j_c_num = j_c_num;
}
public int getJ_id() {
	return j_id;
}
public void setJ_id(int j_id) {
	this.j_id = j_id;
}
public int getG_id() {
	return g_id;
}
public void setG_id(int g_id) {
	this.g_id = g_id;
}
public int getJ_num() {
	return j_num;
}
public void setJ_num(int j_num) {
	this.j_num = j_num;
}
public double getJ_profit() {
	return j_profit;
}
public void setJ_profit(double j_profit) {
	this.j_profit = j_profit;
}
public double getG_cb_price() {
	return g_cb_price;
}
public void setG_cb_price(double g_cb_price) {
	this.g_cb_price = g_cb_price;
}
public double getG_xs_price() {
	return g_xs_price;
}
public void setG_xs_price(double g_xs_price) {
	this.g_xs_price = g_xs_price;
}
public String getG_name() {
	return g_name;
}
public void setG_name(String g_name) {
	this.g_name = g_name;
}
@Override
public String toString() {
	return "Jiao_Yi [j_id=" + j_id + ", g_id=" + g_id + ", j_num=" + j_num + ", j_profit=" + j_profit
			+ ", g_cb_price=" + g_cb_price + ", g_xs_price=" + g_xs_price + ", g_name=" + g_name + "]";
}

}
