package com.mercadopreso.item.gateways.client.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstoqueResponse {
    private String sku;
    private String name;
    private String type;
    private Integer quantity;
}

