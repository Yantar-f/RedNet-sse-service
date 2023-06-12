package com.rn.sseservice.model;

import org.springframework.http.codec.ServerSentEvent;
import reactor.core.publisher.FluxSink;

public class SubscriptionData {

    private String userId;
    private FluxSink<ServerSentEvent<Object>> fluxSink;

    public SubscriptionData(String userId, FluxSink<ServerSentEvent<Object>> fluxSink) {
        this.userId = userId;
        this.fluxSink = fluxSink;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public FluxSink<ServerSentEvent<Object>> getFluxSink() {
        return fluxSink;
    }

    public void setFluxSink(FluxSink<ServerSentEvent<Object>> fluxSink) {
        this.fluxSink = fluxSink;
    }
}