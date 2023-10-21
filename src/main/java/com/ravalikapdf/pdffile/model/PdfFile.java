package com.ravalikapdf.pdffile.model;

public class PdfFile {
    String type;
    String content;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
                "type='" + type + '\'' +
                ", content='" + content + '\'' +
                '}';
    }


}
