package example;

import java.util.EnumSet;

public enum Book {
    // declare constants of enum type
    JHTP( "Java How to Program","2012" ),
    CHTP( "C How to Program","2007" ),
    IW3HTP( "Internet & World Wide Web How to Program","2008" ),
    CPPHTP( "C++ How to Program","2012"),
    VBHTP( "Visual Basic 2010 How to Program","2011" ),
    CSHARPHTP( "Visual C# 2010 How to Program","2011" );

    private String title;
    private String copyrightYear;

    Book(String t,String year){
        this.title=t;
        this.copyrightYear=year;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }

    public static void enumTest(){
        System.out.println("All Book:\n");
        for (Book book:Book.values()) {
            //System.out.println(book+"\t"+ book.title + "\t" + book.copyrightYear);
            // System.out.println("==========================");
            System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getCopyrightYear());
        }
            System.out.println( "\nDisplay a range of enum constants:\n" );
            for (Book book1 : EnumSet.range(Book.JHTP,Book.CPPHTP)) {
                System.out.printf("%-10s%-45s%s\n", book1, book1.getTitle(), book1.getCopyrightYear());
            }
    }

}
