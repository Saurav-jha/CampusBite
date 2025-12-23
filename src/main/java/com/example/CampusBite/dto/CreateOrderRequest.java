package com.example.CampusBite.dto;

import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrderRequest {
    @NotEmpty
    private List<CreateOrderItemRequest> items;
}
