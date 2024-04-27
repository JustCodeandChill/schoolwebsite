package com.project.project.model;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;
@Data
public class Contact {
    @NotBlank(message = "Name must not be empty")
    @Size(min = 3, message = "name must be at least 3 characters")
    private String name;

    @NotBlank(message = "phone number must not blank")
    @Pattern(regexp ="(^$|[0-9]{10})", message = "phone number must be valid")
    private String mobileNum;

    @NotBlank(message = "where is email")
    @Email(message = "EMail must be valid")
    private String email;

    @NotBlank(message="Subject must not be blank")
    @Size(min=5, message="Subject must be at least 5 characters long")
    private String subject;

    @NotBlank(message="Message must not be blank")
    @Size(min=10, message="Message must be at least 10 characters long")
    private String message;
}
