package com.ravalikapdf.pdffile.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics="pdf_input_topic",groupId="pdfFile")
    public void listenTopic(String receivedMessage){
        System.out.println("The msg recevied is"+ receivedMessage);
    }


}
