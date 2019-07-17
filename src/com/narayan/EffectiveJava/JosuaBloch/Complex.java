package com.narayan.EffectiveJava.JosuaBloch;

import java.util.Objects;

public final class Complex{
    private  double real;
    private  double imaginary;

    public Complex(double real, double imaginary) {
        this.real=real;
        this.imaginary=imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Complex)) return false;
        Complex complex=(Complex) o;
        return Double.compare( complex.getReal(), getReal() ) == 0 &&
                Double.compare( complex.getImaginary(), getImaginary() ) == 0;
    }



    @Override
    public int hashCode() {
        return Objects.hash( getReal(), getImaginary() );
    }

    public Complex add (Complex c) {
        return new Complex(real + c.real, imaginary + c.imaginary);
    }

    public Complex add (Complex c, Complex d) {
        c.real = c.real + d.real;
        c.imaginary = c.imaginary + d.imaginary;
        return new Complex( c.real , c.imaginary);
       // return new  Complex (d.real + c.real , d.imaginary + c.imaginary);
    }

    public  Complex subtract ( Complex c)   {
        return new Complex( real - c.real , imaginary - c.imaginary );
    }
    public  Complex multiply ( Complex c) {
        return  new Complex( (real * c.real - imaginary * c.imaginary) ,( real * c.imaginary + imaginary * c.real)  );
    }

    public  Complex divide ( Complex c) {
        double  tmp = real * c.real + imaginary * c.imaginary;
        return new Complex((((real * c.real) + (imaginary * c.imaginary)) / tmp),(( real * c.imaginary - imaginary * c.real) / tmp ));
        }

}
