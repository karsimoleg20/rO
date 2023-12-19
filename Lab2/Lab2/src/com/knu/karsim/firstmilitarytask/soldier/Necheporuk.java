package com.knu.karsim.firstmilitarytask.soldier;

import com.knu.karsim.firstmilitarytask.Good;
import com.knu.karsim.firstmilitarytask.Storage;


public class Necheporuk implements Runnable {
    private Storage van;
    public Necheporuk(Storage van) {
        this.van = van;
    }

    @Override
    public void run() {
        while (!van.isFinished() || !van.isEmpty()) {
            Good good = van.get();
        }
    }
}
