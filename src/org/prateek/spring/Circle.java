// Circle.java - (insert one line description here)
// (C) Copyright 2014 Hewlett-Packard Development Company, L.P.

package org.prateek.spring;

import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class Circle implements Shape
{

    private Point center;
    @Autowired
    private MessageSource messageSource;

    /**
     * @return the center
     */
    public Point getCenter()
    {
        return center;
    }

    /**
     * @return the messageSource
     */
    public MessageSource getMessageSource()
    {
        return messageSource;
    }

    /**
     * @param messageSource the messageSource to set
     */
    public void setMessageSource(final MessageSource messageSource)
    {
        this.messageSource = messageSource;
    }

    /**
     * @param center the center to set
     */
    @Resource
    public void setCenter(final Point center)
    {
        this.center = center;
    }

    @PostConstruct
    public void initialize()
    {
        System.out.println(messageSource.getMessage("drawing.circle", null, "Default ", Locale.ENGLISH));
    }

    @PreDestroy
    public void destroyCircle()
    {
        System.out.println(messageSource.getMessage("destroy.circle", null, "Default greeting", Locale.ENGLISH));
    }

    /*
     * @see org.prateek.spring.Shape#draw()
     */
    @Override
    public void draw()
    {
        System.out.println(messageSource.getMessage("drawing.point", new Object[] {
                center.getX(), center.getY()
        }, "Default greeting", Locale.ENGLISH));
    }

}
