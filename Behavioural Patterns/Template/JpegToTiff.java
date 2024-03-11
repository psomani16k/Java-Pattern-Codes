package TemplatePattern;

public class JpegToTiff extends Convertor {
    private String pngPath;
    private String savePath;

    public JpegToTiff(String pngPath, String savePath) {
        this.pngPath = pngPath;
        this.savePath = savePath;

    }

    public void readFromStorage() {
        System.out.println("Reading JPEG");
    }

    public void convertToIntermidiateForm() {
        System.out.println("Converting JPEG to intermidiate form");
    }

    public void convertToFinalForm() {
        System.out.println("Converting intermidiate form to TIFF");
    }

    public void writeToStorage() {
        System.out.println("Writing TIFF to storage");
    }

}
