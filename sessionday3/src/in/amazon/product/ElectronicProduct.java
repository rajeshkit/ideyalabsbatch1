package in.amazon.product;

public class ElectronicProduct {
    public void getCleaningTowel(){
        ClothingProduct clothingProduct=new ClothingProduct();
        System.out.println(clothingProduct.productName);
        clothingProduct.makeCloth();
    }

}
