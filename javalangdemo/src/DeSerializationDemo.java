import java.io.*;

public class DeSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Product p1=new Product();
        String s=new String("hello");
        p1.setProductId(565);
        p1.setProductName("abc");

        p1.setProductId(986);
        p1.setProductName("bre");
        File f=new File("E:/product.txt");
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream os=new ObjectInputStream(fis);//Deserialization
        Product product=(Product) os.readObject();
        System.out.println(product);
        os.close();
        fis.close();

    }
}
