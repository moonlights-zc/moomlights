package control;

import Util.ConfOfSpring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ConfOfSpring.class})
public class ApplicationEntry {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationEntry.class,args);
    }




}
