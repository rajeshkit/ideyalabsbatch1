import java.io.*;
import java.util.HashSet;

public class Main implements Cloneable{

    public static void main(String[] args) throws CloneNotSupportedException, IOException {
        File f=new File("E:/trainee.txt");
        try {
            FileInputStream fis=new FileInputStream(f);
            BufferedInputStream bis=new BufferedInputStream(fis);
            int k = 0;
           while((k = bis.read())!=-1) {
               System.out.print((char) k);
           }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        File file=new File("E:/demo.txt");
        FileOutputStream fos=new FileOutputStream(file);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        String msg="Ideya labs hyderbad batch 1";
        byte[] bytes=msg.getBytes();
        bos.write(bytes);
        bos.flush();
//
//        Product p1=new Product();
//        p1.setProductId(100);
//        p1.setProductName("Tv");
//        Product p2=new Product();
//        p2.setProductId(100);
//        p2.setProductName("Tv");
//        HashSet<Product> productHashSet=new HashSet<>();
//        productHashSet.add(p1);
//        productHashSet.add(p2);
//        System.out.println(productHashSet);
//        InputStream ins;
//        OutputStream os;





}
}
