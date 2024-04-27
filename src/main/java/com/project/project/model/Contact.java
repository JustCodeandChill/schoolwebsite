package com.project.project.model;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;
@Data
public class Contact {
    private String name;
    private String mobileNum;
    private String email;
    private String subject;

    private String message;
}
