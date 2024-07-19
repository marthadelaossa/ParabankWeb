package com.parasoft.parabank.utils;

import net.datafaker.Faker;
import java.util.Locale;
public class Datos {
    static Faker faker = new Faker(new Locale("en-US"));
    public static String userName=faker.internet().username();
    public static String password=faker.internet().password();
    public static String firstName=faker.name().firstName();
    public static String lastName=faker.name().lastName();
    public static String address=faker.address().fullAddress();
    public static String phone=faker.phoneNumber().cellPhone();
    public static String city = faker.address().city();
    public static String state = faker.address().state();
    public static String zipCode = faker.address().zipCode();
    public static String SSN = String.valueOf(faker.idNumber().valid() );
}


