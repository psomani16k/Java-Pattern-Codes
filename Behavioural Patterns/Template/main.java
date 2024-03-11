package TemplatePattern;

public class main {
    public static void main(String[] args) {
        Convertor convertor = new JpegToTiff("null", "null");
        convertor.convert();
        convertor = new TiffToPng("null", "null");
        System.out.println("______________");
        convertor.convert();
    }

}
