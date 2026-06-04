package kr.ac.hansung.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {

    @NotBlank
    private String name;

    @Min(0)
    private int price;

    private String description;

    @Min(0)
    private int stock;
}
