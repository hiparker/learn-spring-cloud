package com.parker.learn.eureka.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created Date by 2020/1/13 0013.
 *
 *
 * @author Parker
 */
@Component
@Slf4j
public class CustomEvent {

    @EventListener
    public void listenStart(EurekaInstanceRegisteredEvent e){
        log.info("上线通知-ID {}",e.getInstanceInfo().getId());
    }

    @EventListener
    public void listenEnd(EurekaInstanceCanceledEvent e){
        log.info("下线通知-ID {}",e.getServerId());
    }

}
