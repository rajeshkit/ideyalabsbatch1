package org.ideyalabs.pms.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {
    // String name=null; @NotNull
    //String name=" "; @NotEmpty
    //String name=" "@NotBlank;
    @NotNull(message = "product id cannot be null add some product id")
    private Integer productId;
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",message = "Invalid passsword")
    private String password;
    @NotEmpty(message = "productName cannot empty !! enter the product name")
    private String productName;
    @NotNull(message = "product cost not eneter!! enter the product cost")
    @Min(value = 1,message = "product cost should be in negative")
    private int productCost;
    @NotBlank(message="email field cannot be empty")
    @Email(message = "Invalid Email")
    private String email;
}
