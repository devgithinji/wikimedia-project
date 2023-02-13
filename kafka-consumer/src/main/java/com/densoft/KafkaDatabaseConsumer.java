package com.densoft;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaDatabaseConsumer {

    private final WikimediaDataRepo wikimediaDataRepo;

    @KafkaListener(topics = "wikimedia_recentchange", groupId = "myGroup")
    public void consume(String message) {
        log.info("Event message received {}", message);
        wikimediaDataRepo.save(new WikimediaData(message));
    }
}
