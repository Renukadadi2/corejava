class Loops{
public static void main(String args[]){
//Main block scope
int x=10;
{
//innner block scope
System.out.println("x="+x);
System.out.println("y="+y);
}
System.out.println("x="+x);
//System.out.println("y="+y);Unable to access from out of the block
}
}

