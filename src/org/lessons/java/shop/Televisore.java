package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto{
    private int height;
    private int width;
    private boolean isSmart;

    public Televisore(int codex, String name, String brand, BigDecimal price, BigDecimal tax, int height, int width, boolean isSmart){
        super(codex,name,brand,price,tax);
        this.height = height;
        this.width = width;
        this.isSmart = isSmart;
    }
    
    protected int getHeight(){return height;}
    protected int getWidth(){return width;}
    protected boolean getIsSmart(){return isSmart;}

    protected void setHeight(int theheight){height=theheight;}
    protected void setWidth(int thewidth){width=thewidth;}
    protected void setIsSmart(boolean theissmart){isSmart=theissmart;}

}
