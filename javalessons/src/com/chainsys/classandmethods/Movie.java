package com.chainsys.classandmethods;

public class Movie {
	private String moviename;
	private String actor;
	private String actress;
	private String music;
	private int releasedate;
	
	//constructor
	public Movie(String movie) {
		this.moviename=movie;
	}
	
	public String getMoviename() {
		return moviename;
	}
	
	
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	
	
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	
	
	public String getMusic() {
		return music;
	}
	public void setMusic(String music) {
		this.music = music;
	}
	
	
	public int getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(int releasedate) {
		this.releasedate = releasedate;
	}
	}
