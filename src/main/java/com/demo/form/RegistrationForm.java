package com.demo.form;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

@Data
public class RegistrationForm implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotEmpty
    @Size(max = 20)
    private String firstName;

    @NotEmpty
    @Size(max = 20)
    private String lastName;

    @Size(max = 40)
    private String email;

    @NotEmpty
    @Size(max = 40)
    private String address1;

    @Size(max = 40)
    private String address2;

    @NotEmpty
    @Size(max = 20)
    private String country;

    @NotEmpty
    @Size(max = 20)
    private String city;

    @NotEmpty
    @Size(max = 20)
    private String zip;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateOfBirth;

    private Boolean saveInfo;
}
