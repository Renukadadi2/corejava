import java.util.Scanner;
class Elements{
public static void main(String ar[]){
Scanner  scan=new Scanner(System.in);
int marks[]=new int[20];
for (int i=0;i<20;i++){
System .out.println("enter a number");
int x=Scan.nextInt();
marks[i]=x;
}
for(int i=0;i<20;i++){
if(marks[i]%2==0){
System.out.println(marks[i]);
}
}
else{
System.out.println("odd numbers"+marks[i]);
}
}
}
