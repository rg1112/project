package hq.javabean.com;

public class Goods {
private int g_id;
private String g_name;
private double g_cb_price;
private double g_xs_price;
private String g_maker;
public Goods(int g_id, String g_name, double g_cb_price, double g_xs_price, String g_maker) {
	super();
	this.g_id = g_id;
	this.g_name = g_name;
	this.g_cb_price = g_cb_price;
	this.g_xs_price = g_xs_price;
	this.g_maker = g_maker;
}

public Goods(String g_name, double g_cb_price, double g_xs_price, String g_maker) {
	super();
	this.g_name = g_name;
	this.g_cb_price = g_cb_price;
	this.g_xs_price = g_xs_price;
	this.g_maker = g_maker;
}

public Goods() {
	super();
}
public int getG_id() {
	return g_id;
}
public void setG_id(int g_id) {
	this.g_id = g_id;
}
public String getG_name() {
	return g_name;
}
public void setG_name(String g_name) {
	this.g_name = g_name;
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
public String getG_maker() {
	return g_maker;
}
public void setG_maker(String g_maker) {
	this.g_maker = g_maker;
}
@Override
public String toString() {
	return "Goods [g_id=" + g_id + ", g_name=" + g_name + ", g_cb_price=" + g_cb_price + ", g_xs_price=" + g_xs_price
			+ ", g_maker=" + g_maker + "]";
}

}
