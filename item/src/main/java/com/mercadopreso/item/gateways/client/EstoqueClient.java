package com.mercadopreso.item.gateways.client;

import com.mercadopreso.item.gateways.client.dto.AddItemsRequestDto;
import com.mercadopreso.item.gateways.client.dto.CartDto;
import com.mercadopreso.item.gateways.client.response.EstoqueResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "estoqueClient", url = "http://10.3.55.22:8080")
public interface EstoqueClient {

    @GetMapping("/inventory/products/{sku}")
    EstoqueResponse getProductBySku(@PathVariable("sku") String sku);

    @GetMapping("/inventory/products/")
    List<EstoqueResponse> getAllProducts();

    @PostMapping("/inventory/products/")
    CartDto addItems(@RequestBody AddItemsRequestDto request);
}
