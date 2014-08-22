// Circle.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 
 */
public class Circle implements Shape
{

    private Point center;

    /**
     * @return the center
     */
    public Point getCenter()
    {
        return center;
    }

    /**
     * @param center the center to set
     */
    @Autowired
    @Qualifier("circleRelated")
    public void setCenter(final Point center)
    {
        this.center = center;
    }

    /*
     * @see org.prateek.spring.Shape#draw()
     */
    @Override
    public void draw()
    {
        System.out.println("Center is : " + center.getX() + "," + center.getY());

    }

}
