package com.sunko.entities;

import java.util.ArrayList;
import java.util.List;

public class Cat {
    private int name;
    private int gender;

    public Cat() {
    }

    public Cat(int name, int gender) {
        this.name = name;
        this.gender = gender;
    }

    public int getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    @Override
    public String toString() {



        return getName()+" "+getGender();
    }
}
