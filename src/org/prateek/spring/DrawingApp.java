// DrawingApp.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.spring;

import org.springframework.context.support.AbstractApplicationContext;
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

        final AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");

        appContext.registerShutdownHook();
        final Shape shape = (Shape) appContext.getBean("circle");

        shape.draw();

    }
}
