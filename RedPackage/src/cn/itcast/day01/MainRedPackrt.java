package cn.itcast.day01;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainRedPackrt {
    public static void main(String[]args){
        Manager manager=new Manager("群主",100);
        Member one=new Member("成员A",0);
        Member two=new Member("成员B",0);
        Member three=new Member("成员C",0);
        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("===============");
//        群主总共发20块钱，分成3个红包
        ArrayList<Integer> redList=manager.send(20,3);
//        三个普通成员来收红包啦
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
