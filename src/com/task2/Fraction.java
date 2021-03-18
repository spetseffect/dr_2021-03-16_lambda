package com.task2;

public class Fraction{
    public int numerator;
    public int denominator;
    public Fraction(){}
    public Fraction(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    @Override
    public String toString(){
        return numerator+"/"+denominator;
    }
    public void Reduction(){
        for(int i=2;i<=numerator&&i<=denominator;i++){
            if(numerator%i==0 && denominator%i==0){
                numerator/=i;
                denominator/=i;
                i=1;
            }
        }
    }
    public Fraction Invert(){
        return new Fraction(denominator,numerator);
    }
}
