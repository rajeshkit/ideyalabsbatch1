public class LaptopStore {
    public float getQuote(int processor,int ram, int hd){
        return processor*10000+ram*5666.54f+hd*34445;
    }
    public float getQuote(Laptop l){
        return l.processor*10000+l.ramSize*5666.54f+l.hdSize*34445;
    }
}
