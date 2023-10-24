package com.ravalikapdf.pdffile.controller;

import com.ravalikapdf.pdffile.daoclass.PdfDaoimpl;
import com.ravalikapdf.pdffile.model.PdfFile;
import com.ravalikapdf.pdffile.model.PdfInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/files")
public class PdfController {
    @Value("${test.value}")
    private String testValue;

    @Autowired
    private PdfDaoimpl pdfDaoimpl;

    @PostMapping
    public PdfFile createFile(@RequestBody PdfInput pdfInput) {
        pdfDaoimpl.createFile(pdfInput);

        System.out.println(testValue);


        System.out.println(pdfInput.getreportType());
        System.out.println(pdfInput.getContent());

        PdfFile pdfFile = new PdfFile();
        pdfFile.setData(new byte[5]);
        return pdfFile;

    }
}