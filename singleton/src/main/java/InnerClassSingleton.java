/**
 * 静态内部类单例
 */
public class InnerClassSingleton {

    /**
     * 私有化静态内部类
     */
    private static class InnerClassHolder{
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    /**
     * 私有化构造方法
     */
    private InnerClassSingleton(){}

    /**
     * 获取单例
     * @return 单例对象
     */
    public static InnerClassSingleton getInstance(){
        return InnerClassHolder.instance;
    }
}
