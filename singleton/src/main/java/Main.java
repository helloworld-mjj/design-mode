public class Main {

    public static void main(String[] args){
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println("懒汉式单例:" + lazySingleton2.equals(lazySingleton1));
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        System.out.println("饿汉式单例:" + hungrySingleton2.equals(hungrySingleton1));
        InnerClassSingleton innerClassSingleton1 = InnerClassSingleton.getInstance();
        InnerClassSingleton innerClassSingleton2 = InnerClassSingleton.getInstance();
        System.out.println("内部类单例:" + innerClassSingleton2.equals(innerClassSingleton1));
    }
}
