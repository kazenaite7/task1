import java.util.Random;

public class Histogram {

    int [] bucket = new int[16];
    Random rand = new Random();

    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        histogram.calculate();
        histogram.print();
    }

    int getBucket (int n){
        int i = n%16;
        if(i<0){
            return i * (-1);
        }
        else {
            return i;
        }
        // return n&0x0F;
    }

    private void print(){
       for (int i = 0; i<bucket.length; i++){
           System.out.println(bucket[i]);
       }
    }

    private  void  calculate(){
        for (int i =0; i<100000; i++){
            bucket[ getBucket(rand.nextInt()) ]++;
        }
    }
}
