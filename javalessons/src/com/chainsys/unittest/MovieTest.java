package com.chainsys.unittest;

import com.chainsys.classandmethods.Movie;

public class MovieTest {
	
	public static void testmvname() {
		
		Movie firstmovie=new Movie("Moonu");
		
		firstmovie.setActor("Dhanush");
		firstmovie.setActress("shruthi");
		firstmovie.setMusic("Anirudh");
		firstmovie.setReleasedate(2012);
		
		System.out.println(firstmovie.getMoviename());
		System.out.println(firstmovie.getActor());
		System.out.println(firstmovie.getActress());
		System.out.println(firstmovie.getMusic());
		System.out.println(firstmovie.getReleasedate());
	}

}
