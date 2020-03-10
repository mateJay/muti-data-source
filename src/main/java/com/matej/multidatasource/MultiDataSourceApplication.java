package com.matej.multidatasource;

import com.matej.multidatasource.config.DBConfig1;
import com.matej.multidatasource.config.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
@SpringBootApplication
public class MultiDataSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiDataSourceApplication.class, args);
    }

}
