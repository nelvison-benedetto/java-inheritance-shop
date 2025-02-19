package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto{
    private int imei;
    private int rom;

    public Smartphone(int codex, String name, String brand, BigDecimal price, BigDecimal tax, int imei, int rom){
        super(codex,name,brand,price,tax);  //super() 1 sola volta
        this.imei = imei;
        this.rom = rom;
    }

    protected int getImei(){return imei;}
    protected int getRom(){return rom;}
    
    protected void setImei(int theimei){imei=theimei;}
    protected void setRom(int therom){rom=therom;}

    @Override
    public String toString(){  //usa sempre public x toString()(è una class obj, ereditato da TUTTE le classi)!
        return String.format("Code: %d, Name: %s, Brand: %s, Price: %s, Tax: %s, Imei: %d, Rom: %d", this.getCodex(), this.getName().trim(), this.getBrand().trim(), this.getPrice().toPlainString(), this.getTax().toPlainString(), this.imei, this.rom);  //use getX x  get data, toPlainString() x convert bigdecimal
    }
}
