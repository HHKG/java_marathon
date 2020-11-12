package cn.itcast.day02;
/*
* 在任何java版本中，接口都能定义抽象方法；
* public abstract 返回值类型 方法名称(参数列表)；
* 注意事项：
* 接口当中的抽象方法，修饰符必须是两个固定的关键字；public abstract,这两个修饰符可以选择性省略；
*
* 接口使用步骤：
* 1：接口不能直接使用，必须要有一个实现类来实现这个方法；
* 格式：
* public class 实现类名称 implements 接口名称{
*   //...
* }
* 2：接口的实现类必须覆盖重写接口中所有的抽象方法，实现：去掉abstract关键字，加上方法体大括号(MyInterfaceAbstractImpl)。
* 3：创建实现类的对象，进行使用（demo01Interface）；
**************************这个接口的实现类是MyInterAbstractImpl
* */
public interface MyInterfaceAbstract {
//    这是一个抽象方法
    public abstract void methodsAbstract();

}
