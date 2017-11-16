package mineSweeper;

public class Data {
    public static final String[][] MAP = new String[][]{
            /* Data structure for one test:
            *      0 -> name or comment of the test
            *      1 -> original map
            *      2 -> map sent to the user
            *      3 -> expected solution
            */

            // Sample Maps:
            // [0]
            {"Simple map 1",
                    "1 x 1 1 x 1\n2 2 2 1 2 2\n2 x 2 0 1 x\n2 x 2 1 2 2\n1 1 1 1 x 1\n0 0 0 1 1 1",
                    "? ? ? ? ? ?\n? ? ? ? ? ?\n? ? ? 0 ? ?\n? ? ? ? ? ?\n? ? ? ? ? ?\n0 0 0 ? ? ?",
                    "1 x 1 1 x 1\n2 2 2 1 2 2\n2 x 2 0 1 x\n2 x 2 1 2 2\n1 1 1 1 x 1\n0 0 0 1 1 1"},
            // [1]
            {"Simple map 2",
                    "0 2 x\n0 2 x",
                    "0 ? ?\n0 ? ?",
                    "0 2 x\n0 2 x"},
            // [2]
            {"Simple unsolvable map",
                    "0 1 x\n0 1 1",
                    "0 ? ?\n0 ? ?",
                    "?"},
            // [3]
            {"Simple map 3",
                    "1 x x 1 0 0 0\n2 3 3 1 0 1 1\n1 x 1 0 0 1 x\n1 1 1 0 0 1 1\n0 1 1 1 0 0 0\n0 1 x 1 0 0 0\n0 1 1 1 0 1 1\n0 0 0 0 0 1 x\n0 0 0 0 0 1 1",
                    "? ? ? ? 0 0 0\n? ? ? ? 0 ? ?\n? ? ? 0 0 ? ?\n? ? ? 0 0 ? ?\n0 ? ? ? 0 0 0\n0 ? ? ? 0 0 0\n0 ? ? ? 0 ? ?\n0 0 0 0 0 ? ?\n0 0 0 0 0 ? ?",
                    "1 x x 1 0 0 0\n2 3 3 1 0 1 1\n1 x 1 0 0 1 x\n1 1 1 0 0 1 1\n0 1 1 1 0 0 0\n0 1 x 1 0 0 0\n0 1 1 1 0 1 1\n0 0 0 0 0 1 x\n0 0 0 0 0 1 1"},
            // [4]
            {"Various unsolvable map - 1",
                    "1 1 0 1 1 1 0 0 1 1 1 0 0 0 0 1 1 1 0\nx 1 0 1 x 1 0 0 2 x 2 0 0 0 0 1 x 2 1\n1 1 0 2 3 3 1 1 3 x 2 0 0 0 0 1 2 x 1\n0 1 1 2 x x 1 2 x 3 1 0 0 0 0 0 1 1 1\n0 1 x 2 2 2 1 3 x 3 0 0 0 0 0 0 0 0 0\n0 1 1 1 0 0 0 2 x 2 0 0 0 0 0 0 0 0 0\n0 0 0 0 0 0 0 1 1 1 1 2 2 1 0 0 0 0 0\n0 0 0 0 0 0 0 0 0 0 1 x x 1 0 0 0 0 0\n0 0 1 1 1 0 1 1 1 0 1 2 2 1 0 0 0 0 0\n0 0 1 x 2 1 3 x 2 0 0 0 0 0 0 1 1 1 0\n0 0 1 1 2 x 3 x 3 1 1 0 0 0 0 1 x 1 0\n0 0 0 0 1 2 3 2 2 x 1 0 0 0 0 1 1 1 0\n0 0 0 0 0 1 x 1 1 1 1 0 0 0 0 0 1 1 1\n0 0 1 1 2 2 2 1 0 0 0 0 0 0 0 0 1 x 1\n0 0 1 x 2 x 2 1 1 0 0 0 0 0 0 0 1 1 1\n0 0 1 1 2 1 3 x 3 1 0 0 0 0 0 0 0 1 1\n0 0 0 0 0 0 2 x x 1 0 0 0 1 1 1 0 1 x\n0 0 0 1 1 1 1 2 2 1 0 0 0 1 x 1 1 2 2\n0 0 0 1 x 3 2 1 0 0 0 1 1 2 1 1 1 x 2\n0 0 0 1 2 x x 1 0 0 0 1 x 1 0 1 2 3 x\n0 0 0 0 1 2 2 1 1 1 1 1 1 1 0 1 x 3 2\n0 0 0 0 1 1 1 1 2 x 1 1 1 1 0 2 3 x 2\n0 0 0 0 1 x 1 1 x 2 1 1 x 1 0 1 x 3 x",
                    "? ? 0 ? ? ? 0 0 ? ? ? 0 0 0 0 ? ? ? 0\n? ? 0 ? ? ? 0 0 ? ? ? 0 0 0 0 ? ? ? ?\n? ? 0 ? ? ? ? ? ? ? ? 0 0 0 0 ? ? ? ?\n0 ? ? ? ? ? ? ? ? ? ? 0 0 0 0 0 ? ? ?\n0 ? ? ? ? ? ? ? ? ? 0 0 0 0 0 0 0 0 0\n0 ? ? ? 0 0 0 ? ? ? 0 0 0 0 0 0 0 0 0\n0 0 0 0 0 0 0 ? ? ? ? ? ? ? 0 0 0 0 0\n0 0 0 0 0 0 0 0 0 0 ? ? ? ? 0 0 0 0 0\n0 0 ? ? ? 0 ? ? ? 0 ? ? ? ? 0 0 0 0 0\n0 0 ? ? ? ? ? ? ? 0 0 0 0 0 0 ? ? ? 0\n0 0 ? ? ? ? ? ? ? ? ? 0 0 0 0 ? ? ? 0\n0 0 0 0 ? ? ? ? ? ? ? 0 0 0 0 ? ? ? 0\n0 0 0 0 0 ? ? ? ? ? ? 0 0 0 0 0 ? ? ?\n0 0 ? ? ? ? ? ? 0 0 0 0 0 0 0 0 ? ? ?\n0 0 ? ? ? ? ? ? ? 0 0 0 0 0 0 0 ? ? ?\n0 0 ? ? ? ? ? ? ? ? 0 0 0 0 0 0 0 ? ?\n0 0 0 0 0 0 ? ? ? ? 0 0 0 ? ? ? 0 ? ?\n0 0 0 ? ? ? ? ? ? ? 0 0 0 ? ? ? ? ? ?\n0 0 0 ? ? ? ? ? 0 0 0 ? ? ? ? ? ? ? ?\n0 0 0 ? ? ? ? ? 0 0 0 ? ? ? 0 ? ? ? ?\n0 0 0 0 ? ? ? ? ? ? ? ? ? ? 0 ? ? ? ?\n0 0 0 0 ? ? ? ? ? ? ? ? ? ? 0 ? ? ? ?\n0 0 0 0 ? ? ? ? ? ? ? ? ? ? 0 ? ? ? ?",
                    "?"},
            // [5]
            {"Various unsolvable map - 2",
                    "0 0 0 0 0 0 0 0 1 x x 2 1 0 1 x 1 0 1 2 x\n0 0 0 0 0 0 0 0 1 2 3 x 1 0 2 2 2 1 2 x 2\n0 0 0 0 0 0 0 0 0 0 2 2 2 0 1 x 1 1 x 2 1\n0 0 0 0 0 1 1 1 0 0 1 x 1 0 1 2 2 2 1 1 0\n1 1 0 0 0 1 x 1 0 1 2 2 1 0 0 1 x 1 1 1 1\nx 1 0 0 0 1 1 1 0 1 x 1 0 0 0 1 1 1 1 x 1\n2 2 1 0 0 0 0 0 0 1 1 1 0 0 0 0 0 0 1 1 1\n1 x 1 0 0 0 0 0 0 0 1 2 2 1 0 0 1 1 1 0 0\n1 1 1 0 0 0 0 0 0 0 1 x x 1 0 0 1 x 1 0 0",
                    "0 0 0 0 0 0 0 0 ? ? ? ? ? 0 ? ? ? 0 ? ? ?\n0 0 0 0 0 0 0 0 ? ? ? ? ? 0 ? ? ? ? ? ? ?\n0 0 0 0 0 0 0 0 0 0 ? ? ? 0 ? ? ? ? ? ? ?\n0 0 0 0 0 ? ? ? 0 0 ? ? ? 0 ? ? ? ? ? ? 0\n? ? 0 0 0 ? ? ? 0 ? ? ? ? 0 0 ? ? ? ? ? ?\n? ? 0 0 0 ? ? ? 0 ? ? ? 0 0 0 ? ? ? ? ? ?\n? ? ? 0 0 0 0 0 0 ? ? ? 0 0 0 0 0 0 ? ? ?\n? ? ? 0 0 0 0 0 0 0 ? ? ? ? 0 0 ? ? ? 0 0\n? ? ? 0 0 0 0 0 0 0 ? ? ? ? 0 0 ? ? ? 0 0",
                    "?"},
            // [6] - attempt
            {"Various unsolvable map - smartCounting",
                    "0 0 0 0 0 0 0 0 1 x x 2 1 0 1 x 1 0 1 2 x\n0 0 0 0 0 0 0 0 1 2 3 x 1 0 2 2 2 1 2 x 2\n0 0 0 0 0 0 0 0 0 0 2 2 2 0 1 x 1 1 x 2 1\n0 0 0 0 0 1 1 1 0 0 1 x 1 0 1 2 2 2 1 1 0\n1 1 0 0 0 1 x 1 0 1 2 2 1 0 0 1 x 1 1 1 1\nx 1 0 0 0 1 1 1 0 1 x 1 0 0 0 1 1 1 1 x 1\n2 2 1 0 0 0 0 0 0 1 1 1 0 0 0 0 0 0 1 1 1\n1 x 1 0 0 0 0 0 0 0 1 2 2 1 0 0 1 1 1 0 0\n1 1 1 0 0 0 0 0 0 0 1 x x 1 0 0 1 x 1 0 0",
                    "0 1 ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?\n" +
                            "0 2 ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?\n" +
                            "0 2 ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?\n" +
                            "0 2 ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?\n" +
                            "0 1 ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?",
                    "?"},
            // [7] - attempt
            {"Solvable map",
                    "1 x 1 1 1 1 1 x x 1 0 0 0 0 0 0 0 0 0 1 1 1 0 0 0 0 0 0 0 0 1 x 1\n" +
                            "1 2 2 2 x 1 1 2 2 1 0 0 0 1 1 1 0 0 0 1 x 1 0 0 0 0 0 0 0 0 1 1 1\n" +
                            "1 2 x 2 1 1 0 0 0 0 0 1 1 2 x 1 0 0 0 2 2 2 0 0 0 0 1 1 1 0 0 0 0\n" +
                            "1 x 2 1 1 1 1 0 0 1 1 2 x 2 1 1 0 0 0 1 x 1 0 0 0 0 2 x 2 0 0 0 0\n" +
                            "2 2 2 0 1 x 1 0 0 2 x 3 1 1 0 0 0 0 0 1 2 2 1 0 0 1 3 x 2 0 0 0 0\n" +
                            "1 x 1 0 1 1 1 0 0 2 x 3 2 1 1 0 0 0 0 0 1 x 1 0 0 1 x 2 2 2 2 1 0\n" +
                            "1 1 1 0 0 0 0 0 0 1 2 x 2 x 1 0 0 0 0 0 1 1 1 0 0 1 1 1 1 x x 1 0",

                    "? ? ? ? ? ? ? ? ? ? 0 0 0 0 0 0 0 0 0 ? ? ? 0 0 0 0 0 0 0 0 ? ? ?\n" +
                            "? ? ? ? ? ? ? ? ? ? 0 0 0 ? ? ? 0 0 0 ? ? ? 0 0 0 0 0 0 0 0 ? ? ?\n" +
                            "? ? ? ? ? ? 0 0 0 0 0 ? ? ? ? ? 0 0 0 ? ? ? 0 0 0 0 ? ? ? 0 0 0 0\n" +
                            "? ? ? ? ? ? ? 0 0 ? ? ? ? ? ? ? 0 0 0 ? ? ? 0 0 0 0 ? ? ? 0 0 0 0\n" +
                            "? ? ? 0 ? ? ? 0 0 ? ? ? ? ? 0 0 0 0 0 ? ? ? ? 0 0 ? ? ? ? 0 0 0 0\n" +
                            "? ? ? 0 ? ? ? 0 0 ? ? ? ? ? ? 0 0 0 0 0 ? ? ? 0 0 ? ? ? ? ? ? ? 0\n" +
                            "? ? ? 0 0 0 0 0 0 ? ? ? ? ? ? 0 0 0 0 0 ? ? ? 0 0 ? ? ? ? ? ? ? 0",

                    "1 x 1 1 1 1 1 x x 1 0 0 0 0 0 0 0 0 0 1 1 1 0 0 0 0 0 0 0 0 1 x 1\n" +
                            "1 2 2 2 x 1 1 2 2 1 0 0 0 1 1 1 0 0 0 1 x 1 0 0 0 0 0 0 0 0 1 1 1\n" +
                            "1 2 x 2 1 1 0 0 0 0 0 1 1 2 x 1 0 0 0 2 2 2 0 0 0 0 1 1 1 0 0 0 0\n" +
                            "1 x 2 1 1 1 1 0 0 1 1 2 x 2 1 1 0 0 0 1 x 1 0 0 0 0 2 x 2 0 0 0 0\n" +
                            "2 2 2 0 1 x 1 0 0 2 x 3 1 1 0 0 0 0 0 1 2 2 1 0 0 1 3 x 2 0 0 0 0\n" +
                            "1 x 1 0 1 1 1 0 0 2 x 3 2 1 1 0 0 0 0 0 1 x 1 0 0 1 x 2 2 2 2 1 0\n" +
                            "1 1 1 0 0 0 0 0 0 1 2 x 2 x 1 0 0 0 0 0 1 1 1 0 0 1 1 1 1 x x 1 0"},

            // [8]
            {"Solvable map",
                    "0 0 0 0 0 0 0 0 0 0 0 0 1 x 1 0 0 0 0 0 0 0 0 1 1 1 1 1 1 0\n" +
                            "0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 0 1 1 1 0 0 0 0 2 x 2 1 x 1 0\n" +
                            "1 1 1 0 0 0 0 1 1 1 0 0 0 0 1 1 2 x 1 0 0 0 0 2 x 2 1 1 1 0\n" +
                            "1 x 1 1 1 1 0 1 x 2 1 1 0 0 1 x 2 1 1 0 0 0 0 1 1 1 0 0 0 0\n" +
                            "1 2 2 3 x 2 0 1 1 2 x 1 0 0 1 2 2 1 0 0 0 0 0 1 1 1 0 0 1 1\n" +
                            "0 1 x 3 x 2 0 0 0 1 1 1 0 1 2 3 x 1 0 0 0 0 0 1 x 1 0 0 1 x\n" +
                            "0 1 1 3 3 3 2 1 1 1 1 2 1 2 x x 2 2 1 1 0 0 0 1 1 1 1 1 2 1\n" +
                            "0 0 0 1 x x 2 x 1 1 x 2 x 2 3 3 3 2 x 1 0 1 1 1 0 0 2 x 2 0\n" +
                            "0 1 1 2 2 2 3 2 2 1 1 2 1 1 1 x 2 x 2 1 0 1 x 1 0 0 2 x 2 0\n" +
                            "1 2 x 1 0 1 2 x 1 0 0 0 1 1 2 2 3 2 1 0 0 1 1 1 0 0 1 1 1 0\n" +
                            "1 x 2 1 0 1 x 3 2 1 0 0 1 x 1 1 x 2 1 0 0 0 1 1 1 0 0 0 0 0\n" +
                            "1 1 2 1 2 2 2 2 x 1 0 0 1 1 1 1 2 x 1 0 0 0 1 x 2 1 0 0 0 0\n" +
                            "1 1 2 x 2 x 1 1 1 1 0 0 0 0 1 1 2 1 1 0 0 0 1 2 x 1 0 0 0 0\n" +
                            "1 x 3 2 2 1 1 0 0 1 1 1 0 0 1 x 1 0 0 0 0 0 1 2 2 1 0 0 0 0\n" +
                            "1 2 x 1 0 0 0 0 0 1 x 1 0 0 1 1 1 0 0 0 0 0 1 x 1 0 0 0 0 0",

                    "0 0 0 0 0 0 0 0 0 0 0 0 ? ? ? 0 0 0 0 0 0 0 0 ? ? ? ? ? ? 0\n" +
                            "0 0 0 0 0 0 0 0 0 0 0 0 ? ? ? 0 ? ? ? 0 0 0 0 ? ? ? ? ? ? 0\n" +
                            "? ? ? 0 0 0 0 ? ? ? 0 0 0 0 ? ? ? ? ? 0 0 0 0 ? ? ? ? ? ? 0\n" +
                            "? ? ? ? ? ? 0 ? ? ? ? ? 0 0 ? ? ? ? ? 0 0 0 0 ? ? ? 0 0 0 0\n" +
                            "? ? ? ? ? ? 0 ? ? ? ? ? 0 0 ? ? ? ? 0 0 0 0 0 ? ? ? 0 0 ? ?\n" +
                            "0 ? ? ? ? ? 0 0 0 ? ? ? 0 ? ? ? ? ? 0 0 0 0 0 ? ? ? 0 0 ? ?\n" +
                            "0 ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? 0 0 0 ? ? ? ? ? ? ?\n" +
                            "0 0 0 ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? 0 ? ? ? 0 0 ? ? ? 0\n" +
                            "0 ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? 0 ? ? ? 0 0 ? ? ? 0\n" +
                            "? ? ? ? 0 ? ? ? ? 0 0 0 ? ? ? ? ? ? ? 0 0 ? ? ? 0 0 ? ? ? 0\n" +
                            "? ? ? ? 0 ? ? ? ? ? 0 0 ? ? ? ? ? ? ? 0 0 0 ? ? ? 0 0 0 0 0\n" +
                            "? ? ? ? ? ? ? ? ? ? 0 0 ? ? ? ? ? ? ? 0 0 0 ? ? ? ? 0 0 0 0\n" +
                            "? ? ? ? ? ? ? ? ? ? 0 0 0 0 ? ? ? ? ? 0 0 0 ? ? ? ? 0 0 0 0\n" +
                            "? ? ? ? ? ? ? 0 0 ? ? ? 0 0 ? ? ? 0 0 0 0 0 ? ? ? ? 0 0 0 0\n" +
                            "? ? ? ? 0 0 0 0 0 ? ? ? 0 0 ? ? ? 0 0 0 0 0 ? ? ? 0 0 0 0 0",

                    "0 0 0 0 0 0 0 0 0 0 0 0 1 x 1 0 0 0 0 0 0 0 0 1 1 1 1 1 1 0\n" +
                            "0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 0 1 1 1 0 0 0 0 2 x 2 1 x 1 0\n" +
                            "1 1 1 0 0 0 0 1 1 1 0 0 0 0 1 1 2 x 1 0 0 0 0 2 x 2 1 1 1 0\n" +
                            "1 x 1 1 1 1 0 1 x 2 1 1 0 0 1 x 2 1 1 0 0 0 0 1 1 1 0 0 0 0\n" +
                            "1 2 2 3 x 2 0 1 1 2 x 1 0 0 1 2 2 1 0 0 0 0 0 1 1 1 0 0 1 1\n" +
                            "0 1 x 3 x 2 0 0 0 1 1 1 0 1 2 3 x 1 0 0 0 0 0 1 x 1 0 0 1 x\n" +
                            "0 1 1 3 3 3 2 1 1 1 1 2 1 2 x x 2 2 1 1 0 0 0 1 1 1 1 1 2 1\n" +
                            "0 0 0 1 x x 2 x 1 1 x 2 x 2 3 3 3 2 x 1 0 1 1 1 0 0 2 x 2 0\n" +
                            "0 1 1 2 2 2 3 2 2 1 1 2 1 1 1 x 2 x 2 1 0 1 x 1 0 0 2 x 2 0\n" +
                            "1 2 x 1 0 1 2 x 1 0 0 0 1 1 2 2 3 2 1 0 0 1 1 1 0 0 1 1 1 0\n" +
                            "1 x 2 1 0 1 x 3 2 1 0 0 1 x 1 1 x 2 1 0 0 0 1 1 1 0 0 0 0 0\n" +
                            "1 1 2 1 2 2 2 2 x 1 0 0 1 1 1 1 2 x 1 0 0 0 1 x 2 1 0 0 0 0\n" +
                            "1 1 2 x 2 x 1 1 1 1 0 0 0 0 1 1 2 1 1 0 0 0 1 2 x 1 0 0 0 0\n" +
                            "1 x 3 2 2 1 1 0 0 1 1 1 0 0 1 x 1 0 0 0 0 0 1 2 2 1 0 0 0 0\n" +
                            "1 2 x 1 0 0 0 0 0 1 x 1 0 0 1 1 1 0 0 0 0 0 1 x 1 0 0 0 0 0"},

            // [9]
            {"Solvable map",
                    "1 2 x 1\n1 x 2 1\n1 1 2 1\n1 1 2 x\n1 x 3 2\n1 2 x 1",
                    "1 2 ? 1\n? ? 2 1\n? ? 2 1\n? ? 2 ?\n? ? ? 2\n? ? ? 1",
//                    "1 2 ? 1\n? ? 2 1\n? ? 2 1\n1 1 2 ?\n1 ? ? 2\n? ? ? 1",
                    "1 2 x 1\n1 x 2 1\n1 1 2 1\n1 1 2 x\n1 x 3 2\n1 2 x 1"},

            // [10]
            {"Solvable map",
                    "1 1 1 0\n" +
                            "1 x 1 0\n" +
                            "1 1 1 0\n" +
                            "1 2 1 1\n" +
                            "x 3 x 2\n" +
                            "1 3 x 2\n" +
                            "0 1 1 1\n" +
                            "1 1 1 0\n" +
                            "2 x 1 0\n" +
                            "x 2 1 0\n" +
                            "1 1 0 0\n" +
                            "0 0 0 0\n" +
                            "1 1 2 1\n" +
                            "1 x 2 x\n" +
                            "1 1 2 1\n" +
                            "0 0 1 1\n" +
                            "0 0 1 x\n" +
                            "0 0 1 1\n" +
                            "0 0 0 0\n" +
                            "0 0 0 0\n" +
                            "0 0 1 1\n" +
                            "0 0 1 x\n" +
                            "0 0 1 1\n" +
                            "0 0 0 0\n" +
                            "1 1 0 0\n" +
                            "x 1 0 0\n" +
                            "1 1 0 0\n" +
                            "1 1 1 0\n" +
                            "1 x 1 0",

                    "? ? ? 0\n" +
                            "? ? ? 0\n" +
                            "? ? ? 0\n" +
                            "? ? ? ?\n" +
                            "? ? ? ?\n" +
                            "? ? ? ?\n" +
                            "0 ? ? ?\n" +
                            "? ? ? 0\n" +
                            "? ? ? 0\n" +
                            "? ? ? 0\n" +
                            "? ? 0 0\n" +
                            "0 0 0 0\n" +
                            "? ? ? ?\n" +
                            "? ? ? ?\n" +
                            "? ? ? ?\n" +
                            "0 0 ? ?\n" +
                            "0 0 ? ?\n" +
                            "0 0 ? ?\n" +
                            "0 0 0 0\n" +
                            "0 0 0 0\n" +
                            "0 0 ? ?\n" +
                            "0 0 ? ?\n" +
                            "0 0 ? ?\n" +
                            "0 0 0 0\n" +
                            "? ? 0 0\n" +
                            "? ? 0 0\n" +
                            "? ? 0 0\n" +
                            "? ? ? 0\n" +
                            "? ? ? 0",

                    "1 1 1 0\n" +
                            "1 x 1 0\n" +
                            "1 1 1 0\n" +
                            "1 2 1 1\n" +
                            "x 3 x 2\n" +
                            "1 3 x 2\n" +
                            "0 1 1 1\n" +
                            "1 1 1 0\n" +
                            "2 x 1 0\n" +
                            "x 2 1 0\n" +
                            "1 1 0 0\n" +
                            "0 0 0 0\n" +
                            "1 1 2 1\n" +
                            "1 x 2 x\n" +
                            "1 1 2 1\n" +
                            "0 0 1 1\n" +
                            "0 0 1 x\n" +
                            "0 0 1 1\n" +
                            "0 0 0 0\n" +
                            "0 0 0 0\n" +
                            "0 0 1 1\n" +
                            "0 0 1 x\n" +
                            "0 0 1 1\n" +
                            "0 0 0 0\n" +
                            "1 1 0 0\n" +
                            "x 1 0 0\n" +
                            "1 1 0 0\n" +
                            "1 1 1 0\n" +
                            "1 x 1 0"},

            // [11]
            {"Solvable map",
                    "0 1 x 1 0 0 0 0\n" +
                            "0 1 1 1 0 0 0 0\n" +
                            "1 2 1 1 0 0 0 0\n" +
                            "x 2 x 1 0 0 0 01",

                    "0 ? ? ? 0 0 0 0\n" +
                            "0 ? ? ? 0 0 0 0\n" +
                            "? ? ? ? 0 0 0 0\n" +
                            "? ? ? ? 0 0 0 0",

                    "0 1 x 1 0 0 0 0\n" +
                            "0 1 1 1 0 0 0 0\n" +
                            "1 2 1 1 0 0 0 0\n" +
                            "x 2 x 1 0 0 0 0"},

            // [12]
            {"Solvable map(long run)",
                    "0 0 0 0 0 0 2 x 2 0 0 0 0 0 1 1 1 1 1 1 1 x 2 x 1 0 1 x\n" +
                            "0 0 0 0 0 0 2 x 2 0 0 0 0 1 2 x 2 2 x 1 1 1 3 2 2 0 1 1\n" +
                            "0 0 0 0 0 0 1 1 1 0 0 0 0 1 x 3 x 2 1 1 1 1 2 x 1 1 1 1\n" +
                            "0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 2 1 1 0 0 1 x 2 1 1 1 x 1",

                    "0 0 0 0 0 0 ? ? ? 0 0 0 0 0 ? ? ? ? ? ? ? ? ? ? ? 0 ? ?\n" +
                            "0 0 0 0 0 0 ? ? ? 0 0 0 0 ? ? ? ? ? ? ? ? ? ? ? ? 0 ? ?\n" +
                            "0 0 0 0 0 0 ? ? ? 0 0 0 0 ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?\n" +
                            "0 0 0 0 0 0 0 0 0 0 0 0 0 ? ? ? ? ? 0 0 ? ? ? ? ? ? ? ?",

                    "0 0 0 0 0 0 2 x 2 0 0 0 0 0 1 1 1 1 1 1 1 x 2 x 1 0 1 x\n" +
                            "0 0 0 0 0 0 2 x 2 0 0 0 0 1 2 x 2 2 x 1 1 1 3 2 2 0 1 1\n" +
                            "0 0 0 0 0 0 1 1 1 0 0 0 0 1 x 3 x 2 1 1 1 1 2 x 1 1 1 1\n" +
                            "0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 2 1 1 0 0 1 x 2 1 1 1 x 1"},

            // [13]
            {"Solvable map(part of map 12)",
                    "0 0 1 1 1 1 1 1 1 x 2 x 1 0 1 x\n" +
                            "0 1 2 x 2 2 x 1 1 1 3 2 2 0 1 1\n" +
                            "0 1 x 3 x 2 1 1 1 1 2 x 1 1 1 1\n" +
                            "0 1 1 2 1 1 0 0 1 x 2 1 1 1 x 1",

                    "0 0 ? ? ? ? ? ? ? ? ? ? ? 0 ? ?\n" +
                            "0 ? ? ? ? ? ? ? ? ? ? ? ? 0 ? ?\n" +
                            "0 ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?\n" +
                            "0 ? ? ? ? ? 0 0 ? ? ? ? ? ? ? ?",

                    "0 0 1 1 1 1 1 1 1 x 2 x 1 0 1 x\n" +
                            "0 1 2 x 2 2 x 1 1 1 3 2 2 0 1 1\n" +
                            "0 1 x 3 x 2 1 1 1 1 2 x 1 1 1 1\n" +
                            "0 1 1 2 1 1 0 0 1 x 2 1 1 1 x 1"},

            // [14]
            {"Solvable map(part of map 13)",
                    "1 x 2 x 1 0 1 x\n" +
                            "1 1 3 2 2 0 1 1\n" +
                            "1 1 2 x 1 1 1 1\n" +
                            "1 x 2 1 1 1 x 1",

                    "? ? ? ? ? 0 ? ?\n" +
                            "? ? ? ? ? 0 ? ?\n" +
                            "? ? ? ? ? ? ? ?\n" +
                            "? ? ? ? ? ? ? ?",

                    "1 x 2 x 1 0 1 x\n" +
                            "1 1 3 2 2 0 1 1\n" +
                            "1 1 2 x 1 1 1 1\n" +
                            "1 x 2 1 1 1 x 1"},

            // [15]
            {"Solvable map(part of map 13)",
                    "0 0 1 1 1 1 1 1 1 x\n" +
                            "0 1 2 x 2 2 x 1 1 1\n" +
                            "0 1 x 3 x 2 1 1 1 1\n" +
                            "0 1 1 2 1 1 0 0 1 x",

                    "0 0 ? ? ? ? ? ? ? ?\n" +
                            "0 ? ? ? ? ? ? ? ? ?\n" +
                            "0 ? ? ? ? ? ? ? ? ?\n" +
                            "0 ? ? ? ? ? 0 0 ? ?",

                    "0 0 1 1 1 1 1 1 1 x\n" +
                            "0 1 2 x 2 2 x 1 1 1\n" +
                            "0 1 x 3 x 2 1 1 1 1\n" +
                            "0 1 1 2 1 1 0 0 1 x"},

            // [16]
            {"Solvable map(long run)",
                    "0 0 0 0 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 0\n" +
                            "0 0 0 0 1 x 1 0 0 0 1 1 1 0 0 1 1 1 1 1 1 0 0 0 0 0 0 1 x 1 0\n" +
                            "0 0 0 0 1 1 1 0 0 0 1 x 2 2 1 3 x 2 1 x 1 0 0 0 0 0 0 2 2 3 1\n" +
                            "0 0 0 0 0 0 0 0 0 1 2 3 x 2 x 4 x 4 2 2 2 1 0 0 0 0 1 2 x 2 x\n" +
                            "1 1 1 0 0 0 0 1 1 2 x 3 2 3 2 5 x x 1 1 x 1 0 0 0 0 1 x 2 2 1\n" +
                            "2 x 2 1 1 2 1 2 x 2 1 2 x 1 1 x x 3 2 2 2 1 0 1 1 1 1 2 3 2 1\n" +
                            "2 x 2 1 x 2 x 2 1 1 0 1 1 1 1 2 2 1 1 x 1 0 0 1 x 1 0 1 x x 1",

                    "0 0 0 0 ? ? ? 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ? ? ? 0\n" +
                            "0 0 0 0 ? ? ? 0 0 0 ? ? ? 0 0 ? ? ? ? ? ? 0 0 0 0 0 0 ? ? ? 0\n" +
                            "0 0 0 0 ? ? ? 0 0 0 ? ? ? ? ? ? ? ? ? ? ? 0 0 0 0 0 0 ? ? ? ?\n" +
                            "0 0 0 0 0 0 0 0 0 ? ? ? ? ? ? ? ? ? ? ? ? ? 0 0 0 0 ? ? ? ? ?\n" +
                            "? ? ? 0 0 0 0 ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? 0 0 0 0 ? ? ? ? ?\n" +
                            "? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? 0 ? ? ? ? ? ? ? ?\n" +
                            "? ? ? ? ? ? ? ? ? ? 0 ? ? ? ? ? ? ? ? ? ? 0 0 ? ? ? 0 ? ? ? ?",

                    "0 0 0 0 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 0\n" +
                            "0 0 0 0 1 x 1 0 0 0 1 1 1 0 0 1 1 1 1 1 1 0 0 0 0 0 0 1 x 1 0\n" +
                            "0 0 0 0 1 1 1 0 0 0 1 x 2 2 1 3 x 2 1 x 1 0 0 0 0 0 0 2 2 3 1\n" +
                            "0 0 0 0 0 0 0 0 0 1 2 3 x 2 x 4 x 4 2 2 2 1 0 0 0 0 1 2 x 2 x\n" +
                            "1 1 1 0 0 0 0 1 1 2 x 3 2 3 2 5 x x 1 1 x 1 0 0 0 0 1 x 2 2 1\n" +
                            "2 x 2 1 1 2 1 2 x 2 1 2 x 1 1 x x 3 2 2 2 1 0 1 1 1 1 2 3 2 1\n" +
                            "2 x 2 1 x 2 x 2 1 1 0 1 1 1 1 2 2 1 1 x 1 0 0 1 x 1 0 1 x x 1"},

            // [17]
            {"Simple unsolvable map",
                    "0 1 x\n0 1 1",
                    "0 ? ?\n0 ? ?",
                    "?"},
    };
}