package net.eulerframework.cloud.uc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableWebSecurity
public class EulerCloudUcApplication {

    public static void main(String[] args) {
        SpringApplication.run(EulerCloudUcApplication.class, args);
    }
}
