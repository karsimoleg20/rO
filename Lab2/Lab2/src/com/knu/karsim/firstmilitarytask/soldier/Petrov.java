package com.knu.karsim.firstmilitarytask.soldier;

import com.knu.karsim.firstmilitarytask.Good;
import com.knu.karsim.firstmilitarytask.Storage;

public class Petrov implements Runnable {
    private Storage outdoor;
    private Storage van;

    public Petrov(Storage outdoor, Storage van) {
        this.outdoor = outdoor;
        this.van = van;
    }

    @Override
    public void run() {
        while (!outdoor.isFinished() || !outdoor.isEmpty()) {
            Good good = outdoor.get();
            van.put(good);
        }
        van.setFinish();
    }
}
