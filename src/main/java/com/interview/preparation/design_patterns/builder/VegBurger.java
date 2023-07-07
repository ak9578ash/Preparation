package com.interview.preparation.design_patterns.builder;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public Float price() {
        return 12.6f;
    }
}
