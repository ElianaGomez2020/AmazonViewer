package com.elicode.amazonviewer.model;

import java.util.ArrayList;

public class Chapter extends Movie implements IVisualizable {

	private int id;
	private int sessionNumber;
	
	public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
		this.setSessionNumber(sessionNumber);
	}
	
	@Override
	public int getId() {
		return this.id;
	}

	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "::CHAPTER::"+
				"\n Title: " + getTitle()+
				"\n Year: " + getYear() + 
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
	}

	public static ArrayList<Chapter> makeChapterList() {
		ArrayList<Chapter> chapters = new ArrayList();
		
		for(int i = 0; i <= 5; i++) {
			chapters.add(new Chapter("Capitulo" +i, "genero" +i, "creador" +i, 45, (short)(2017+i), i));
		}
		
		return chapters;
	}
	
	
	
}
