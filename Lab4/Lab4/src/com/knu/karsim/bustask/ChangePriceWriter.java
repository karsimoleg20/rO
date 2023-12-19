package com.knu.karsim.bustask;

public class ChangePriceWriter implements Runnable {
    private Graph graph;

    public ChangePriceWriter(Graph graph) {
        this.graph = graph;
    }

    @Override
    public void run() {
        graph.changePrice("Kyiv", "Berlin", 8);
        graph.changePrice("Berlin", "NY", 16);
    }
}
