package com.example.springoppgave2;

public class Valuta {
    private String valutasort;
    private double valutakurs;

    public Valuta(String valutasort, double valutakurs){
        this.valutasort = valutasort;
        this.valutakurs =valutakurs;
    }

    public String getValutasort() {
        return valutasort;
    }

    public void setValutasort(String valutasort) {
        this.valutasort = valutasort;
    }

    public double getValutakurs() {
        return valutakurs;
    }

    public void setValutakurs(double valutakurs) {
        this.valutakurs = valutakurs;
    }
}
