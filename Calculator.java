public class Calculator
{
float add(float a,float b)
{
    return a+b;
}
float sub(float a,float b)
{
    return a-b;
}
float mul(float a,float b)
{
    return a*b;
}
float div(float a,float b)
{
    return a/b;
}
public static void main(String args[])
{
Calculator c=new Calculator();
System.out.println("Addition is"+c.add(12,34));
System.out.println("Sub is"+c.sub(12,34));
System.out.println("Mul is"+c.mul(12,34));
System.out.println("Mul is"+c.div(12,34));
}}