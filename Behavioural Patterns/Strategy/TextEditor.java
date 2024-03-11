package StrategyPattern;

public class TextEditor {
    private String text;
    private LineBreaker lineBreaker;

    public TextEditor(String text, LineBreaker lineBreaker) {
        this.lineBreaker = lineBreaker;
        this.text = text;
    }

    public void setLineBreaker(LineBreaker lineBreaker) {
        this.lineBreaker = lineBreaker;
    }

    public String formatText() {
        return lineBreaker.lineBreaker();
    }
}