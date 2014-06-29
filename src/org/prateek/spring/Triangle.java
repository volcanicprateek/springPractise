// Triangle.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.spring;


/**
 * 
 */
public class Triangle
{

    private Point a;
    private Point b;
    private Point c;

    /**
     * @return the a
     */
    public Point getA()
    {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(final Point a)
    {
        this.a = a;
    }

    /**
     * @return the b
     */
    public Point getB()
    {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(final Point b)
    {
        this.b = b;
    }

    /**
     * @return the c
     */
    public Point getC()
    {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(final Point c)
    {
        this.c = c;
    }

    public void draw()
    {
        System.out.println("Triangle drawn with points: ");
        System.out.println("(" + getA().getX() + "," + getA().getY() + ")");
        System.out.println("(" + getB().getX() + "," + getB().getY() + ")");
        System.out.println("(" + getC().getX() + "," + getC().getY() + ")");
    }

}
