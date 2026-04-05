package com.mycompany.project.smart.library;
public class SmartLibrary {
    public static void main(String[] args)
    {
        Media[] library = new Media[4];
        library[0] = new Movie("Inception", 2010, 8.8, "Christopher Nolan");
        library[1] = new Movie("The Matrix", 1999, 8.7, "Wachowskis");
        library[2] = new Movie("Interstellar", 2014, 8.6, "Christopher Nolan");
        library[3] = new Movie("The Dark Knight", 2008, 9.0, "Christopher Nolan");
        
        for(int i =0; i<library.length -1; i++)
        {
            for(int j =0;j<library.length-i-1;j++)
            {
                if(library[j].getRating() < library[j+1].getRating())
                {
                    Media temp =library[j];
                    library[j]=library[j+1];
                    library[j+1] = temp;
                }
            }
        }
        
        System.out.println("The library is sorting by rating");
        for(int i =0;i<library.length;i++)
        {
            Media m = library[i];
            m.show();
        }
    }
}
