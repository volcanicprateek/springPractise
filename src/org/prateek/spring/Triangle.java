// Triangle.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.spring;

/**
 * 
 */
public class Triangle
{
    private String type;
    private int height;

    public Triangle(final String type)
    {
        this.type = type;
    }

    public Triangle(final int height)
    {
        this.height = height;
    }

    public Triangle(final String type, final int height)
    {
        this.type = type;
        this.height = height;
    }

    /**
     * @return the height
     */
    public int getHeight()
    {
        return height;
    }

    /**
     * @return the type
     */
    public String getType()
    {
        return type;
    }

    public void draw()
    {
        System.out.println("Triangle drawn with type: " + getType() + "with height: " + getHeight());
    }

    //    /**
    //     * @param type the type to set
    //     */
    //    public void setType(final String type)
    //    {
    //        this.type = type;
    //    }
}
