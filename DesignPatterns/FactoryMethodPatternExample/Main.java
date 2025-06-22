package DesignPatterns.FactoryMethodPatternExample;

public class Main {
  public static void main(String[] args) {
    Documentary wordFactory = new WordDocumentary();
    Document wordDoc = wordFactory.createDocument();
    wordDoc.open();

    Documentary pdfFactory = new PdfDocumentary();
    Document pdfDoc = pdfFactory.createDocument();
    pdfDoc.open();

    Documentary excelFactory = new ExcelDocumentary();
    Document excelDoc = excelFactory.createDocument();
    excelDoc.open();
}
  
}
