package ru.sychev.math;

import java.util.IllegalFormatException;
import java.util.Objects;

final public class Fraction extends Number implements Cloneable{
    private int numerator;
    private int denominator;

     public Fraction (int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public Fraction (int num){
        this(num,1);
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }

    final public Fraction sumFraction( Fraction f2){
        int new_numerator = 0;
        int new_denominator = 0;
        if(this.denominator <= 0 || f2.denominator <= 0 ){
            throw new IllegalArgumentException("Error denominator!");
        }
        if (this.denominator == f2.denominator){
            new_numerator = this.numerator + f2.numerator;
            return new Fraction (new_numerator,new_denominator);
        }
        else {
            new_denominator = nok(this.denominator, f2.denominator);
            new_numerator = this.numerator * (new_denominator / this.denominator)  + f2.numerator * (new_denominator / f2.denominator);
            return new Fraction (new_numerator,new_denominator);
        }
    }

    final public Fraction sumFraction(int num){
        return this.sumFraction(new Fraction(num,1));
    }

    final public Fraction minusFraction(Fraction f2){
        int new_numerator = 0;
        int new_denominator = 0;
        if(this.denominator <= 0 || f2.denominator <= 0){
            throw new IllegalArgumentException("Error denominator!");
        }
        if (this.denominator == f2.denominator){
            new_numerator = this.numerator - f2.numerator;
            return new Fraction (new_numerator,new_denominator);
        }
        else {
            new_denominator = nok(this.denominator, f2.denominator);
            new_numerator = this.numerator * (new_denominator / this.denominator)  - f2.numerator * (new_denominator / f2.denominator);
            return new Fraction (new_numerator,new_denominator);
        }
    }
    final public Fraction minusFraction(int num){
       return this.minusFraction(new Fraction(num,1));
    }

    final public Fraction multiplyFraction (Fraction f2){
        if(this.denominator <= 0 || f2.denominator <= 0){
            throw new IllegalArgumentException("Error denominator!");
        }
        int new_numerator = this.numerator * f2.numerator;
        int new_denominator = this.denominator * f2.denominator;
        return new Fraction (new_numerator,new_denominator);
    }

    final public Fraction multiplyFraction(int num){
        return this.multiplyFraction(new Fraction(num,1));
    }

    final public Fraction divideFraction (Fraction f2){
        if(this.denominator <= 0 || f2.denominator <= 0){
            throw new IllegalArgumentException("Error denominator!");
        }
        int new_numerator = this.numerator * f2.denominator;
        int new_denominator = this.denominator * f2.numerator;
        return new Fraction (new_numerator,new_denominator);
    }

    final public Fraction divideFraction(int num){
        return this.divideFraction(new Fraction(num,1));
    }

    private int nod (int a, int b){
        int tmp;
        while(a != 0 && b != 0)
        {
            a %= b;
            tmp = a;
            a = b;
            b = tmp;
        }
        return a + b;
    }
    private int nok (int a, int b){
        return a / nod (a,b) * b;
    }

    public Fraction Clone () throws CloneNotSupportedException{
         Fraction clone_fraction = (Fraction)super.clone();
         clone_fraction.numerator = this.numerator;
         clone_fraction.denominator = this.denominator;
         return clone_fraction;
    }

    @Override
    public int intValue() throws FractionExeption{
         if (denominator == 0) throw new FractionExeption("this fraction is not representable in integer format.");
         return numerator / denominator;
    }

    @Override
    public long longValue(){
         if (denominator == 0) throw new FractionExeption("this fraction is not representable in integer format.", new ArithmeticException());
         return numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / (float) denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / (float) denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator &&
                denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }


    public int compareTo (Fraction f){
         if (f.numerator == this.numerator && f.denominator == f.denominator) return 0;
         if (this.doubleValue() > f.doubleValue()) return 1;
         else return -1;
    }
}
