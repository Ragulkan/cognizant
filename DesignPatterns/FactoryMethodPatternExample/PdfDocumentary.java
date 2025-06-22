package DesignPatterns.FactoryMethodPatternExample;

public class PdfDocumentary extends Documentary {
  public Document createDocument() {
      return new PdfDocument();
  }
}

