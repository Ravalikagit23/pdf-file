package com.ravalikapdf.pdffile.daoclass;

import com.ravalikapdf.pdffile.model.PdfFile;
import com.ravalikapdf.pdffile.model.PdfInput;
import org.springframework.web.bind.annotation.RequestBody;

public interface PdfDao {
    public void createFile( PdfInput pdfInput);
}
