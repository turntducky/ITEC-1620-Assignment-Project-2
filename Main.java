//Books
public class Book{
private String title;
private String author;
private String publisher;
private int crdate;
public Book(String title,String author, String publisher,int crdate){
 this.title=title;
 this.author=author;
 this.publisher=publisher;
 this.crdate=crdate;
}
public String getTitle(){
 return title;
}
public void setTitle(String title){
 this.title=title;
}
public String getAuthor(){
 return author;
}
public void setAuthor(String author){
 this.author=author;
}
public String getPublisher(){
 return publisher;
}
public void setPublisher(String publisher){
 this.publisher=publisher;
}
public int getCrdate(){
 return crdate;
}
public void setCrdate(int crdate){
this.crdate=crdate;
}
public String toString(){
String description= " ";
description += "Title:\t"+title+ "\n";
description += "Author:\t"+author+ "\n";
description += "Publisher:\t"+publisher+ "\n";
description += "Copyright Date:\t"+crdate+ "\n";
return description;
}
 public static void main(String[] args){
 final int year1=1993;
 final int year2=2009;
 final int year3=2012;
 Book b1=new Book("Black Swan\n", "Mary\n" , "Tom\n",year1);
 Book b2=new Book("Iron Man\n", "Stan Lee\n", "Marvel\n", year2);
 Book b3=new Book("Arrow\n", "Edward\n", "DC\n",year3);
 System.out.println(b1);
 System.out.println(b2);
 System.out.println(b3);
}
}



//Dice
public class Die{
  private final int MAX=6;
  private int faceValue;
  public Die(){
   faceValue=1;
  }
  public int roll(){
   facevalue=(int)(Math.random()*MAX)+1;
   ruturn faceValue;
  }
  public void setFaceValue(int value){
   faceValue=value;
  }
  public int getFaceValue(){
   return faceValue;
}
public String toString(){
 String result=integer.toString(faceValue);
}
}

public class PairOfDice{
Die die1 = new Die();
Die die2 = new Die();
public int roll(){
return (die1.roll() + die2.roll());
}
public int getTotal(die1 die2){
return die1.getFaceValue() + die2.getFaceValue();
}
public void setDie1(int num){
 faceValue=num;
}
public int getDie1(){
return die1.getFaceValue();
}
public void setDie2(int num){
 faceValue=num;
}
public int getDie2(){
return die2.getFaceValue();
}
public String toString;{
 return ""+ getTotal();
}
}

public class RollingDice2{
 public static void main(String[] args){
  PairOfDice fDice= new PairOfDice();
  PairOfDice sDice= new PairOfDice();
  int sum;
  fDice.setDie1(2);
  fDice.getDie1();
  System.out.println(fDice);
  sDice.setDie2(4);
  sDice.getDie2();
  System.out.println(sDice);
sum= getTotal(fDice,sDice);
  System.out.println(sum);
 }
}

//Slot machine
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
 final int DIGITS = 9;
 int slot1, slot2, slot3;
 String again;
 Scanner scan = new Scanner(System.in);
 again = "y";
 while (again.equalsIgnoreCase("y")) {
  slot1 = (int)(Math.random() * DIGITS);
  slot2 = (int)(Math.random() * DIGITS);
  slot3 = (int)(Math.random() * DIGITS);
  System.out.println(slot1 + " " + slot2 + " " + slot3);
  if (slot1 == slot2 && slot2 == slot3) System.out.println("Jackpot! You win!");
  
  if (slot1 == slot2 || slot2 == slot3 || slot1 == slot3);System.out.println("Matched 2! Not bad!");
  System.out.println();
  System.out.print("Play again (y/n)?: ");
  again = scan.nextLine();
  
  if (slot1 != slot2 && slot2 != slot3);
  System.out.println(slot1 + " " + slot2 + " " + slot3);
  System.out.println("You lost :(");
  System.out.println();
  System.out.println("Play again (y/n)?: ");
  again = scan.nextLine();
   }
  }
}


//Stars
public class Main {
    public static void main(String[] args) {
        for (int row = 0; row < 11; ++row) {
            for (int spaces = 0; spaces < 11 - row; ++spaces) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < row; ++stars) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Vowels
import java.util.Scanner;
    public class Main{


    public static void main(String args []){

    int a =0, e = 0, x = 0;
    int u = 0, o = 0, other = 0;
    String text;
    Scanner scan = new Scanner(System.in);


    System.out.print("enter string: ");
    text = scan.nextLine();

    for (int i = 0; i < text.length(); i++) {
    char c = text.charAt(i);

    if (c=='a')
    a++; 

    else if( c=='e')
    e++;

    else if(c=='i')
    x++;

    else if(c=='o')
    o++;

    else if (c=='u')
    u++;        

    else
    other++;
    }

    System.out.println("a: " + a + "\n" +
    "e: " + e + "\n" +
    "i: " + x + "\n" +
    "o: " + o + "\n" +
    "u: " + u + "\n" +
    "other: " + other);

  }
}
