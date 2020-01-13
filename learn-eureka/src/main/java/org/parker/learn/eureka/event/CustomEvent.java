package org.parker.learn.eureka.event;

import com.netflix.discovery.EurekaEventListener;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created Date by 2020/1/13 0013.
 *
 *
 * @author Parker
 */
@Component
public class CustomEvent {

    @EventListener
    public void listen(EurekaInstanceCanceledEvent e){

        System.out.println(e.getServerId()+" 下线通知");

    }

}
