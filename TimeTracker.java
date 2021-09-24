
import java.util.ArrayList;
import java.util.Hashtable;

public class TimeTracker {
    public static void main(String args[]){

        for (int j=1; j<1000000000; j=j*10){

            ArrayList<Integer> list = new ArrayList<>(j);

            addFront(list, j);
            addMiddle(list, j);
            addEnd(list, j);

            for (int i=0; i<=j-1; i++){
                list.add(i, i);
            }
            dltFront(list, j);

            for (int i=0; i<=j-1; i++){
                list.add(i, i);
            }
            dltMiddle(list, j);

            for (int i=0; i<=j-1; i++){
                list.add(i, i);
            }
            dltEnd(list, j);
        
            Hashtable<Integer, Integer> dict = new Hashtable<Integer, Integer>();
            
            addDict(dict, j);
            dltDict(dict, j);

        }        
    }

    private static void addDict(Hashtable<Integer, Integer> dict, int size){
        double totalTime = 0;

        for (int i=1; i<=10; i++){

            double start = System.nanoTime();

            for (int j=1; j<=size; j++){
                dict.put(j, j);
            }

            double stop = System.nanoTime();

            dict.clear();

            double elapsedNanoSec = stop - start;
            double elapsedTime = elapsedNanoSec / 1000000000;
            double avgElapsed = elapsedTime / size;
            totalTime = totalTime + avgElapsed;

        }

        double avgTime = totalTime / 10;

        System.out.println("Adding to Dictionary for Size " + size + ":");
        System.out.println("     Average Elapsed Time = " + avgTime + " seconds");
    }

    private static void dltDict(Hashtable<Integer, Integer> dict, int size){
        double totalTime = 0;

        for (int i=1; i<=10; i++){

            for (int j=1; j<=size; j++){
                dict.put(j, j);
            }

            double start = System.nanoTime();

            for (int k=size; k>=1; k--){
                dict.remove(k);
            }

            double stop = System.nanoTime();

            double elapsedNanoSec = stop - start;
            double elapsedTime = elapsedNanoSec / 1000000000;
            double avgElapsed = elapsedTime / size;
            totalTime = totalTime + avgElapsed;

        }

        double avgTime = totalTime / 10;

        System.out.println("Deleting from Dictionary for Size " + size + ":");
        System.out.println("     Average Elapsed Time = " + avgTime + " seconds");
    }

    private static void addFront(ArrayList<Integer> list, int size){
        double totalTime = 0;

        for (int i=1; i<=10; i++){

            double start = System.nanoTime();
    
            for (int j=1; j<=size; j++){
                list.add(0, j);
            }

            double stop = System.nanoTime();

            for (int k=0; k<=list.size()-1; k++){
                list.remove(k);
            }
            
            double elapsedNanoSec = stop - start;
            double elapsedTime = elapsedNanoSec / 1000000000;
            double avgElapsed = elapsedTime / size;
            totalTime = totalTime + avgElapsed;
        }

        double avgTime = totalTime / 10;

        System.out.println("Adding to Front of List for Size " + size + ":");
        System.out.println("     Average Elapsed Time = " + avgTime + " seconds");
    }

    private static void addMiddle(ArrayList<Integer> list, int size){
        double totalTime = 0;

        for (int i=1; i<=10; i++){

            int mid = size/2;
            double start = System.nanoTime();
            
            for (int j=1; j<=size; j++){
                list.add(mid, j);
            }

            double stop = System.nanoTime();

            for (int k=0; k<=list.size()-1; k++){
                list.remove(k);
            }

            double elapsedNanoSec = stop - start;
            double elapsedTime = elapsedNanoSec / 1000000000;
            double avgElapsed = elapsedTime / size;
            totalTime = totalTime + avgElapsed;
        }
        double avgTime = totalTime / 10;

        System.out.println("Adding to Middle of List for Size " + size + ":");
        System.out.println("     Average Elapsed Time = " + avgTime + " seconds");
    }

    private static void addEnd(ArrayList<Integer> list, int size){
        double totalTime = 0;

        for (int i=1; i<=10; i++){

            double start = System.nanoTime();
            
            for (int j=1; j<=size; j++){
                list.add(size-1, j);
            }

            double stop = System.nanoTime();

            for (int k=0; k<=list.size()-1; k++){
                list.remove(k);
            }

            double elapsedNanoSec = stop - start;
            double elapsedTime = elapsedNanoSec / 1000000000;
            double avgElapsed = elapsedTime / size;
            totalTime = totalTime + avgElapsed;
        }

        double avgTime = totalTime / 10;

        System.out.println("Adding to End of List for Size " + size + ":");
        System.out.println("     Average Elapsed Time = " + avgTime + " seconds");
    }

    private static void dltFront(ArrayList<Integer> list, int size){
        double totalTime = 0;

        for (int j=1; j<=10; j++){
            
            double start = System.nanoTime();
            
            for (int i=0; i<=size-1; i++){
                list.remove(0);
            }
    
            double stop = System.nanoTime();

            for (int k=0; k<=size-1; k++){
                list.add(k, k);
            }

            double elapsedNanoSec = stop - start;
            double elapsedTime = elapsedNanoSec / 1000000000;
            double avgElapsed = elapsedTime / size;
            totalTime = totalTime + avgElapsed;
        }

        double avgTime = totalTime / 10;

        System.out.println("Deleting from Front of List for Size " + size + ":");
        System.out.println("     Average Elapsed Time = " + avgTime + " seconds");
    }

    private static void dltMiddle(ArrayList<Integer> list, int size){
        double totalTime = 0;

        for (int j=1; j<=10; j++){
            
            double start = System.nanoTime();
            
            for (int i=0; i<=size-1; i++){
                list.remove(list.size()/2);
            }
    
            double stop = System.nanoTime();

            for (int k=0; k<=size-1; k++){
                list.add(k, k);
            }

            double elapsedNanoSec = stop - start;
            double elapsedTime = elapsedNanoSec / 1000000000;
            double avgElapsed = elapsedTime / size;
            totalTime = totalTime + avgElapsed;
        }

        double avgTime = totalTime / 10;

        System.out.println("Deleting from Middle of List for Size " + size + ":");
        System.out.println("     Average Elapsed Time = " + avgTime + " seconds");
    }

    private static void dltEnd(ArrayList<Integer> list, int size){
        double totalTime = 0;

        for (int j=1; j<=10; j++){
            
            double start = System.nanoTime();
            
            for (int i=0; i<=size-1; i++){
                list.remove(list.size()-1);
            }
    
            double stop = System.nanoTime();

            for (int k=0; k<=size-1; k++){
                list.add(k, k);
            }

            double elapsedNanoSec = stop - start;
            double elapsedTime = elapsedNanoSec / 1000000000;
            double avgElapsed = elapsedTime / size;
            totalTime = totalTime + avgElapsed;
        }

        double avgTime = totalTime / 10;

        System.out.println("Deleting from End of List for Size " + size + ":");
        System.out.println("     Average Elapsed Time = " + avgTime + " seconds");
    }
}


