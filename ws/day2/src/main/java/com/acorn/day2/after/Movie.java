package com.acorn.day2.after;

import org.springframework.stereotype.Component;

//@Component
public class Movie {

    // 멤버변수(필드)
    private String title;      // 제목
    private String director;   // 감독
    private int year;          // 개봉 연도
    private double rating;     // 평점 (0.0 ~ 10.0 같은 느낌으로)

    Screen screen;
    
    // 기본 생성자
    public Movie() {
    	
    	this("재미있는영화" , "전희연" , 2024 ,  15.3);
    }
    
   
    
    
    //생성자
    public Movie(Screen screen) {
		super();
		this.screen = screen;
	}




    //세터
	public void setScreen(Screen screen) {
		this.screen = screen;
	}





	// 모든 필드를 받는 생성자
    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    // getter & setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    @Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", year=" + year + ", rating=" + rating
				+ ", screen=" + screen + "]";
	}




	public void setRating(double rating) {
        this.rating = rating;
    }

    
}
