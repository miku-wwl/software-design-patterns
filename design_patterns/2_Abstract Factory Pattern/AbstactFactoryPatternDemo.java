public class AbstactFactoryPatternDemo {
    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        Shape shape3 = shapeFactory.getShape("SQUARE");

        shape1.draw();
        shape2.draw();
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");
        Color color2 = colorFactory.getColor("GREEN");
        Color color3 = colorFactory.getColor("BLUE");

        color1.fill();
        color2.fill();
        color3.fill();

        //如果不使用抽象工厂模式直接生成color
        Color color4 = new Blue();
        color4.fill();
    }
}
