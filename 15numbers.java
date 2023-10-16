import java.util.Scanner;
class Elements{
public static void main(String ar[]){
Scanner  scan=new Scanner(System.in);
int marks[]=new int[15];
for (int i=0;i<15;i++){
System .out.println("enter a number");
int x=scan.nextInt();
marks[i]=x;
}
for(int i=0;i<15;i++){
if(marks[i]%2==0){
System.out.println(marks[i]);
}
}
}
}