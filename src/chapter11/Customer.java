package chapter11;

public class Customer {
    public static void main(String[] args) {
        Product book = new Book();
        book.setName("Abdoly life");
        book.setColor("Black");
        book.setPrice(999999999);

        System.out.println(book.getName());
        System.out.println(book.getPrice());
        System.out.println(book.getColor());
        System.out.println(book.getBarcode());

        System.out.println("new Book \n\n\n");
        Book book1 = new Book();
        book1.setAuthor("Abdallh Metwally");
        book1.setIsbn("msh 3arf");
        book1.setPages(24);
        book1.setName(book.getName());
        book1.setColor(book.getColor());
        book1.setPrice(book.getPrice());

        System.out.println(book1.getName());
        System.out.println(book1.getPrice());
        System.out.println(book1.getColor());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getIsbn());
        System.out.println(book1.getPages());
        System.out.println(book1.getBarcode());

    }
}
