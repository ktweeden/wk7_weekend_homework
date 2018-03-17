package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements ISell, IPlay {
    private int wholesalePrice;
    private int salePrice;
    private InstrumentType instrumentType;
    private String model;

    public Instrument(String model, int wholesalePrice, int salePrice) {
        this.model = model;
        this.wholesalePrice = wholesalePrice;
        this.salePrice = salePrice;
        this.instrumentType = instrumentType;
    }

    @Override
    public int calculateMarkup() {
        return this.salePrice - this.wholesalePrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public int getWholesalePrice() {
        return wholesalePrice;
    }

    public String getModel() {
        return model;
    }

    void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

}
