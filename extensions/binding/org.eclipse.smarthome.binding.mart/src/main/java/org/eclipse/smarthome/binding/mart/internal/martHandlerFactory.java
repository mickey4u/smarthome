/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.binding.mart.internal;

import static org.eclipse.smarthome.binding.mart.martBindingConstants.MART_ADAPTER_TYPE_ID;

import java.util.Collections;
import java.util.Set;

import org.eclipse.smarthome.binding.mart.handler.martHandler;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandlerFactory;
import org.eclipse.smarthome.core.thing.binding.ThingHandler;

/**
 * The {@link martHandlerFactory} is responsible for creating things and thing
 * handlers.
 *
 * @author Tetteh Michael Kwaku - Initial contribution
 */
public class martHandlerFactory extends BaseThingHandlerFactory {

    private final static Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = Collections.singleton(MART_ADAPTER_TYPE_ID);

    @Override
    public boolean supportsThingType(ThingTypeUID thingTypeUID) {
        return SUPPORTED_THING_TYPES_UIDS.contains(thingTypeUID);
    }

    @Override
    protected ThingHandler createHandler(Thing thing) {

        ThingTypeUID thingTypeUID = thing.getThingTypeUID();

        if (thingTypeUID.equals(MART_ADAPTER_TYPE_ID)) {
            return new martHandler(thing);
        }

        return null;
    }
}
