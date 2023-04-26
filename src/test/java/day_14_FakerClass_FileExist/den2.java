package day_14_FakerClass_FileExist;

import com.github.javafaker.Faker;

public class den2 {


    public static void main(String[] args) {

        Faker fake=new Faker();
        System.out.println("fake.address().timeZone() = " + fake.address().timeZone());
        System.out.println("fake.name().firstName() = " + fake.name().firstName());
        System.out.println("fake.ancient().hero() = " + fake.ancient().hero());
        System.out.println("fake.internet().avatar() = " + fake.internet().avatar());
        System.out.println("fake.number().randomDigit() = " + fake.number().digits(21));
    }


}
