package a03.q2;
class book {
    String name,
           authorName;
    int totalPages,
        editionNumber;

    book(){

        name = "Java - Complete Reference";
        authorName = "Herzd";
        totalPages = 800;
        editionNumber = 2009;
    }

    void show(){

        System.out.println("Book Name       : " + name );
        System.out.println("Author Name     : " + authorName );
        System.out.println("No of Pages     : " + totalPages );
        System.out.println("Edition Number  : " + editionNumber);
    }
}
