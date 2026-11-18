package com.mycompany.calculator;
public class Calculator {

public int add(int a,int b)
{
    return a+b;
}

public int sub(int a ,int b)
{
    return a-b;
}

public int mul(int a,int b)
{
    return a*b;
}        

public boolean isEven(int number)
{
    return number%2==0;
}

public int square(int number)
{
    return number*number;
}
public static void main(String[]args)
{
Calculator cal=new Calculator();
System.out.println("add:"+cal.add(10,5));
System.out.println("sub:"+cal.sub(10,5));
System.out.println("mul:"+cal.mul(10,5));
System.out.println("even:"+cal.isEven(7));
System.out.println("square:"+cal.square(4));
}
}
