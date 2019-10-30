package com.xlx.dp;

/**
 * volatile
 * 1.保证内存的可见性
 *   java内存模型中,有main memory(主内存),每个线程也有自己的memory,
 *   为了性能,一个线程会在自己的memory中保持要访问的副本,
 *   这样就会出现同一个变量在某个瞬间,在一个线程memory中的值可能与另一个memory中的值或者main memory不同(一般线程数据是共享的)
 *
 *   加入volatile,表示修饰的变量能够随时获取最新值,对其他线程随时可以看见
 * 2.防止指令重新排序(没有原子性)
 *   一般jvm执行代码时,会为了提高执行效率,在不影响最后结果的前提下对指令重新排序,
 *   所以jvm真正执行顺序并不是我们写代码看到的样子
 *
 * @author xielx at 2019/10/30 9:36
 */
public class VolatileDemo implements Runnable {
    
    volatile private int count = 0;
    
    
    /**
     * count++;
     * 分为3个步骤
     * 1.从主内存取值
     * 2.执行+1
     * 3.值重新写回主内存
     *
     */
    private  void add(){
        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println("count=" + count);
            try{
                Thread.sleep(5L);
            }catch (Exception e){
            
            }
        }
        
    }
    
    @Override
    public void run() {
        add();
    }
    
    public static void main(String[] args) {
        VolatileDemo demo = new VolatileDemo();
        Thread t1 = new Thread(demo);
        Thread t2 = new Thread(demo);
        Thread t3 = new Thread(demo);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
