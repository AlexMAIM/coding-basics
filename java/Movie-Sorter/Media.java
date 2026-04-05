package com.mycompany.project.smart.library;
public class Media {
    private String title;
    private int publishYear;
    private double rating;
    public Media(String title, int publishYear, double rating)
    {
        this.title=title;
        this.publishYear=publishYear;
        this.rating= rating;
    }
    public String getTitle() {return title;}
    public double getRating() {return rating;}
    public void show()
    {
        System.out.print(title + " (" + publishYear + ") - Rating: " + rating);
    }
}
