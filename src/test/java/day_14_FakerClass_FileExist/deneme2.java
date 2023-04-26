package day_14_FakerClass_FileExist;

import com.github.javafaker.Faker;

public class deneme2 {


    public static void main(String[] args) {

        //1. Faker objesi oluştururuz       //rastgele degerler uretmek icin kullanilir

        Faker fake=new Faker();// Faker clasii  bir java clasii dir

        //Firstname yazdıralım
        System.out.println("fake.name().firstName() = " + fake.name().firstName());
        //Lastname yazdıralım
        System.out.println("fake.name().lastName() = " + fake.name().lastName());

        //Kullanıcı adi yazdıralım
        System.out.println("fake.name().username() = " + fake.name().username());

        //Meslek ismi yazdıralım
        System.out.println("fake.job() = " + fake.job());
        System.out.println("fake.job().position() = " + fake.job().position());
        System.out.println("fake.job().title() = " + fake.job().title());
        System.out.println("fake.job().field() = " + fake.job().field());

        //Şehir ismi yazdıralım
        System.out.println("fake.address().city() = " + fake.address().city());

        //Ulke ismi yazdıralım
        System.out.println("fake.address().country() = " + fake.address().country());


        //adress yazdıralım
        System.out.println("fake.address().fullAddress() = " + fake.address().fullAddress());


        //telefon numarası
        System.out.println("fake.phoneNumber().cellPhone() = " + fake.phoneNumber().cellPhone());


        //zipcode numarası
        System.out.println("fake.address().zipCode() = " + fake.address().zipCode());

        //Rastgele 15 haneli bir numara

        System.out.println("fake.number().digits(190) = " + fake.number().digits(067));

        //email adress
        System.out.println("fake.internet().emailAddress() = " + fake.internet().emailAddress());


    }



}
