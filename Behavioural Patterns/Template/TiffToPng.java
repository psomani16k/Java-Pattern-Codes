package TemplatePattern;

public class TiffToPng extends Convertor {
    private String pngPath;
    private String savePath;

    public TiffToPng(String pngPath, String savePath) {
        this.pngPath = pngPath;
        this.savePath = savePath;

    }

    public void readFromStorage() {
        System.out.println("Reading TIFF");
    }

    public void convertToIntermidiateForm() {
        System.out.println("Converting TIFF to intermidiate form");
    }

    public void convertToFinalForm() {
        System.out.println("Converting intermidiate form to PNG");
    }

    public void writeToStorage() {
        System.out.println("Writing PNG to storage");
    }

}
