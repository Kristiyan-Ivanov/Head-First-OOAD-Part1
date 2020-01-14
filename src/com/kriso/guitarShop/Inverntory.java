package com.kriso.guitarShop;

import java.util.LinkedList;
import java.util.List;

public class Inverntory {
    private List<Instrument> instruments;

    public Inverntory() {
        instruments = new LinkedList<>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = new Instrument(serialNumber, price, spec);
        instruments.add(instrument);
    }

    public Instrument getInstrument(String serialNumber) {
        for (Instrument instrument : instruments) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public List<Instrument> search(InstrumentSpec searchInstrument) {
        List<Instrument> matchingInstruments = new LinkedList<>();
        for (Instrument instrument: instruments) {
            if (instrument.getSpec().matches(searchInstrument)) {
                matchingInstruments.add(instrument);
            }
        }
        return matchingInstruments;
    }
}
