package cn.itcast.day02;
/*
* 接口就是多个类的公共规范；
* 接口是一种引用数据类型，其中最重要的内容就是抽象方法（obj）;
* 如何定义一个接口的格式：
* public interface 接口名称{
*   //接口内容
* }
* 备注：
* */
public class demo01Interface {
    public static void main(String[] args){
        MyInterfaceAbstractImpl impl=new MyInterfaceAbstractImpl();
        impl.methodsAbstract();
    }
}
