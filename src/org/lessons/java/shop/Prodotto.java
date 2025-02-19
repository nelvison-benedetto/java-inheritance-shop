package org.lessons.java.shop;

import java.math.BigDecimal;

public class Prodotto {
    private int codex;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal tax;

    public Prodotto(int codex, String name, String brand, BigDecimal price, BigDecimal tax){
        this.codex = codex;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.tax = tax;
    }

    protected int getCodex(){
        return codex;
    }
    protected String getName(){return name;}
    protected String getBrand(){return brand;}
    protected BigDecimal getPrice(){return price;}
    protected BigDecimal getTax(){return tax;}
    
    protected void setName(String thename){name=thename;}
    protected void setBrand(String thebrand){brand=thebrand;}
    protected void setPrice(BigDecimal theprice){price=theprice;}
    protected void setTax(BigDecimal thetax){tax=thetax;}

    public String toString(){  //usa sempre public x toString()(è una class obj, ereditato da TUTTE le classi)!
        return String.format("Code: %d, Name: %s, Brand: %s, Price: %s, Tax: %s", codex, name.trim(), brand.trim(), price.toPlainString(), tax.toPlainString());  //toPlainString() x convert bigdecimal
    }
}
