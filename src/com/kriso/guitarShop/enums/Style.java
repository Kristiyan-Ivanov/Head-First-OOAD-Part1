package com.kriso.guitarShop.enums;

public enum Style {
    A, F;

    @Override
    public String toString() {
        switch (this) {
            case A:
                return "a style";
            case F:
                return "f style";
        }
        return null;
    }
}
