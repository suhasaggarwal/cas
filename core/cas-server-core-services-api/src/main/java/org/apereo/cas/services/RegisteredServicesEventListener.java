package org.apereo.cas.services;

import org.apereo.cas.support.events.service.CasRegisteredServiceExpiredEvent;
import org.apereo.cas.support.events.service.CasRegisteredServicesRefreshEvent;
import org.apereo.cas.util.spring.CasEventListener;

import org.springframework.cloud.context.environment.EnvironmentChangeEvent;

/**
 * Interface for {@code DefaultRegisteredServicesEventListener} to allow spring {@code @Async} support to use JDK proxy.
 *
 * @author Hal Deadman
 * @since 6.5.0
 */
public interface RegisteredServicesEventListener extends CasEventListener {

    /**
     * Handle services manager refresh event.
     *
     * @param event the event
     */
    void handleRefreshEvent(CasRegisteredServicesRefreshEvent event);

    /**
     * Handle environment change event.
     *
     * @param event the event
     */
    void handleEnvironmentChangeEvent(EnvironmentChangeEvent event);

    /**
     * Handle registered service expired event.
     *
     * @param event the event
     */
    void handleRegisteredServiceExpiredEvent(CasRegisteredServiceExpiredEvent event);

}
