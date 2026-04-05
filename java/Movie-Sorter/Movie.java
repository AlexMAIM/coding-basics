package com.mycompany.project.smart.library;
public class Movie extends Media {
    public String director;
    public Movie(String title, int publishYear, double rating, String director)
    {
        super(title,publishYear,rating);
        this.director=director;
    }
    @Override
    public void show()
    {
        super.show();
        System.out.println(" | Director: " + director);
    }
}
