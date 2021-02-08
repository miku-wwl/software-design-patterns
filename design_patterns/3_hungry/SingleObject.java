public class SingleObject{
    private static SingleObject instance = new SingleObject();
    private SingleObject(){}  //���캯��private �����Ͳ��ᱻʵ��

    public static synchronized SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}