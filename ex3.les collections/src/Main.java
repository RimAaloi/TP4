//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        groupeA.add("rim");
        groupeA.add("rania");
        groupeA.add("laila");
        groupeB.add("ali");
        groupeB.add("ahmed");
        groupeB.add("mohammed");

        System.out.println("Groupe A: " + groupeA);
        System.out.println("Groupe B: " + groupeB);

        Set<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);
        System.out.println("Intersection des deux groupes: " + intersection);

        Set<String> union = new HashSet<>(groupeA);
        union.addAll(groupeB);
        System.out.println("Union des deux groupes: " + union);
    }
}