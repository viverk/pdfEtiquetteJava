/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pdf;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
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
public class Pdf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Document document = new Document();

        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Promattex\\Desktop\\testPdf\\test.pdf"));

            Image img = Image.getInstance("C:\\Users\\Promattex\\Desktop\\testQrCode\\test.png");
            img.setAbsolutePosition(250, 650);
            img.scaleToFit(100,100);

            Image img2 = Image.getInstance("C:\\Users\\Promattex\\Desktop\\testQrCode\\test.png");
            img2.setAbsolutePosition(250, 485);
            img2.scaleToFit(100,100);

            Image img3 = Image.getInstance("C:\\Users\\Promattex\\Desktop\\testQrCode\\test.png");
            img3.setAbsolutePosition(250, 320);
            img3.scaleToFit(100,100);

            Image img4 = Image.getInstance("C:\\Users\\Promattex\\Desktop\\testQrCode\\test.png");
            img4.setAbsolutePosition(250, 155);
            img4.scaleToFit(100,100);

            Image img5 = Image.getInstance("C:\\Users\\Promattex\\Desktop\\testQrCode\\test.png");
            img5.setAbsolutePosition(250, 0);
            img5.scaleToFit(100,100);

            document.open();
            Font bold = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD);
            document.add(new Paragraph("nameen : balblalbalalb", bold));
            document.add(new Paragraph("namefr : ifjsiodjcoqsioj"));
            document.add(new Paragraph("ref : 456876531546878646543"));
            document.add(new Paragraph("date : 18/12/2022"));
            document.add(new Paragraph("cid : c0845" + "\n" + "\n" + "\n" + "\n" ));

            document.add(new Paragraph("nameen : balblalbalalb", bold));
            document.add(new Paragraph("namefr : ifjsiodjcoqsioj"));
            document.add(new Paragraph("ref : 456876531546878646543"));
            document.add(new Paragraph("date : 18/12/2022"));
            document.add(new Paragraph("cid : c0845" + "\n" + "\n" + "\n" + "\n"));

            document.add(new Paragraph("nameen : balblalbalalb", bold));
            document.add(new Paragraph("namefr : ifjsiodjcoqsioj"));
            document.add(new Paragraph("ref : 456876531546878646543"));
            document.add(new Paragraph("date : 18/12/2022"));
            document.add(new Paragraph("cid : c0845" + "\n" + "\n" + "\n" + "\n"));

            document.add(new Paragraph("nameen : balblalbalalb", bold));
            document.add(new Paragraph("namefr : ifjsiodjcoqsioj"));
            document.add(new Paragraph("ref : 456876531546878646543"));
            document.add(new Paragraph("date : 18/12/2022"));
            document.add(new Paragraph("cid : c0845" + "\n" + "\n" + "\n" + "\n" + "\n"));

            document.add(new Paragraph("nameen : balblalbalalb", bold));
            document.add(new Paragraph("namefr : ifjsiodjcoqsioj"));
            document.add(new Paragraph("ref : 456876531546878646543"));
            document.add(new Paragraph("date : 18/12/2022"));
            document.add(new Paragraph("cid : c0845"  ));

            writer.getDirectContent().addImage(img);
            writer.getDirectContent().addImage(img2);
            writer.getDirectContent().addImage(img3);
            writer.getDirectContent().addImage(img4);
            writer.getDirectContent().addImage(img5);
            document.close();
            writer.close();
        } catch (DocumentException ex) {
            Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
