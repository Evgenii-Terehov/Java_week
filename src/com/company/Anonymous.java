package com.company;

interface Animal{
    public void eat();
}

public class Anonymous {
    public static void main(String[] args) {
        Animal KoshkaEat = new Animal() {
            @Override
            public void eat() {
                System.out.println("Kisa is eating...");
            }
        };
        KoshkaEat.eat();
    }
}



 class PhoneNumberValidator {
     class PhoneNumber {

         private String phoneNumber;

         public PhoneNumber() {
             String number;
             this.phoneNumber = number;
         }

         public String getPhoneNumber() {
             return phoneNumber;
         }

         public void setPhoneNumber(String phoneNumber) {
             this.phoneNumber = phoneNumber;
         }
     }
    public void validatePhoneNumber(String number) {



        //...код валидации номера
    }

    //ошибка! компилятор не понимает, что это за класс - PhoneNumber
    public PhoneNumber generatePhoneNumber() {

    }

}
