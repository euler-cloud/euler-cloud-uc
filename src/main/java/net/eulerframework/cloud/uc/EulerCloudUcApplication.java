package net.eulerframework.cloud.uc;

import org.eulerframework.cloud.EnableEulerCloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableEulerCloud
@EnableDiscoveryClient
public class EulerCloudUcApplication {

    public static void main(String[] args) {
        SpringApplication.run(EulerCloudUcApplication.class, args);
    }
}
