public class ProxyPatternDemo {
    public static void main(String[] args){
        Image image = new ProxyImage("test_10mb.jpg");

        //load the picture
        image.display();
        System.out.println("");
        //not load the picture
        image.display();
    }
}
