package model;

public class Movies {
private int id;
private String name;
private int Aid;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAid() {
	return Aid;
}
public void setAid(int aid) {
	Aid = aid;
}
public Movies() {

}
public Movies(int id, String name, int aid) {
	super();
	this.id = id;
	this.name = name;
	Aid = aid;
}



}
