/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/

public abstract class MI implements Rentable {
    private String title;
    private int year;

    public MI(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() { return title; }
    public int getYear() { return year; }
    public abstract String getDetails();
}