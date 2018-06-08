package model;

public class Answer {
private int aid;
private String ansName;
private String postedBy;

public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAnsName() {
	return ansName;
}
public void setAnsName(String ansName) {
	this.ansName = ansName;
}
public String getPostedBy() {
	return postedBy;
}
public void setPostedBy(String postedBy) {
	this.postedBy = postedBy;
}

@Override
public String toString() {
	return "Answer [aid=" + aid + ", ansName=" + ansName + ", postedBy=" + postedBy + "]";
}


}
