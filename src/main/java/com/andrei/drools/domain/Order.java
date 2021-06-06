package com.andrei.drools.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Order {
    private String name;
    private String cardType;
    private int discount;
    private int price;
}
