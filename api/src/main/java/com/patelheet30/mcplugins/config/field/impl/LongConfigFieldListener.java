package com.patelheet30.mcplugins.config.field.impl;

import com.patelheet30.mcplugins.config.Config;
import com.patelheet30.mcplugins.config.field.ConfigFieldListener;
import com.patelheet30.mcplugins.config.field.ConfigFieldListenerParseException;

/**
 * Created by Jason MK on 2020-04-11 at 6:41 p.m.
 */
public interface LongConfigFieldListener<T extends Config> extends ConfigFieldListener<T, Long> {

    @Override
    default Long parse(String argument) throws ConfigFieldListenerParseException {
        try {
            return Long.parseLong(argument);
        } catch (NumberFormatException exception) {
            throw new ConfigFieldListenerParseException(String.format("Unable to parse %s, expected type was %s.", argument, Long.class));
        }
    }

}
