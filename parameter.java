class Main{
static void myMethod(int age){
if(age<18){
System.out.println(" not eligible");
}else{
System.out.println("eligible");
}
}
public static void main(String[] args){
myMethod(20);
}
}