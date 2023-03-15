import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner skan = new Scanner(System.in);
    System.out.println("|Podaj Liczbę a: ");
    System.out.println("");
    int a = skan.nextInt();
    System.out.println("");
    System.out.println("||Podaj Liczbę b: ");
    System.out.println("");
    int b = skan.nextInt();
    System.out.println("");
    System.out.println("||Podaj Liczbę b: ");
    System.out.println("");
    int c = skan.nextInt();
    if (a > b && a > c) {
      System.out.println(a);

    }

    if (b > a && b > c) {
      System.out.println(b);

    } else
      System.out.println(c);
  }
}