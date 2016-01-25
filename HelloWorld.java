import java.util.Scanner;
public class HelloWorld {

  public static void main(String[] args){
    System.out.println("Please enter a word or phrase");
    Scanner input=new Scanner(System.in);
    String h=input.next();

    for (int i=0; i<h.length();i++){
      char lettre = h.charAt(i);

      if( lettre == 'a' ){
        lettre = '-';
      }
      if( lettre == 'e' ){
        lettre = '-';
      }
      if( lettre == 'i' ){
        lettre = '-';
      }
      if( lettre == 'o' ){
        lettre = '-';
      }
      if( lettre == 'u' ){
        lettre = '-';
      }
      if( lettre == 'y' ){
        lettre = '-';
      }

      System.out.println(lettre);
    }
  }
}
