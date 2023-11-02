package com.ravalikapdf.pdffile.Service;

import com.ravalikapdf.pdffile.model.PdfInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    @Autowired
    KafkaTemplate<String, PdfInput> KafkaTemplate;
    public void sendMsgTopic(PdfInput pdfInput){
        KafkaTemplate.send("pdf_input_topic",pdfInput );

    }
}
