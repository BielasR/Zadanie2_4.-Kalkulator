import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
  Scanner liczba1 = new Scanner(System.in);
  Scanner liczba2 = new Scanner(System.in);
  Scanner wybór = new Scanner(System.in);
  System.out.println("Wybierz liczbę aby wykonać odpowiedznie działanie\n 1.Pole prostokąta\n 2.Pole trójkąta\n");
  int w = wybór.nextInt();
    switch(w)
      {
        case 1:   
          System.out.println("Podaj pierwszy bok:");
          float l1 = liczba1.nextFloat();
          System.out.println("Podaj drugi bok:");
          float l2 = liczba2.nextFloat();
          float poleP = l1 * l2;
          System.out.println("Pole prostokąta = " + poleP);
          break;
        case 2:
          System.out.println("Podaj pierwszy bok:");
          double a = liczba1.nextDouble();
          System.out.println("Podaj drugi bok:");
          double b = liczba2.nextDouble();
          System.out.println("Podaj przeciwprostokątną:");
          double c = liczba2.nextDouble();
          if(a + b >c || b + c > a || a + c > b)
          {
            double poleT = ((a+b)/2);
            System.out.println("Pole Trójkąta prostokątnego:" + poleT);
          }
          else
          {
            System.out.println("to nie trójkąt");
          }
      }   
  }          
}