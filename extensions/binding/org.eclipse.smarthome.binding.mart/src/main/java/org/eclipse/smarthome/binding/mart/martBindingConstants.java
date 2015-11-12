/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.binding.mart;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link martBinding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Tetteh Michael Kwaku - Initial contribution
 */
public class martBindingConstants {

    public static final String BINDING_ID = "mart";

    // List of all Thing Type UIDs
    public final static ThingTypeUID MART_ADAPTER_TYPE_ID = new ThingTypeUID(BINDING_ID, "adapter");
    public final static ThingTypeUID MART_MOTION_TYPE_ID = new ThingTypeUID(BINDING_ID, "motion");

    // List of all Channel ids
    public final static String CHANNEL_1 = "state";

    // List of thing configuration properties
    public final static String UNIQUE_DEVICEID = "uniqueDeviceId";
    public final static String CHANNEL_UNIQUEDEVICEID = "uniqueDeviceId";
    public final static String CHANNEL_POWERCONSUMED = "powerConsumed";
    public final static String CHANNEL_ONTODAY = "onToday";

}
