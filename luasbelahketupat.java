import java.util.Scanner;
import java.util.Locale;
   
class LuasBelahKetupat {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in).useLocale(Locale.US);
       
    System.out.println("##  Program Java - Luas Belah Ketupat  ##");
    System.out.println("=========================================");
    System.out.println();
      
    double diagonal1, diagonal2, luas;
  
    System.out.print("Input panjang diagonal 1: ");
    diagonal1 = input.nextDouble();
    System.out.print("Input panjang diagonal 2: ");
    diagonal2 = input.nextDouble();
   
    luas = 0.5 * diagonal1 * diagonal2;
    luas = Math.round(luas*100)/100.0;
       
    System.out.println("Luas belah ketupat = "+luas);
  
  }
}