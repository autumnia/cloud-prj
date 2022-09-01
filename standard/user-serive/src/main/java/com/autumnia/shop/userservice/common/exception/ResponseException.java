package com.autumnia.shop.userservice.common.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseException {
    private Date timestamp;
    private String message;
    private String details;
}
