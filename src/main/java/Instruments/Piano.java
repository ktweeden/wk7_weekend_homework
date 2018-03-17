package Instruments;

public class Piano extends Instrument{


    public Piano(String model, int wholesalePrice, int salePrice) {
        super(model, wholesalePrice, salePrice);
        this.setInstrumentType(InstrumentType.PERCUSSION);
    }

    @Override
    public String play() {
        return "Plink plonk";
    }
}
