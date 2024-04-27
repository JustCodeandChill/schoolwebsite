package com.project.project.service;

import com.project.project.model.Contact;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ContactService {
    public boolean saveMessageDetails(Contact c) {
        boolean isSaved = true;
        System.out.println(c.toString());
        return isSaved;
    }
}
