package cn.itcast.day01;

import java.util.ArrayList;

public class Manager extends User {
    public Manager(){

    }
    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalmoney,int count){
//        首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList=new ArrayList<>();
        int leftMoney=super.getMoney();
        if(totalmoney>leftMoney){
            System.out.println("余额不足！");
            return redList;
        }
//        扣钱，其实就是重新扣钱；
        super.setMoney(leftMoney-totalmoney);
//        发红包需要平均拆分成count份
        int avg=totalmoney/count;
        int mod=totalmoney%count;
//        剩下的零头，包在最后一个红包中；
        for(int i=0;i<count;i++){
            redList.add(avg);
        }
        int last=avg+mod;
        redList.add(last);
        return redList;

    }
}
