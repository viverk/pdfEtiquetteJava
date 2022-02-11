/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdf;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Promattex
 */
public class PdfTab {

    public static void main(String[] args) {
        try {
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Promattex\\Desktop\\testPdf\\test.pdf"));

            Image img = Image.getInstance("C:\\Users\\Promattex\\Desktop\\testQrCode\\test.png");
            img.setAbsolutePosition(200, 550);
            img.scaleToFit(100, 100);

            Image img2 = Image.getInstance("C:\\Users\\Promattex\\Desktop\\testQrCode\\test.png");
            img2.setAbsolutePosition(490, 550);
            img2.scaleToFit(100, 100);

            Image img3 = Image.getInstance("C:\\Users\\Promattex\\Desktop\\testQrCode\\test.png");
            img3.setAbsolutePosition(200, 295);
            img3.scaleToFit(100, 100);

            Image img4 = Image.getInstance("C:\\Users\\Promattex\\Desktop\\testQrCode\\test.png");
            img4.setAbsolutePosition(490, 295);
            img4.scaleToFit(100, 100);

            Image img5 = Image.getInstance("C:\\Users\\Promattex\\Desktop\\testQrCode\\test.png");
            img5.setAbsolutePosition(200, 40);
            img5.scaleToFit(100, 100);

            Image img6 = Image.getInstance("C:\\Users\\Promattex\\Desktop\\testQrCode\\test.png");
            img6.setAbsolutePosition(490, 40);
            img6.scaleToFit(100, 100);

            document.open();

            PdfPTable table = new PdfPTable(2);
            Font bold = new Font(Font.FontFamily.HELVETICA, 15, Font.BOLD);

            PdfPCell cell = new PdfPCell();
            Phrase firstLine = new Phrase("nameen : balblalbalalb", bold);
            Phrase secondLine = new Phrase("namefr : ifjsiodjcoqsioj \n ref : 456876531546878646543 \n date : 18/12/2022 \n cid : c0845 \n namefr : ifjsiodjcoqsioj \n namefr : ifjsiodjcoqsioj \n ");

            cell.addElement(firstLine);
            cell.addElement(secondLine);

            cell.setBorderColor(BaseColor.WHITE);
            cell.setFixedHeight(256);
            table.setWidthPercentage(110);

            table.addCell(cell);
            table.addCell(cell);
            table.addCell(cell);
            table.addCell(cell);
            table.addCell(cell);
            table.addCell(cell);

            writer.getDirectContent().addImage(img);
            writer.getDirectContent().addImage(img2);
            writer.getDirectContent().addImage(img3);
            writer.getDirectContent().addImage(img4);
            writer.getDirectContent().addImage(img5);
            writer.getDirectContent().addImage(img6);

            document.add(table);
            document.close();
            writer.close();
        } catch (DocumentException ex) {
            Logger.getLogger(PdfTab.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PdfTab.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PdfTab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
