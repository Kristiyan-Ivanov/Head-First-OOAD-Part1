package com.kriso.dogDoors;

import java.util.Objects;

public class DogBark {
    private String bark;

    public DogBark(String bark) {
        this.bark = bark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DogBark dogBark = (DogBark) o;
        return Objects.equals(this.bark, dogBark.bark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bark);
    }

    public String getBark() {
        return bark;
    }
}
