package com.app.ecommerce.payload.category;

import com.app.ecommerce.payload.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDto extends BaseDto {
    private String name;
    private String alias;
    private String image;
    private Boolean enabled;
    private Boolean hasChildren;
}
