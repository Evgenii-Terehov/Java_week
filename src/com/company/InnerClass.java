package com.company;

public class InnerClass {}

class Student{
    private String name;
    private String lastName;
    private int age;
    private Address address;
    public class Address{
        private String city;
        private int house;
        private int apartment;


        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    public Address getAddress() {
        return address;
    }
}

class Call{
    public static void main(String[] args) {
//         Если класс Student будет вложен в InnerClass:
//        InnerClass.Student.Address city = new InnerClass().new Student().new Address();
//        city.setCity("Kiiv");

        Student.Address city = new Student().new Address();
        city.setCity("Minsk");
        System.out.println(city.getCity());

        Student address = new Student();
        Student.Address address1 = address.getAddress();
    }

}
