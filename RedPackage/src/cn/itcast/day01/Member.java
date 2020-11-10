package cn.itcast.day01;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member(){

    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list){
//        从众多红包中随机获取一个，给自己；
        int index=new Random().nextInt(list.size());
        int delta=list.remove(index);
        int money=super.getMoney();
        super.setMoney(money+delta);
    }
}
