package com.mercadopreso.item.gateways.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddItemsRequestDto {
    private List<String> itemIdList;
    private String userId;
}

