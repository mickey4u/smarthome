/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.binding.mart.handler;

import static org.eclipse.smarthome.binding.mart.martBindingConstants.MART_ADAPTER_TYPE_ID;

import java.util.Set;

import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingStatus;
import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandler;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Sets;

/**
 * The {@link martHandler} is responsible for handling commands, which are
 * sent to one of the channels.
 *
 * @author Tetteh Michael Kwaku - Initial contribution
 */
public class martHandler extends BaseThingHandler {

    private Logger logger = LoggerFactory.getLogger(martHandler.class);

    public static final Set<ThingTypeUID> SUPPORTED_THING_TYPES = Sets.newHashSet(MART_ADAPTER_TYPE_ID);

    public martHandler(Thing thing) {
        super(thing);

        logger.debug("Create a MartHandler for the thing '{}'", getThing().getUID());
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
        if (channelUID.getId().equals(MART_ADAPTER_TYPE_ID)) {
            // TODO: handle command

            // Note: if communication with thing fails for some reason,
            // indicate that by setting the status with detail information
            // updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.COMMUNICATION_ERROR,
            // "Could not control device at IP address x.x.x.x");
        }
    }

    @Override
    public void initialize() {
        // TODO: Initialize the thing. If done set status to ONLINE to indicate proper working.
        // Long running initialization should be done asynchronously in background.
        updateStatus(ThingStatus.ONLINE);

        // Note: When initialization can NOT be done set the status with more details for further
        // analysis. See also class ThingStatusDetail for all available status details.
        // Add a description to give user information to understand why thing does not work
        // as expected. E.g.
        // updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.CONFIGURATION_ERROR,
        // "Can not access device as username and/or password are invalid");
    }

    /*
     * responsible for getting the state mart devices
     */
    private State getMartState(ChannelUID channelUID) {
        return null;

    }

    /*
     * retrieving power consumed data
     */
    private State getPowerConsumed(ChannelUID channelUID) {
        return null;

    }

    private State getOnToday() {
        return null;

    }
}
