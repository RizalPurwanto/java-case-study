package javacasestudy.javagym.model;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterCustomerRequest  {

    @NotBlank
    @Size(max = 50)
    private String name;

    @NotBlank
    @Size(max = 50)
    private String email;

    @NotBlank
    @Size(max = 50)
    private String password;

    // @NotBlank
    // @Size(max = 50)
    // private String phoneNumber;

    // @NotBlank
    // @Size(max = 50)
    // private String creditCardNumber;

    // @NotBlank
    // @Size(max = 50)
    // private String cvv;

    // @NotBlank
    // private Date creditCardExpiredDate;
    
    // @NotBlank
    // @Size(max = 50)
    // private String creditCardOwner;
}
