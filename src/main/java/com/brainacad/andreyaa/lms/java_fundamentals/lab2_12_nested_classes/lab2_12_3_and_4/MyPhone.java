package com.brainacad.andreyaa.lms.java_fundamentals.lab2_12_nested_classes.lab2_12_3_and_4;

import java.util.Arrays;
import java.util.Comparator;

class MyPhone {

    private MyPhoneBook myPhoneBook = new MyPhoneBook();

    public MyPhone() {
    }

    public void switchOn() {
        System.out.println("Loading PhoneBook records... OK!");
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Veronica", "0505123456");
        myPhoneBook.addPhoneNumber("Alexey", "0679877565");
        myPhoneBook.addPhoneNumber("Fedor", "0672674848");
        myPhoneBook.addPhoneNumber("Anna", "0674887955");
        myPhoneBook.addPhoneNumber("Andrey", "0679587546");
        myPhoneBook.addPhoneNumber("Masha", "0997471212");
        myPhoneBook.addPhoneNumber("Karina", "0664584551");
        myPhoneBook.addPhoneNumber("Ivan", "0504875584");
        myPhoneBook.addPhoneNumber("Sasha", "0684545425");
        myPhoneBook.addPhoneNumber("Katya", "0679454546");

        myPhoneBook.sortByName();
        myPhoneBook.printPhoneBook();

        setMyPhoneBook(myPhoneBook);

        System.out.println();
    }

    public void call(int index) {
        try {
            System.out.println("Calling to --> " + myPhoneBook.phoneNumbers[index - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(index + " doesn't exist!");
        }
    }

    public void setMyPhoneBook(MyPhoneBook myPhoneBook) {
        this.myPhoneBook = myPhoneBook;
    }

    // Lab 2-12-4
    static class MemoryCard {}
    static class SimCard {}
    class Camera {}
    class Bluetooth {}
    class TouchScreen {}
    class PowerOnButton {}
    class PhoneBattery{}
    class PhoneDisplay{}
    class PhoneSpeaker{}


    class MyPhoneBook {

        private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

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

        class PhoneNumber {

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

}
