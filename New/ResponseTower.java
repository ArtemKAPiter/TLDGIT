package com.bears.webPage.domain.towerOfMagic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseTower {
    private String title;
    private int price;
    private String photo_url;
    private int discount;
    private String item_id;
    private int expiration;
}
