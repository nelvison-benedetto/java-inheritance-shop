package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{
    private String color;
    private boolean isWireless;

    public Cuffie(int codex, String name, String brand, BigDecimal price, BigDecimal tax, String color, boolean isWireless){
        super(codex,name,brand,price,tax);
        this.color = color;
        this.isWireless = isWireless;
    }

    protected String getColor(){return color;}
    protected boolean getIsWireless(){return isWireless;}

    protected void setColor(String thecolor){color=thecolor;}
    protected void setIsWireless(boolean theiswireless){isWireless=theiswireless;}
    
}
