package TemplatePattern;

public class PngToJpeg extends Convertor {

    private String pngPath;
    private String savePath;

    public PngToJpeg(String pngPath, String savePath) {
        this.pngPath = pngPath;
        this.savePath = savePath;

    }

    public void readFromStorage() {
        System.out.println("Reading PNG");
    }

    public void convertToIntermidiateForm() {
        System.out.println("Converting PNG to intermidiate form");
    }

    public void convertToFinalForm() {
        System.out.println("Converting intermidiate form to JPEG");
    }

    public void writeToStorage() {
        System.out.println("Writing JPEG to storage");
    }
}
