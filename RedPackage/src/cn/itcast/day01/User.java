package cn.itcast.day01;

public class User {
    public static void main(String[] args){

    }
    private String name;
    private int money;
    public User(){

    }
    public User(String name,int money){
        this.money=money;
        this.name=name;
    }
//    展示一下当前有多少钱；
    public void show(){
        System.out.println("我叫："+name+"，未来身家"+money+"亿");
    }
    public String getName(){
        return name;
    }

    public void setName(){
        this.name=name;
    }

    public int money(){
        return money;
    }

    public void setMoney(int money){
        this.money=money;
    }
    public int getMoney(){
        return money;
    }
}
