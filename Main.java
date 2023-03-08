import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
  Scanner liczba1 = new Scanner(System.in);
  Scanner liczba2 = new Scanner(System.in);
  Scanner wybór = new Scanner(System.in);
  System.out.println("Wybierz liczbę aby wykonać odpowiedznie działanie\n 1.Suma\n 2.Różnica\n 3.Iloczyn\n 4.Iloraz\n");
  int w = wybór.nextInt();
  System.out.println("Podaj pierwszą liczbę:");
  float l1 = liczba1.nextFloat();
  System.out.println("Podaj drugą liczbę:");
  float l2 = liczba2.nextFloat();
    switch(w)
      {
        case 1:   
          float suma = l1 + l2;
          System.out.println("Suma = " + suma);
          break;
        case 2:
          float różnica = l1 - l2;
          System.out.println("Różnica = " + różnica);
          break;
        case 3:
          float iloczyn = l1 * l2;
          System.out.println("Iloczyn = " + iloczyn);
          break;
        case 4:
          if(l2 == 0.0)
          {
          System.out.println("Błąd, dzielenie przez 0");
          }
          else
          {
          float iloraz = l1 / l2;
          System.out.println("Iloraz = " + iloraz);
          }           
          break;
      }
        
	}

}