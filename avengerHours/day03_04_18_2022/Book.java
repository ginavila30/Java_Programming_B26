package day03_04_18_2022;

public class Book {

    //Instance Vx
    String name;
    String category;
    String author;
    String bookId;
    int shelfNum;
    //Static Vx
    static int bookCount;
    //static block
    static {
        bookCount=0;
    }
    //Constructor
    public Book(String name){
        this.name=name;   bookCount++;
        IdGenerator();
    }
    public Book(String name, String category){
        this(name);
        this.category=category;
    }
    public Book (String name, String category, String author){
     this(name,category);
     this.author=author;
     IdGenerator();

    }


 @Override
 public String toString() {
  return "Book->" +
          (name == null ?"": "Name= " + name + ", " )+
          (category == null ?"": "Category= " + category + ", " )+
          (author == null ?"": "Author= " + author + ", " )+
          ( bookId == null ?"": "Book ID= " + bookId + ", " )+
          ( shelfNum == 0 ?"": "ShelfNum= "+shelfNum+", ");
 }

 public void IdGenerator(){
        if(category!=null){
  switch (category.toLowerCase()){
   case "adventure":shelfNum=1;break;
   case "classics":shelfNum=2;break;
   case "comics":shelfNum=3;break;
   case "fantasy":shelfNum=4;break;
   case "history":shelfNum=5;break;
   default:shelfNum=0;
  }}
if(author!=null){
  bookId=shelfNum+"_"+author.charAt(0)+"_"+name.substring(0,2);}
}
}
