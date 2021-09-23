
import java.util.ArrayList;
// import java.util.Hashtable;

public class TimeTracker {
    public static void main(String args[]){

        for (int j=1; j<1000000000; j=j*10){

            ArrayList<Integer> list = new ArrayList<>(j);

            addToFront(list, j);
            // addToMiddle(list, size);
            // addToEnd(list, size);

            // for (int i=0; i<size; i++){
            //     list.add(i, i);
            // }

            // delFront();
            // delMiddle();
            // delEnd();
        

        //Hashtable<String, Integer> dict = new Hashtable<String, Integer>();
        //TimeTracker timer2 = new TimeTracker(10, dict);
        }        
    }

    private static void addToFront(ArrayList<Integer> list, int size){
        double totalTime = 0;

        for (int i=0; i<10; i++){

            double start = System.nanoTime();
    
            for (int j=1; j<size; j++){
                list.add(0, j);
            }

            double stop = System.nanoTime();

            for (int k=0; k<list.size(); k++){
                list.remove(k);
            }

            double elapsedNanoSec = stop - start;
            double elapsedTime = elapsedNanoSec / 1000000000;

            totalTime = totalTime + elapsedTime;
        }

        double avgTime = totalTime / 10;

        System.out.println("Adding to Front of List for Size " + list.size() + ":");
        System.out.println("     Average Elapsed Time = " + avgTime + " seconds");
    }

    // private static void addToMiddle(ArrayList<Integer> list, int size){
    //     double totalTime = 0;

    //     for (int i=0; i<10; i++){

    //         int mid = size/2;
    //         double start = System.nanoTime();
            
    //         for (int j=0; j<size; j++){
    //             list.add(mid, j);
    //         }

    //         double stop = System.nanoTime();

    //         double elapsedNanoSec = stop - start;
    //         double elapsedTime = elapsedNanoSec / 1000000000;

    //         totalTime = totalTime + elapsedTime;
    //     }
    //     double avgTime = totalTime / 0;

    //     System.out.println("Adding to Middle of List for Size " + list.size() + ":");
    //     System.out.println("     Average Elapsed Time = " + avgTime + " seconds");
    // }

    // private static void addToEnd(ArrayList<Integer> list, int size){

    //     double totalTime = 0;
    //     for (int i=0; i<10; i++){
    //         double start = System.nanoTime();
    //         list.add(size-1, 1);
    //     }
    //     double avgTime = totalTime / 0;

    //     System.out.println("Adding to End of List for Size " + list.size() + ":");
    //     System.out.println("     Average Elapsed Time = " + avgTime + " seconds");
    // }
}


