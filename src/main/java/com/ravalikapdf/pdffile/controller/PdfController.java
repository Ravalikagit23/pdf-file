package com.ravalikapdf.pdffile.controller;

import com.ravalikapdf.pdffile.model.PdfFile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/files")
public class PdfController {
    @PostMapping
    public void createFile(@RequestBody PdfFile inputfile) throws SQLException, ClassNotFoundException {

        }
}