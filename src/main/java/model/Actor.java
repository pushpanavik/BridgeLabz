package model;

import java.util.Set;

public class Actor {
private int Aid;
private String name;
private  Set<Movies> movies;

public Set<Movies> getMovies() {
	return movies;
}
public void setMovies(Set<Movies> movies) {
	this.movies = movies;
}
public int getAid() {
	return Aid;
}
public void setAid(int Aid) {
	this.Aid = Aid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Actor() {
	
}
@Override
public String toString() {
	return "Actor [Aid=" + Aid + ", name=" + name + ", movies=" + movies + "]";
}



}
