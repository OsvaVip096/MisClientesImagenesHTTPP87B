package com.osvaldovillalobosperez.misclientesimageneshttpp87b;

/**
 * Objeto Card que contiene los atributos de nombre y URL del heroe.
 */
public class Card {
    private String imgUrl;
    private String name;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card(String imgUrl, String name) {
        this.imgUrl = imgUrl;
        this.name = name;
    }
}
