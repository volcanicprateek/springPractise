// MyEventListener.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
public class MyEventListener implements ApplicationListener
{

    /*
     * @see
     * org.springframework.context.ApplicationListener#onApplicationEvent(org
     * .springframework.context.ApplicationEvent)
     */
    @Override
    public void onApplicationEvent(final ApplicationEvent event)
    {
        // TODO Auto-generated method stub
        System.out.println(event.toString());
    }

}
