package com.kriso.guitarShop.enums;

public enum InstrumentType {
    GUITAR, BANJO, MANDOLIN, DOBRO, FIDDLE, BASS;

    @Override
    public String toString() {
        switch (this) {
            case BANJO:
                return "Banjo";
            case GUITAR:
                return "Guitar";
            case MANDOLIN:
                return "Mandolin";
            case DOBRO:
                return "Dobro";
            case BASS:
                return "Bass";
            case FIDDLE:
                return "Fiddle";
            default:
                return "Unspecified";
        }
    }
}
