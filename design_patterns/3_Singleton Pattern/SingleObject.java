public class SingleObject{
    private static SingleObject instance = new SingleObject();

    private SingleObject(){}  //构造函数private 这个类就不会被实现

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}