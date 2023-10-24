package com.ravalikapdf.pdffile.daoclass;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import com.ravalikapdf.pdffile.model.PdfFile;
import com.ravalikapdf.pdffile.model.PdfInput;

@Component
public class PdfDaoimpl implements PdfDao {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public  void createFile(PdfInput pdfInput){
            String newFile = "INSERT INTO data(Reporttype,Content)" +
                    " VALUES (:Report_type, :Content)";
     HashMap<String,Object>map=new HashMap<>();
     map.put("Report_type",pdfInput.getreportType());
     map.put("Content",pdfInput.getContent());
        namedParameterJdbcTemplate.update(newFile, map);

    }
}
