package cn.itcast.day02;

public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
//    覆盖重写接口的抽象方法
    @Override
    public void methodsAbstract() {
        System.out.println("这是第一个实现类");
    }
}
