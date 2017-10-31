/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import static java.lang.Math.*;

/**
 *
 * @author Arnaud Fouillard <Arnaud Fouillard@EFREI>
 */
public class Equation {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    private double x3;
    private double discriminant;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    public void discriminant()
    {
        setDiscriminant( pow(b,2)-(4*a*c));
        
        
    }
    public void calculracine()
    {
        if(this.discriminant>0)
        {
            this.setX1((-this.b+sqrt(this.discriminant))/2*this.a);
            this.setX2((-this.b-sqrt(this.discriminant))/2*this.a);
            
        }
        if(this.discriminant==0)
        {
            this.setX1(-(this.b)/2*this.a);
        }
        
        
    }

    @Override
    public String toString() {
        if(this.discriminant>0){
        return "equation : "+a+"x²+"+b+"x+"+c+"\n racine x1="+x1+"\nracine x2="+x2;
    }
     if(this.discriminant==0){
        return "equation : "+a+"x²+"+b+"x+"+c+"\n racine x1=x2="+x1;
    }   
     if(this.discriminant<0){
        return "Pas de racines réelles";
     }   
        return null;
     
    }
    
    public static void main(String args[]){
        Equation e = new Equation(1,-5,6);
        Equation e1 = new Equation(1,-6,9);
        Equation e2 = new Equation(1,1,2);
        e.discriminant();
        e.calculracine();
        e1.discriminant();
        e1.calculracine();
        e2.discriminant();
        e2.calculracine();
        System.out.println(e);
        System.out.println(e1);
        System.out.println(e2);
    }
    
    
    public double getA() {
        return a;
    }

    public void setDiscriminant(double discriminant) {
        this.discriminant = discriminant;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX3() {
        return x3;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }
    
    
    
}
