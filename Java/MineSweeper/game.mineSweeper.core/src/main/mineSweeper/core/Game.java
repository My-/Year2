package mineSweeper.core;

import java.util.function.Predicate;

public class Game {

    private MineMap userMap;
    private MineMap mineMap;
    private static int size_X, size_Y;

    private final static Predicate<Position> inLimits_X = p -> 0 <= p.X && p.X < size_X;
    private final static Predicate<Position> inLimits_Y = p -> 0 <= p.Y && p.Y < size_Y;
    public final static Predicate<Position> inLimits = inLimits_X.and(inLimits_Y); // two predicates combined

    public Game(String[] data) {
        mineMap = new MineMap(data[1]);
        userMap = new MineMap(data[2]);
        setLimits(data[1]);
        // TODO: map validation
    }


    public char get(Position position){
        return (char)this.userMap;
    }


    private void setLimits(String map) {
        String[] rows= map.split("\n");
        this.size_X = rows.length;
        this.size_Y = rows[0].split(" ").length;
    }



}