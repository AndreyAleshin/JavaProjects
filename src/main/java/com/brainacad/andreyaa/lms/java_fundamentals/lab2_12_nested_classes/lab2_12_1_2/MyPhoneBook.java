package com.brainacad.andreyaa.lms.java_fundamentals.lab2_12_nested_classes.lab2_12_1_2;

import java.util.Arrays;
import java.util.Comparator;

class MyPhoneBook {

    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    // Lab 2-12-1
    void addPhoneNumber(String name, String phone) {
        PhoneNumber phoneNumber = new PhoneNumber(name, phone);
        for (int i = 0; i < phoneNumbers.length; i++) {
            if (phoneNumbers[i] == null) {
                phoneNumbers[i] = phoneNumber;
                break;
            }
        }
    }

    void printPhoneBook() {
        for (PhoneNumber phoneNumber : phoneNumbers) {
            if (phoneNumber != null)
                System.out.println(phoneNumber);
        }
    }

    static class PhoneNumber {

        private String name;
        private String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", phone: " + phone;
        }

    }


    // Lab 2-12-2
    void sortByName() {
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                if (o1 != null && o2 != null) {
                    if (o1.getName().compareTo(o2.getName()) > 1) return 1;
                    if (o1.getName().compareTo(o2.getName()) < 1) return -1;
                }
                return 0;
            }
        });
    }

    void sortByPhoneNumber() {
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                if (o1 != null && o2 != null) {
                    if (o1.getPhone().compareTo(o2.getPhone()) > 1) return 1;
                    if (o1.getPhone().compareTo(o2.getPhone()) < 1) return -1;
                }
                return 0;
            }
        });
    }


}
