package com.app.ecommerce.payload.role;

import com.app.ecommerce.payload.BaseDto;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonPropertyOrder(value = {"id", "name", "description", "createdBy", "createdDate", "modifiedBy", "modifiedDate"})
public class RoleDto extends BaseDto {
    private String name;
    private String description;
}
