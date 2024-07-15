package synchronised_collections;

import java.util.*;

public class SynchronizedCollection {

    public static void main(String[] args) throws InterruptedException {
        Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());
        Runnable listOperations = () -> {
            syncCollection.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        };

        Thread thread1 = new Thread(listOperations);
        Thread thread2 = new Thread(listOperations);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(syncCollection);
        System.out.println(syncCollection.size()); //12
        //assertThat(syncCollection.size()).isEqualTo(12);


        List<Integer> nonSyncCollection = new ArrayList<>();
        Runnable listOperations1 = () -> {
            nonSyncCollection.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        };

        Thread thread11 = new Thread(listOperations1);
        Thread thread22 = new Thread(listOperations1);
        thread11.start();
        thread22.start();
        thread11.join();
        thread22.join();

        System.out.println(nonSyncCollection);
        System.out.println(nonSyncCollection.size());
    }
}
