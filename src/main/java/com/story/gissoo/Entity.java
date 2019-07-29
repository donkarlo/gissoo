package com.story.gissoo;

/**
 * Is such as objects, infinitive form of events or sentences. It's subjects or
 * objects, if any are more general
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class Entity {

    protected EntityAvImplFormats format;
    protected String impl;

    public Entity() {
    }

    public Entity(EntityAvImplFormats format, String impl) {
        this.format = format;
        this.impl = impl;
    }
}
