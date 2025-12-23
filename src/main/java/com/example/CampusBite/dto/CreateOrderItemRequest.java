package com.example.CampusBite.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrderItemRequest {
    @NotNull
    private Long menuItemId;

    @Min(1)
    private Integer quantity;
}
