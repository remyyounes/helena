import java.util.Scanner;
public class HelloWorld {

  public static void main(String[] args){
    System.out.println("Please enter a word or phrase");
    Scanner input=new Scanner(System.in);
    String h=input.next();
    for (int i=0; i<h.length();i++){

      if(h.contains("a")){
        System.out.print(h.replace("a"," "));
      }
      if(h.contains("e")){
        System.out.print(h.replace("e"," "));
      }
      if(h.contains("i")){
        System.out.print(h.replace("i"," "));
      }
      if(h.contains("o")){
        System.out.print(h.replace("o"," "));
      }
      if(h.contains("u")){
        System.out.print(h.replace("u"," "));
      }
      if(h.contains("y")){
        System.out.print(h.replace("y"," "));
      }
    }
  }
}
