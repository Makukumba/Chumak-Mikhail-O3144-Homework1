import java.util.Scanner;

public class Ex2_3Ez{
 public static void main(String[] args) throws ExceptionNotInt {

 Scanner s = new Scanner(System.in);
 String t = s.nextLine();
 if (s.hasNextInt()) {
 int a = s.nextInt();
if (a> 0) {
 for (int i = 0; i < a; i++) {
 System.out.println(t);}
  } } else {
 throw new ExceptionNotInt("Ошибка");
  }
}
    public static class ExceptionNotInt extends Exception{
        public ExceptionNotInt(String message) {
        }
    }
}