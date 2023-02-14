import java.util.Scanner;
class Example1 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 
    for(int k=1;k<=100;k++){
      
    int sum=0;
     for(int i=1;i<=k/2;i++){
       if(k%i==0){
         sum=sum+i;
       }
     }
    if(sum==k){
      System.out.println(k);
    }
    }     
    
  }
}