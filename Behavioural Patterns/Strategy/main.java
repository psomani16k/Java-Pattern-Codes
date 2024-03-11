package StrategyPattern;

public class main {
    public static void main(String[] args) {
        LineBreaker lineBreaker = new AlgorithmOne();
        TextEditor textEditor = new TextEditor("Bohut saara text", lineBreaker);
        textEditor.formatText();
    }
}
