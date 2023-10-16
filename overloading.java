class Main{
static int myMethod(int x,int y){
return x+y;
}
static double myMethod(double x,double y){
return x+y;
}
public static void main(String args[]){
int num1=myMethod(8,4);
double num2=myMethod(5.5,4.3);
System.out.println(num1);
System.out.println(num2);
}
}
