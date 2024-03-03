package com.app.ecommerce.payload;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseDto {
    private Long id;
    private Long createdBy;
    private Date createdDate;
    private Long modifiedBy;
    private Date modifiedDate;
}
