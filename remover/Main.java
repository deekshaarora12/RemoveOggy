package remover;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void removeOggy(ArrayList<String> names) {
        ArrayList<String> names_copy = new ArrayList<String>(names);
        for (int i = 0; i < names_copy.size(); i++) {
            String removed = names_copy.get(i);
            if (removed.startsWith("oggy")) {
                names.remove(removed);
            }
        }
        return;
    }

    public static boolean oggyIsRemoved(ArrayList<String> names) {
        List<String> oggys = names.stream().filter(it -> it.contains("oggy")).collect(Collectors.toList());
        return oggys.size() == 0;
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("nobita", "bheem", "oggy", "oggy cockroach", "ninja"));
        removeOggy(names);
        if (oggyIsRemoved(names)) {
            System.out.println("Passed!");
            System.exit(0);
        } else {
            System.out.println("Failed!!");
            System.exit(1);
        }
    }
}

