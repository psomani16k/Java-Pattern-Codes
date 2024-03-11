package TemplatePattern;

abstract class Convertor {
    public final void convert() {
        readFromStorage();
        convertToIntermidiateForm();
        convertToFinalForm();
        writeToStorage();
    }

    abstract void readFromStorage();

    abstract void convertToIntermidiateForm();

    abstract void convertToFinalForm();

    abstract void writeToStorage();
}
