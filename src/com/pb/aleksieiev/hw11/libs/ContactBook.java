package com.pb.aleksieiev.hw11.libs;

import com.pb.aleksieiev.hw11.ContactItem;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {
    List<ContactItem> book = new ArrayList<>();

    public void addContact(ContactItem newContact){
        this.book.add(newContact);
    }
}
