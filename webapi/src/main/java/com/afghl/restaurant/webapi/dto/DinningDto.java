package com.afghl.restaurant.webapi.dto;

import lombok.Data;

@Data
public class DinningDto {
    private Long id;
    private long tableId;
    private int status;
}
