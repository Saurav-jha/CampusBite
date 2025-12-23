package com.example.CampusBite.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderResponse {
    private String orderNumber;
    private String status;
    private BigDecimal totalAmount;
    private LocalDateTime estimatedReadyTime;
    private LocalDateTime actualReadyTime;
    private List<OrderItemResponse> items;
}
