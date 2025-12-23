package com.example.CampusBite.dto;

import java.math.BigDecimal;

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
public class DashboardStatsResponse {
    private Long totalOrdersToday;
    private BigDecimal totalRevenueToday;
    private Long activeOrders;
    private String peakHour;
}
