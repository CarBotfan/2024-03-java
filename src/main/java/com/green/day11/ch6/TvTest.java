package com.green.day11.ch6;

public class TvTest {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.color = "red";
        tv.channel = 10;
        tv.power = true;
        tv.power();
        System.out.printf("color: %s, channel: %d, power: %b\n", tv.color, tv.channel, tv.power);
        tv.channelUp();
        Tv tv2 = new Tv();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        System.out.println("tv == tv2: " + (tv == tv2));
        System.out.printf("color: %s, channel: %d, power: %b\n", tv2.color, tv2.channel, tv2.power);

    }
}
