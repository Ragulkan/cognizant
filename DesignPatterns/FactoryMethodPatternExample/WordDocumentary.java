package DesignPatterns.FactoryMethodPatternExample;

public class WordDocumentary extends Documentary {
  public Document createDocument() {
      return new WordDocument();
  }
}