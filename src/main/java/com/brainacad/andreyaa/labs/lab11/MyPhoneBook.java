package com.brainacad.andreyaa.labs.lab11;

class MyPhoneBook {

    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    public void addPhoneNumbers(String name, String phone) {
        PhoneNumber phoneNumber = new PhoneNumber(name, phone);
        for (int i = 0; i < phoneNumbers.length; i++) {
            if (phoneNumbers[i] == null) {
                phoneNumbers[i] = phoneNumber;
                i = phoneNumbers.length;
            }
        }
    }

    public void printPhoneBook() {
        for (PhoneNumber pn : phoneNumbers) {
            if (pn != null) {
                System.out.println(pn);
            } else
                continue;
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

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "PhoneNumber {" +
                    "name = '" + name + '\'' +
                    ", phone = '" + phone + '\'' +
                    '}';
        }
    }
}
