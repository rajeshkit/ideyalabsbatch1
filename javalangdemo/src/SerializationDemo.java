import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Product p1=new Product();
        p1.setProductId(565);
        p1.setProductName("abc");


        File f=new File("E:/product.txt");
        FileOutputStream fis=new FileOutputStream(f);
        ObjectOutputStream os=new ObjectOutputStream(fis);
        os.writeObject(p1);

    }
}
