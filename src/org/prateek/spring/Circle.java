// Circle.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

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
    @Resource(name = "c")
    public void setCenter(final Point center)
    {
        this.center = center;
    }

    @PostConstruct
    public void initialize()
    {
        System.out.println("Circle bean initialized");
    }

    @PreDestroy
    public void destroyCircle()
    {
        System.out.println("Destroying circle");
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
