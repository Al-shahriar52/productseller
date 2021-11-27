package com.example.productseller.repository.projection;

import java.time.LocalDateTime;
public interface IPurchaseItem {
    String getTitle();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}
