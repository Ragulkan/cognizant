package DesignPatterns.FactoryMethodPatternExample;

public class ExcelDocumentary extends Documentary {
  public Document createDocument() {
      return new ExcelDocument();
  }
}
