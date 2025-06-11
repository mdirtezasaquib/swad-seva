package in.codingage.eatzy.service;

import in.codingage.eatzy.model.Contact;

import java.util.List;

public interface ContactService {

    Contact saveContact(Contact contact);
    List<Contact> getAllContacts();
}
