package com.company;


// concept of inheritance


class Car {
 int speed;
    public void speed()
    {
        System.out.println("speed is 3 m/s");
    }

}
class Audi extends Car {

    public void details() {


        {
            System.out.print("audi is black");
        }

    }
}

class Main{
    public static void main(String args[])
    {

        Audi a= new Audi();
        a.speed();
        a.details();


    }
}








