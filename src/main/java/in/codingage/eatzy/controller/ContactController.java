package in.codingage.eatzy.controller;


import in.codingage.eatzy.model.Contact;
import in.codingage.eatzy.model.Menu;
import in.codingage.eatzy.service.ContactService;
import in.codingage.eatzy.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Contact")
@CrossOrigin(origins = "*")

public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("create")
    public Contact createContact(@RequestBody Contact contact) {
        return contactService.saveContact(contact);
    }


    @GetMapping("getAll")
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }
}
