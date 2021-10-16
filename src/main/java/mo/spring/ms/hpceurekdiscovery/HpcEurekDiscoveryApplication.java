package mo.spring.ms.hpceurekdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HpcEurekDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(HpcEurekDiscoveryApplication.class, args);
    }

}
