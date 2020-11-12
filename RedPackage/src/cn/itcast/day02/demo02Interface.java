package cn.itcast.day02;

public class demo02Interface {
    public static void main(String[] args){
        MyInterfaceDefaultA a=new MyInterfaceDefaultA();
        a.methodsA();
        a.defaultMethods();
        MyInterfaceDefaultB b=new MyInterfaceDefaultB();
        b.methodsA();
        b.defaultMethods();
    }
}
