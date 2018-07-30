package com.sample.colleaction.map.concurrectMap;

/**
 * Created by volga on 7/28/2018.
 */
import java.util.Map;

public class MapHelper2 implements Runnable {
    Map<String, Integer> map;

    public MapHelper2(Map<String, Integer> map) {
        this.map = map;
        new Thread(this, "MapHelper2").start();
    }

    public void run() {
        map.put("two", 2);
        try {
            System.out.println("MapHelper2 sleeping");
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}