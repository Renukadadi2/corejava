import java.util.Scanner;
class Input{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("enter first number");
int x=obj.nextInt();
System.out.println("enter 2nd number");
int y=obj.nextInt();
System.out.printf("%d+%d=%d",x,y,(x+y));
}
}