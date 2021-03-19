package com.task2;

import java.util.function.BinaryOperator;

public class Main{
    public static void main(String[] args){
        BinaryOperator<Fraction> add=(a, b)->{
            Fraction c=new Fraction();
            if(a.denominator==b.denominator){
                c.numerator=a.numerator+b.numerator;
                c.denominator=a.denominator;
            }else{
                c.numerator=a.numerator*b.denominator+b.numerator*a.denominator;
                c.denominator=a.denominator*b.denominator;
            }
            c.Reduction();
            return c;
        };
        BinaryOperator<Fraction> subt=(a,b)->{
            Fraction c=new Fraction();
            if(a.denominator==b.denominator){
                c.numerator=a.numerator-b.numerator;
                c.denominator=a.denominator;
            }else{
                c.numerator=a.numerator*b.denominator-b.numerator*a.denominator;
                c.denominator=a.denominator*b.denominator;
            }
            c.Reduction();
            return c;
        };
        BinaryOperator<Fraction> mult=(a,b)->{
            Fraction c=new Fraction();
            c.numerator=a.numerator*b.numerator;
            c.denominator=a.denominator*b.denominator;
            c.Reduction();
            return c;
        };
        BinaryOperator<Fraction> div=(a,b)->{
            return mult.apply(a,b.Invert());
        };
        Fraction a = new Fraction(2,5);
        Fraction b = new Fraction(3,7);
        System.out.println(a+" + "+b+" = "+add.apply(a,b));
        System.out.println(a+" - "+b+" = "+subt.apply(a,b));
        System.out.println(a+" * "+b+" = "+mult.apply(a,b));
        System.out.println(a+" / "+b+" = "+div.apply(a,b));
    }
}
