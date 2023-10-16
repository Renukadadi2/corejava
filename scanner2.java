class FiveNumbers{
public static void main(String args[]){
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
int d=Integer.parseInt(args[3]);
int e=Integer.parseInt(args[4]);
int x=((a>b)&&(a>c)&&(a>d)&&(a>e))?a:
(b>c)&&(b>d)&&(b>e)?b:
(c>d)&&(c>e)?c:
(d>e)?d:e;
System.out.println("greater is "+x);
}
}


