// Triangle.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.spring;

import java.util.List;

/**
 * 
 */
public class Triangle
{
    List<Point> points;

    /**
     * @return the points
     */
    public List<Point> getPoints()
    {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(final List<Point> points)
    {
        this.points = points;
    }

    public void draw()
    {
        System.out.println("Triangle drawn with points: ");
        for (final Point p : points)
        {
            System.out.println("(" + p.getX() + "," + p.getY() + ")");
        }
    }
}
