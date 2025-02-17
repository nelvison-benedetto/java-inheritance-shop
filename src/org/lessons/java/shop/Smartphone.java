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
    protected void printInfo(){
        System.out.printf("Code: %d, Name: %s, Brand: %s, Price: %s, Tax: %s, Imei: %d, Rom: %d %n",getCodex(),getName(),getBrand(),getPrice().toPlainString(),getTax().toPlainString(),imei,rom);  //%n x a capo
    }

}
