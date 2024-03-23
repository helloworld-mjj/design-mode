package simpleFactory;

/**
 * 简单工厂
 */
public class Main {

    public static void main(String[] args){
        Desk wood = DeskFactory.makeDesk(20, 20, 20, "wood");
        System.out.println("桌子:"+wood.getClass());
        Desk iron = DeskFactory.makeDesk(20, 20, 20, "iron");
        System.out.println("桌子:"+iron.getClass());
    }
}


