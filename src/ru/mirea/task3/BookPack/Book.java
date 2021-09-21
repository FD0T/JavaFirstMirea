package ru.mirea.task3.BookPack;

public class Book {
    private String author;
    private String name;
    private boolean solid_cover;
    private int number_of_pages;
    private int publish_day;
    private int publish_month;
    private int publish_year;
    private double star_rate;

    Book(){}
    Book(String author, String name){
        this.author = author;
        this.name = name;
    }
    Book(String author, String name, int publish_year) {
        this.author = author;
        this.name = name;
        this.publish_year = publish_year;
    }
    Book(String author, String name, int publish_year, double star_rate) {
        this.author = author;
        this.name = name;
        this.publish_year = publish_year;
        this.star_rate = star_rate;
    }

    Book(String author, String name, int publish_day, int publish_month, int publish_year){
        this.author = author;
        this.name = name;
        this.publish_day = publish_day;
        this.publish_month = publish_month;
        this.publish_year = publish_year;
    }
    Book(String author, String name, int publish_day, int publish_month, int publish_year, double star_rate){
        this.author = author;
        this.name = name;
        this.publish_day = publish_day;
        this.publish_month = publish_month;
        this.publish_year = publish_year;
        this.star_rate = star_rate;
    }
    Book(String author, String name, boolean solid_cover, int number_of_pages, int publish_day, int publish_month, int publish_year, double star_rate)
    {
        this.author = author;
        this.name = name;
        this.solid_cover = solid_cover;
        this.number_of_pages = number_of_pages;
        this.publish_day = publish_day;
        this.publish_month = publish_month;
        this.publish_year = publish_year;
        this.star_rate = star_rate;
    }
    public void setAuthor(String author) { this.author = author; }
    public String getAuthor() { return author; }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setSolid_cover(boolean solid_cover) { this.solid_cover = solid_cover; }
    public boolean isSolid_cover() { return solid_cover; }
    public void setNumber_of_pages(int number_of_pages) { this.number_of_pages = number_of_pages; }
    public int getNumber_of_pages() { return number_of_pages; }
    public void setPublish_day(int publish_day) { this.publish_day = publish_day; }
    public int getPublish_day() { return publish_day; }
    public void setPublish_month(int publish_month) { this.publish_month = publish_month; }
    public int getPublish_month() { return publish_month; }
    public void setPublish_year(int publish_year) { this.publish_year = publish_year; }
    public int getPublish_year() { return publish_year; }
    public void setStar_rate(double star_rate) { this.star_rate = star_rate; }
    public double getStar_rate() { return star_rate; }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", solid_cover=" + solid_cover +
                ", publish_year=" + publish_year +
                ", star_rate=" + star_rate +
                '}';
    }
}
