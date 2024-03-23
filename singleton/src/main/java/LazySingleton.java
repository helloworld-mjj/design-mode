/**
 * 懒汉式单例
 */
public class LazySingleton {

    /**
     * 禁止指令重排序
     */
    private volatile static LazySingleton instance;

    /**
     * 私有化构造方法，防止new关键词构造
     */
    private LazySingleton(){}

    /**
     * 构造单例对象
     * @return 单例对象
     */
    public static LazySingleton getInstance(){
        if(instance == null){
            //加锁防止重复构造
            synchronized (LazySingleton.class){
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
