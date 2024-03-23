/**
 * 饿汉式单例
 */
public class HungrySingleton {

    /**
     * 在类加载时就new出来
     */
    private static final HungrySingleton instance = new HungrySingleton();

    /**
     * 私有化构造方法
     */
    private HungrySingleton(){}

    /**
     * 获取单例
     * @return 单例对象
     */
    public static HungrySingleton getInstance(){
        return instance;
    }
}
