package com.green.day16.ch7;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(10, 11, 12);
        //time.hour = 10;
        System.out.println(time.getHour());
        time.setHour(22);
        System.out.println(time.getHour());
        Clock clock = new Clock(22, 30, 40);
        clock.timeConversion();
        System.out.println(clock.getHour());

        clock.printTime();
        clock.setHour(10);
        clock.printTime();
    }

}

class Time {
    private int hour;//외부에서 접근 불가(캡슐화, 은닉화)
    private int minute; //A에서 사용하는 중 B가 중간에 값을 변경시키는 것을 막아줌
    private int second;
    Time(final int hour, final int minute, final int second) {//매개변수는 변하지 않기 때문에 final 사용가능
        this.hour = hour;//setter는 값 변경, getter는 값 리턴
        this.minute = minute;
        this.second = second;
    }//생성자를 통해서 값을 줄 수 있음

    public void setHour(int hour) {//set멤버필드명, void
        this.hour = hour;//메소드를 활용해서 값 변경 가능, if문을 활용하면 올바르지 않은 값을 검사 가능(무결성화)
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {//get멤버필드명, 멤버필드의 타입 리턴
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

}

class Clock extends Time {
    boolean h24;
    private String meridiem;
    Clock(int hour, int minute, int second) {
        super(hour, minute, second);
        this.h24 = true;
    }
    public void timeConversion() {
        this.h24 = !this.h24;
    }
    public void printTime() {
        if(h24 == true) {
            System.out.printf("%dH %dM %dS\n",getHour(), getMinute(), getSecond());
        }
        else {
            System.out.printf("%dH %dM %dS %s\n", getHour(), getMinute(), getSecond(), meridiem);
        }
    }
    @Override
    public int getHour() {
        int hour = super.getHour();
        if(h24 == false) {
            if(hour > 12) {
                hour -= 12;
                meridiem = "PM";
                return hour;
            }
            meridiem = "AM";
        }
        return hour;
    }
}
