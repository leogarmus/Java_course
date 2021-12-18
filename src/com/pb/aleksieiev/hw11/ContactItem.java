package com.pb.aleksieiev.hw11;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class ContactItem {
    private String name;
    private LocalDate dateOfBirth;
    private String address;
    private String phone;
    private LocalDate updateDate;


    public ContactItem(String name, LocalDate dateOfBirth, String address, String phone) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.updateDate = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "ФИО='" + name + '\'' +
                ", Номер телефона='" + phone + '\'' +
                ", Дата рождения='" + dateOfBirth + '\'' +
                ", Адрес='" + address + '\n';
    }

}
