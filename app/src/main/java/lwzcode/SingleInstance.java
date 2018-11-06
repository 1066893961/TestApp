package lwzcode;

/**
 * Created by lwz on 2018/11/6.
 */

public class SingleInstance {
    /**
     * 饿汉式 单利   类加载时初始化  避免了线程同步问题
     * <p>
     * 类加载的时候初始化  没有达到懒加载的效果  如果一直未使用该实例  就会造成内存的浪费
     */
//    private final static SingleInstance INSTANCE = new SingleInstance();
//    private SingleInstance(){}
//    public static SingleInstance getInstance(){
//        return INSTANCE;
//    }


    /**
     * 懒汉式 单利模式   这种写法起到的 lazy Loading的效果  但是只能在单线程中使用。
     *
     * 如果在多线程下  一旦进入到if(singleInstance == null)的判断语句  还未来得及往下执行
     * 另一个线程也通过了这个判断语句，这时便会产生多个实力。
     */
    private SingleInstance singleInstance;

    private SingleInstance() {
    }

    public SingleInstance getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new SingleInstance();
        }
        return singleInstance;
    }


}
