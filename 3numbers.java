class ThreeNumbers{
public static void main(String args[]){
int a =Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
int x=(a>b)?a:b;
int y=(x>c)?x:c;
System.out.println("greater is"+y);
}
}