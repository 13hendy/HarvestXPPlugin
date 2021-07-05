package com.patelheet30.mcplugins.config.field.impl;

import com.patelheet30.mcplugins.config.Config;
import com.patelheet30.mcplugins.config.field.ConfigFieldListener;
import com.patelheet30.mcplugins.config.field.ConfigFieldListenerParseException;

/**
 * Created by Jason MK on 2020-04-11 at 6:47 p.m.
 */
public interface IntegerConfigFieldListener<T extends Config> extends ConfigFieldListener<T, Integer> {

    @Override
    default Integer parse(String argument) throws ConfigFieldListenerParseException {
        try {
            return Integer.parseInt(argument);
        } catch (NumberFormatException nfe) {
            throw new ConfigFieldListenerParseException(String.format("Unable to parse %s, expected type %s.", argument, Integer.class));
        }
    }

}
