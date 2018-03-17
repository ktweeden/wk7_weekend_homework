package Instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(String model, int wholesalePrice, int salePrice, int numberOfStrings) {
        super(model, wholesalePrice, salePrice);
        this.setInstrumentType(InstrumentType.STRING);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String play() {
        return "Krraaaannnngggg";
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }
}
