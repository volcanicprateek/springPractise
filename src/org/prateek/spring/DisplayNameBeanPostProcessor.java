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
    public Object postProcessAfterInitialization(final Object bean, final String beanName)
            throws BeansException
    {
        System.out.println("in postProcessAfterInitialization. Bean name is : " + beanName);
        return bean;
    }

    /*
     * @see org.springframework.beans.factory.config.BeanPostProcessor#
     * postProcessBeforeInitialization(java.lang.Object, java.lang.String)
     */
    @Override
    public Object postProcessBeforeInitialization(final Object bean, final String beanName)
            throws BeansException
    {
        System.out.println("in postProcessBeforeInitialization . Bean name is : " + beanName);
        return bean;
    }

}
