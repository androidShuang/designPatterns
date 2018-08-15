package singleton;

/**
 *
 *  * 实际存在的问题是无序性。
 第5步这个new操作是无序的，它可能会被编译成：
 - a. 先分配内存，让instance指向这块内存
 - b. 在内存中创建对象

 然而我们需要意识到这么一个问题，synchronized虽然是互斥的，但不代表一次就把整个过程执行完，它在中间是可能释放时间片的，时间片不是锁。（我因为这里没转过来，耽误了很多时间）
 也就是说可能在a执行完后，时间片被释放，线程2执行到1，这时他读到的instance是不是null呢？（标记1）
 基于可见性，可能是null，也可能不是null。
 非常奇葩的是，在这个例子中，如果读到的是null，反而没问题了，接下来会等待锁，然后再次判断时不为null，最后返回单例。
 如果读到的不是null，那么坏了，按逻辑它就直接return instance了，这个instance还没执行构造参数，去做事情的话，很可能就崩溃了。
 *
 * 唯一的区别是加了volatile关键字，那么会有什么现象？
 这时要区分jdk版本了，在jdk1.4及之前，volatile并不能保证new操作的有序性，但是它能保证可见性，因此标记1处，读到的不是null，导致了问题。
 从1.5开始，加了volatile关键字的引用，它的初始化就不能是：
 - a. 先分配内存，让instance指向这块内存
 - b. 在内存中创建对象

 而应该是：
 - a.在内存中创建对象
 - b.让instance指向这个对象.

 这种形式，也就避免了无序性问题
 *
 */

public class LazySingle {
    private volatile static LazySingle lazySingle = null;

    private LazySingle(){};

    //没有优化
    public synchronized static LazySingle getInstance(){
        if(lazySingle==null){
            lazySingle = new LazySingle();
        }

        return lazySingle;
    }

    //优化ddcheck,加上 volatile关键字
    public static LazySingle getInstance2(){
        if(lazySingle==null){
            synchronized (LazySingle.class){
                if(lazySingle==null){
                    lazySingle = new LazySingle();
                }
            }
        }
        return lazySingle;
    }

}
