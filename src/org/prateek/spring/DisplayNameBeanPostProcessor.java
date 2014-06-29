// DisplayNameBeanPostProcessor.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 
 */
public class DisplayNameBeanPostProcessor implements BeanPostProcessor
{

    /*
     * @see org.springframework.beans.factory.config.BeanPostProcessor#
     * postProcessAfterInitialization(java.lang.Object, java.lang.String)
     */
    @Override
    public Object postProcessAfterInitialization(final Object arg0, final String arg1)
            throws BeansException
    {
        System.out.println("in postProcessAfterInitialization ");
        return null;
    }

    /*
     * @see org.springframework.beans.factory.config.BeanPostProcessor#
     * postProcessBeforeInitialization(java.lang.Object, java.lang.String)
     */
    @Override
    public Object postProcessBeforeInitialization(final Object arg0, final String arg1)
            throws BeansException
    {
        System.out.println("in postProcessBeforeInitialization");
        return null;
    }

}
