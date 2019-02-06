import codewars.FruitMachine;

public class TEST {

    private static String stringUpdate(String s) {
        return s + "hello";
    }


    public static void main(String[] args) {
        System.out.println(FruitMachine.fruit(new String[][]{new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
                "Cherry", "Bar", "King", "Queen", "Jack"},
                new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
                        "Cherry", "Bar", "King", "Queen", "Jack"},
                new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
                        "Cherry", "Bar", "King", "Queen", "Jack"}}, new int[]{0, 0, 0}));

    }
}
