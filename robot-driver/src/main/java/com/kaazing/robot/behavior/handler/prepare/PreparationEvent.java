/**
 * Copyright (c) 2007-2013, Kaazing Corporation. All rights reserved.
 */

package com.kaazing.robot.behavior.handler.prepare;

import java.util.Collection;

import org.jboss.netty.channel.ChannelEvent;
import org.jboss.netty.channel.ChannelFuture;

import com.kaazing.robot.lang.LocationInfo;

public interface PreparationEvent extends ChannelEvent {

    Collection<ChannelFuture> getPipelineFutures();

    ChannelFuture checkpoint(LocationInfo locationInfo, ChannelFuture handlerFuture);

    LocationInfo getProgressInfo();
}