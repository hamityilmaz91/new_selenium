package day_07;

import org.junit.*;

public class jUnit02 {

    @BeforeClass
    public static void ilk_ve_tek(){
        System.out.println("BEN EN ONCE CALISIIRIM VE BIR KERE CALISIRIM\n" +
                "Ama HERKESTE KALITIMIM OLUR ");
    }

    @AfterClass
    public static void son_ve_tek(){
        System.out.println("BEN EN SON VE BIR DEFA CALISIIRM");
    }





    @Before

    public void hertestoncesi(){

        System.out.println("her test oncesi calisir");

    }

    @After

    public void hertestsonrasi(){

        System.out.println("Her test sonrasi calisir");
    }


    @Test
    public void toplama(){

        int a = 5;
        System.out.println("toplama = "+a);
    }

    @Test
    public void cikarma(){
        int a=6;
        System.out.println("cikarma = "+a);
    }


















}//class
