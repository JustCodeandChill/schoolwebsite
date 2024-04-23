package com.project.project.service;

import com.project.project.model.Contact;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    public boolean saveMessageDetails(Contact c) {
        boolean isSaved = true;
        System.out.println(c.toString());
        return isSaved;
    }
}
