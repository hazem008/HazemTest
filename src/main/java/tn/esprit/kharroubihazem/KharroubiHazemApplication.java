package tn.esprit.kharroubihazem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class KharroubiHazemApplication {

    public static void main(String[] args) {
        SpringApplication.run(KharroubiHazemApplication.class, args);
    }

}
