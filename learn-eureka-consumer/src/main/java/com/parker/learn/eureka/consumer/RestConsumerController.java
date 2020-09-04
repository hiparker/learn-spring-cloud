package com.parker.learn.eureka.consumer;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * @BelongsProject: consumer
 * @BelongsPackage: com.parker.learn.eureka.consumer
 * @Author: Parker
 * @CreateTime: 2020-09-03 23:52
 * @Description: TODO
 */
@RestController
public class RestConsumerController {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    LoadBalancerClient lb;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("client")
    public void client(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println(service);
        }
    }


    @RequestMapping("client2")
    public Object client2(){
        List<ServiceInstance> providers = discoveryClient.getInstances("provider");
        for (ServiceInstance ins : providers) {
            System.out.println(ToStringBuilder.reflectionToString(ins));
        }

        return providers;
    }


    @RequestMapping("client3")
    public String client3(){
        String str = "";
        List<ServiceInstance> instanceInfos = discoveryClient.getInstances("provider");
        if(instanceInfos.size() > 0){
            // 服务
            ServiceInstance serviceInstance = instanceInfos.get(0);
            if(serviceInstance !=  null){
                URI uri = serviceInstance.getUri();
                String url = uri.toString()+"/getHi";

                str = restTemplate.getForObject(url, String.class);
            }
        }

        return str;
    }


    @RequestMapping("client4")
    public String client4(){
        String str = "";
        // 服务  Ribbon 参与进来 完成客户端负载均衡
        ServiceInstance serviceInstance = lb.choose("provider");

        URI uri = serviceInstance.getUri();
        String url = uri.toString()+"/getHi";

        str = restTemplate.getForObject(url, String.class);

        return str;
    }

    /**
     * RestTemplate 与 Ribbon 捆绑
     * @return
     */
    @RequestMapping("client5")
    public String client5(){
        String str = "";

        String url = "http://provider/getHi";
        str = restTemplate.getForObject(url, String.class);

        return str;
    }
}
