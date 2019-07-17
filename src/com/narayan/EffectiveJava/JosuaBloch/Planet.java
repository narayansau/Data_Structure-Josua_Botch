package com.narayan.EffectiveJava.JosuaBloch;

public enum Planet{
    EARTH( 5.975e+24, 6.378e6 ),
    JUPITER( 1.899e+27, 7.149e7 ),
    MARS( 6.419e+23, 3.393e6 ),
    MERCURY( 3.302e+23, 2.439e6 ),
    NEPTUNE( 1.024e+26, 2.477e7 ),
    SATURN( 5.685e+26, 6.027e7 ),
    URANUS( 8.683e+25, 2.556e7 ),
    VENUS( 4.869e+24, 6.052e6 );

    private double mass;
    private double radius;
    private final int order;

    public int getOrder() {
        return order;
    }

    private Planet(double mass, double radius) {
        this.mass=mass;
        this.radius=radius;
        surfaceGravity = G * mass / (radius * radius);
        order = 5;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }


    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    private final double surfaceGravity; // In m / s^2
    // Universal gravitational constant in m^3 / kg s^2
    private static final double G = 6.67300E-11;

    public double surfaceWeight(double mass) {
        return mass * surfaceGravity; // F = ma
    }

}
