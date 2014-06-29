// MyBeanFactoryPP.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 
 */
public class MyBeanFactoryPP implements BeanFactoryPostProcessor
{

    /*
     * @see org.springframework.beans.factory.config.BeanFactoryPostProcessor#
     * postProcessBeanFactory
     * (org.springframework.beans.factory.config.ConfigurableListableBeanFactory
     * )
     */
    @Override
    public void postProcessBeanFactory(final ConfigurableListableBeanFactory beanFactory)
            throws BeansException
    {

        System.out.println("in Post process bean factory :  beanFactory is : " + beanFactory);
    }

}
