package com.sample.colleaction.map.concurrectMap;

import java.util.Map;

/**
 * Created by volga on 7/28/2018.
 */
public class MapHelper4 implements Runnable {
    Map<String, Integer> map;

    public MapHelper4(Map<String, Integer> map) {
        this.map = map;
        new Thread(this, "MapHelper4").start();
    }

    public void run() {
        map.put("four", 4);
        try {
            System.out.println("MapHelper4 sleeping");
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}