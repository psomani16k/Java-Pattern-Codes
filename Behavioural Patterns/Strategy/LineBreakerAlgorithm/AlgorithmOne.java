package StrategyPattern;

public class AlgorithmOne implements LineBreaker {

    @Override
    public String lineBreaker() {
        System.out.println("Using Algorithm 1! Maa ki chuuuutttttt");
        return "Algorithm 1";
    }

}
