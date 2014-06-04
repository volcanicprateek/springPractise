// DrawingApp.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 */
public class DrawingApp
{

    /**
     * @param args
     */
    public static void main(final String[] args)
    {

        final ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");

        final Triangle triangle = (Triangle) appContext.getBean("triangle-alias");

        triangle.draw();

    }
}
