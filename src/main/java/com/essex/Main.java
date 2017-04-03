package com.essex;

import com.lowagie.text.pdf.PdfWriter;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.xwpf.converter.pdf.PdfConverter;
import org.apache.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        convertDocx("input/3.docx", "input/3.docx.pdf");
        convertDocx("input/4.docx", "input/4.docx.pdf");
        convertDocx("input/ERROR.docx", "input/ERROR.docx.pdf");


        PdfWriter.
    }

    private static void convertDocx(String inputName, String outputName) throws IOException {
        XWPFDocument document=new XWPFDocument(new FileInputStream(inputName));
        PdfConverter.getInstance().convert(document,
                new FileOutputStream(outputName),
                PdfOptions.getDefault());
    }

//    private static void convertDoc(String inputName, String outputName) throws IOException {
//        HWPFDocument document=new HWPFDocument(new FileInputStream(inputName));
//        PdfWriter.getInstance()
//        PdfConverter.getInstance().convert(document,
//                new FileOutputStream(outputName),
//                PdfOptions.getDefault());
//    }


}
