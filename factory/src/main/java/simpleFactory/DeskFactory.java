package simpleFactory;

/**
 * 工厂
 */
public class DeskFactory {
    public static Desk makeDesk(float width, float length, float height, String type){
        if(type.equals("wood")){
            return new WoodenDesk(width, length, height);
        }else if(type.equals("iron")){
            return new IronDesk(width, length, height);
        }
        return null;
    }
}
