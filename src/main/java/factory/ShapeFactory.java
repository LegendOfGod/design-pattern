package factory;

/**
 * @author lqb
 * @date 2022/3/8 16:41
 */
public class ShapeFactory {
    public static Shape getShape(String shapeName){
        if ("circle".equals(shapeName)){
            return new CircleShape();
        }
        if ("rectangle".equals(shapeName)){
            return new Rectangle();
        }
        return null;
    }
}
