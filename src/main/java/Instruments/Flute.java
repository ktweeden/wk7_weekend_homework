package Instruments;

public class Flute extends Instrument{


    public Flute(String model, int wholesalePrice, int salePrice) {
        super(model, wholesalePrice, salePrice);
        this.setInstrumentType(InstrumentType.WIND);
    }

    @Override
    public String play() {
        return "Toot toot";
    }
}
