package model;

import java.util.List;

public class Question {
private int Qid;
private String Qname;
private List<Answer>answer;

public int getQid() {
	return Qid;
}
public void setQid(int qid) {
	Qid = qid;
}
public String getQname() {
	return Qname;
}
public void setQname(String qname) {
	Qname = qname;
}
public List<Answer> getAnswer() {
	return answer;
}
public void setAnswer(List<Answer> answer) {
	this.answer = answer;
}

@Override
public String toString() {
	return "Question [Qid=" + Qid + ", Qname=" + Qname + ", answer=" + answer + "]";
}


}
