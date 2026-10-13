package org.example.eventProducer;

import org.example.entities.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Service;

@Service
public class UserInfoProducer {
    private final KafkaTemplate<String, UserInfo> kafkaTemplate;

    @Autowired
    UserInfoProducer(KafkaTemplate<String, UserInfo> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
}
