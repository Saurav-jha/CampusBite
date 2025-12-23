package com.example.CampusBite.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateOrderStatusRequest {
    @NotBlank
    private String action; 
    // ACCEPT | PREPARE | READY | CANCEL
}
