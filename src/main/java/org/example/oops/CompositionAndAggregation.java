package org.example.oops;

public class CompositionAndAggregation {

    //composition and aggregation denotes "has-a" relationship

    public static void main(String[] args) {
        // aggregation

        EngineForAggregation e1 = new EngineForAggregation("Electric");
        CarForAggregation c1 = new CarForAggregation(e1);
        c1.showEngineType();

        EngineForAggregation e2 = new EngineForAggregation("Diseal");
        CarForAggregation c2 = new CarForAggregation(e2);
        c2.showEngineType();

        //Composition
        CarForComposition c = new CarForComposition("Hybrid");
        c.showEngineType();
    }
}

//aggregation

class EngineForAggregation {
    String type;

    public EngineForAggregation(String type) {
        this.type = type;
    }
}

class CarForAggregation {
    EngineForAggregation engine;

    public CarForAggregation(EngineForAggregation engine) {
        this.engine = engine;
    }

    void showEngineType() {
        System.out.println("Engine " + engine.type);
    }
}

//composition

class EngineForComposition {
    String type;

    public EngineForComposition(String type) {
        this.type = type;
    }
}

class CarForComposition {
    EngineForComposition engine;

    public CarForComposition(String engineType) {
        this.engine = new EngineForComposition(engineType); // tight coupled
    }

    void showEngineType() {
        System.out.println("Engine " + engine.type);
    }
}