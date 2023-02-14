// WAP to print palindrome .
import java.util.Scanner;
class example6 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 
    System.out.println("Enter number to print reverse order");
    int num=s.nextInt();  
    int rev=0,rem,temp;
    temp=num;
    
    while(temp!=0){
        rem=temp%10;   
        rev=rev*10+rem;
        temp=temp/10;  // 1
    }
    if (num==rev)
      System.out.println(num+"is palindrome"); 
    else
      System.out.println(num+"is not palindrome"); 
  }
}