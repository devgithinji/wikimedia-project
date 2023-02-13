package com.densoft;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
@RequiredArgsConstructor
public class KafkaProducer implements CommandLineRunner {

    private final WikimediaChangesProducer wikimediaChangesProducer;

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducer.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        wikimediaChangesProducer.sendMessage();
    }
}
