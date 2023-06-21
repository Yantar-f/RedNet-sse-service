package com.rn.sseservice.config;

import com.rn.sseservice.service.SseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouteConfig {
    public static final String SSE_SERVICE_PATH = "/api/sse";
    private final SseService sseService;

    @Autowired
    public RouteConfig(SseService sseService) {
        this.sseService = sseService;
    }

    @Bean
    public RouterFunction<ServerResponse> routes(){
        return route(POST(SSE_SERVICE_PATH + "/subscribe"),sseService::subscribe)
            .andRoute(POST(SSE_SERVICE_PATH + "/notify-all-users"),sseService::notifyAllUsers);
    }
}
