package com.maomaochong.dessign_pattern.jdk.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class T05_ReentrantLock5 implements Runnable {
    private static ReentrantLock lock = new ReentrantLock(false); //参数为true表示为 公平锁，请对比输出结果

    public static void main(String[] args) {
        T05_ReentrantLock5 rl = new T05_ReentrantLock5();
        Thread th1 = new Thread(rl);
        Thread th2 = new Thread(rl);
        th1.start();
        th2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + "获得锁");
            } finally {
                lock.unlock();
            }
        }
    }
}

