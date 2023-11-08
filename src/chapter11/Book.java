package chapter11;

public class Book implements Product{

    private double price;
    private String name;
    private String color;
    private String author;
    private String isbn;
    private int pages;
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
