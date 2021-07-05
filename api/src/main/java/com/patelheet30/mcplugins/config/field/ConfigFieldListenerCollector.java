package com.patelheet30.mcplugins.config.field;

import com.patelheet30.mcplugins.config.Config;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Created by Jason MK on 2020-03-20 at 10:53 p.m.
 */
public interface ConfigFieldListenerCollector<T extends Config> {

    Map<Field, ConfigFieldListener<T, ?>> collect();

}
