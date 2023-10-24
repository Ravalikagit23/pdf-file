package com.ravalikapdf.pdffile.model;

public class PdfInput {
    String reporttype;
    String content;
    public String getreportType() {

        return reporttype;
    }

    public void setreportType(String type) {
        this.reporttype = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "PdfFile{" +
                "type='" + reporttype + '\'' +
                ", content='" + content + '\'' +
                '}';
    }


}
