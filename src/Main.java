import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        Set<Horse> set = new HashSet<>();
        set.add(new Horse("ak at", "trova", "Byswkek"));
        set.add(new Horse("ak at", "trova", "Byswkek"));
        set.add(new Horse("kara at", "trova", "Byswkek"));
        set.add(new Horse("kyzyl at", "trova", "Byswkek"));
        set.add(new Horse("jawyl at", "trova", "Byswkek"));
        System.out.println(new Horse("ak at", "trova", "Byswkek").equals(new Horse("ak at", "trova", "Byswkek")));
        }


    }





