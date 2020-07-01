package util;

import org.junit.Assert;

import java.util.Queue;
import java.util.concurrent.*;
import java.util.function.Supplier;

public class MultiThreadTest {
    public static int N = 100;

    public static void test(Supplier<?> instanceSupplier) {
        ExecutorService threadPool = Executors.newFixedThreadPool(N);
        Queue<Integer> queue = new LinkedBlockingQueue<>(N);

        for (int i = 0; i < N; i++) {
            threadPool.submit(() -> {
                int hash = instanceSupplier.get().hashCode();
                queue.offer(hash);
            });
        }

        threadPool.shutdown();

        try {
            threadPool.awaitTermination(N, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long distinctHash = queue.stream().distinct().count();

        Assert.assertEquals(1, distinctHash);
    }
}
