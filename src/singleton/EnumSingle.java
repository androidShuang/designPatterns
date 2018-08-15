package singleton;

/**
 *
 * 下面深入了解一下为什么枚举会满足线程安全、序列化等标准。

 在JDK5 中提供了大量的语法糖，枚举就是其中一种。
 所谓 语法糖（Syntactic Sugar），也称糖衣语法，是由英国计算机学家 Peter.J.Landin 发明的一个术语，指在计算机语言中添加的某种语法，这种语法对语言的功能并没有影响，但是但是更方便程序员使用。只是在编译器上做了手脚，却没有提供对应的指令集来处理它。

 就拿枚举来说，其实Enum就是一个普通的类，它继承自java.lang.Enum类。

 public enum DataSourceEnum {
 DATASOURCE;
 }

 把上面枚举编译后的字节码反编译，得到的代码如下：

 public final class DataSourceEnum extends Enum<DataSourceEnum> {
 public static final DataSourceEnum DATASOURCE;
 public static DataSourceEnum[] values();
 public static DataSourceEnum valueOf(String s);
 static {};
 }

 由反编译后的代码可知，DATASOURCE 被声明为 static 的，根据在【单例深思】饿汉式与类加载 中所描述的类加载过程，可以知道虚拟机会保证一个类的<clinit>() 方法在多线程环境中被正确的加锁、同步。所以，枚举实现是在实例化时是线程安全。

 接下来看看序列化问题：

 Java规范中规定，每一个枚举类型极其定义的枚举变量在JVM中都是唯一的，因此在枚举类型的序列化和反序列化上，Java做了特殊的规定。
 在序列化的时候Java仅仅是将枚举对象的name属性输出到结果中，反序列化的时候则是通过 java.lang.Enum 的 valueOf() 方法来根据名字查找枚举对象。
 也就是说，以下面枚举为例，序列化的时候只将 DATASOURCE 这个名称输出，反序列化的时候再通过这个名称，查找对于的枚举类型，因此反序列化后的实例也会和之前被序列化的对象实例相同。

 public enum DataSourceEnum {
 DATASOURCE;
 }

 由此可知，枚举天生保证序列化单例。
 *
 */

public enum  EnumSingle {
    INSTANCE;
}
