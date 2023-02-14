import java.util.Scanner;
 
class example3 {
  public static void main(String args[]) {
 
    Scanner s = new Scanner(System.in);
    int count = 0,primecount=0;
 
    for (int k = 1; k <= 100; k++) { 
 
      for (int i = 1; i <= k / 2; i++) { 
        if (k % i == 0) { 
          count++;
        }
      }
 
      if (count == 1) {
           primecount++;
        if(primecount%2!=0){
        System.out.print(k + " "); 
        }
      }
      count = 0;
    }
 
  }
}