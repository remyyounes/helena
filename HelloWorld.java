import java.util.Scanner;
public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Please enter a word or phrase");
    Scanner input=new Scanner(System.in);
    String word = input.next(); //he
    // he le na
    while ( word.length() > 0 )  {

      for (int i=0; i<word.length();i++) {
        char lettre = word.charAt(i);

        if( lettre == 'a' ) {
          lettre = '\0';
        }
        if( lettre == 'e' ) {
          lettre = '\0';
        }
        if( lettre == 'i' ) {
          lettre = '\0';
        }
        if( lettre == 'o' ) {
          lettre = '\0';
        }
        if( lettre == 'u' ) {
          lettre = '\0';
        }
        if( lettre == 'y' ) {
          lettre = '\0';
        }
        System.out.print(lettre);
      }
      word = input.next();
    }
  }
}
