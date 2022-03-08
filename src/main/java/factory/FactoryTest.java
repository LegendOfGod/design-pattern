package factory;

/**
 * @author lqb
 * @date 2022/3/8 16:48
 */
public class FactoryTest {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        assert circle != null;
        circle.draw();
        Shape rectangle = ShapeFactory.getShape("rectangle");
        assert rectangle != null;
        rectangle.draw();
    }
}

