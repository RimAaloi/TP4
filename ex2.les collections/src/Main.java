
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> notes = new HashMap<>();

        notes.put("rim", 15.5);
        notes.put("khawla", 18.0);
        notes.put("mariem", 12.0);
        notes.put("rania", 17.5);
        notes.put("nour", 14.0);

        System.out.println("Notes des étudiants après insertion :");
        notes.forEach((nom, note) -> System.out.println(nom + ": " + note));

        var etudiantAModifier = "rania";
        if (notes.containsKey(etudiantAModifier)) {
            notes.put(etudiantAModifier, notes.get(etudiantAModifier) + 2);
        }

        System.out.println("\nNotes des étudiants après augmentation de la note de Bob :");
        notes.forEach((nom, note) -> System.out.println(nom + ": " + note));
        var etudiantASupprimer = "rim";
        notes.remove(etudiantASupprimer);

        System.out.println("\nNotes des étudiants après suppression de la note de Charlie :");
        notes.forEach((nom, note) -> System.out.println(nom + ": " + note));
        System.out.println("\nTaille du map : " + notes.size());

        OptionalDouble noteMoyenne = notes.values().stream().mapToDouble(Double::doubleValue).average();
        double noteMax = notes.values().stream().mapToDouble(Double::doubleValue).max().orElse(Double.MIN_VALUE);
        double noteMin = notes.values().stream().mapToDouble(Double::doubleValue).min().orElse(Double.MAX_VALUE);

        noteMoyenne.ifPresent(moyenne -> System.out.println("\nNote moyenne : " + moyenne));
        System.out.println("Note maximale : " + noteMax);
        System.out.println("Note minimale : " + noteMin);

        boolean existeNote20 = notes.containsValue(20.0);
        System.out.println("\nY a-t-il une note égale à 20 ? " + (existeNote20 ? "Oui" : "Non"));

        System.out.println("\nNotes des étudiants après toutes les opérations :");
        notes.forEach((nom, note) -> System.out.println(nom + ": " + note));
    }
}