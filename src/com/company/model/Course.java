package com.company.model;

public class Course {
    private String title;
    private double rating;
    private int students;


    public Course(String title, double rating, int students) {
        this.title = title;
        this.rating = rating;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "{ title : " + title + " , rating : " + rating + ", students : " + students + " } \n";
    }
}
