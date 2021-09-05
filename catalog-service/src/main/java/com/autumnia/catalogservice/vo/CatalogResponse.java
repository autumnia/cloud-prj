package com.autumnia.catalogservice.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogResponse {
	private String productId;
	private String productName;
	private Integer unitPrice;
	private Integer stock;
	private Date createdAt;
}
