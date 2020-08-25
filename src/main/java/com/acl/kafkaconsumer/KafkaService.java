package com.acl.kafkaconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Created by abhisheks on 10-08-2020.
 */
@Service
public class KafkaService {

        Logger logger = LoggerFactory.getLogger(this.getClass());

        @KafkaListener(topics = "test", groupId = "group_id")
        public void consume(String message){
            logger.info("received : "+message);
        }
    }