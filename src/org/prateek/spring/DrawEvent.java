// DrawEvent.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.spring;

import org.springframework.context.ApplicationEvent;

/**
 * 
 */
public class DrawEvent extends ApplicationEvent
{

    /**
     * @param source
     */
    public DrawEvent(final Object source)
    {
        super(source);
        // TODO Auto-generated constructor stub
    }

    /**
     * 
     */
    private static final long serialVersionUID = -2593244908193099622L;

    @Override
    public String toString()
    {
        return "Draw event occured";

    }

}
