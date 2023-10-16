class Odd{
public static void main(String args[]){
int a=Integer.parseInt(args[0]);
if(a%2==1){
a=a+1;
}
System.out.println("nearest even number is "+a);
}
else{
a=a-1;
System.out.println("nearest even number is "+a);
}
