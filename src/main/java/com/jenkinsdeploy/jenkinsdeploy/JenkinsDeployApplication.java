package com.jenkinsdeploy.jenkinsdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JenkinsDeployApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDeployApplication.class, args);
    }

}
