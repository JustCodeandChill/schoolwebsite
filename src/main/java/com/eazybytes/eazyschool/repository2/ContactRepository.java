package com.eazybytes.eazyschool.repository2;

import com.eazybytes.eazyschool.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
}
