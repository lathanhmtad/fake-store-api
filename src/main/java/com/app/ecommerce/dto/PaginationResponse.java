package com.app.ecommerce.payload;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class PaginationResponse<T> {
    private List<T> data;
    private PaginationMetadata metadata;
}