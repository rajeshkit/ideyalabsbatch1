import java.io.*;

public class Main1 implements Cloneable{

    public static void main(String[] args) throws CloneNotSupportedException, IOException {

        File f=new File("E:/trainee.txt");
        try( FileReader fis=new FileReader(f);
             BufferedReader br=new BufferedReader(fis);) {
            String k = null;
           while((k=br.readLine())!=null) {
               System.out.print(k);
           }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        File file=new File("E:/demo345.txt");
        FileWriter fos=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fos);
        String msg="Ideya labs hyderbad batch 1";
        bw.write(msg);
        bw.flush();
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
