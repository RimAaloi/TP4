//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        List<String> mots = Arrays.asList("apple", "banana", "cat", "dog", "elephant", "fox");

        List<String> motsAvecA = mots.stream()
                .filter(mot -> mot.contains("a"))
                .collect(Collectors.toList());
        System.out.println("Mots avec 'a' : " + motsAvecA);

        List<String> motsInverses = mots.stream()
                .filter(mot -> mot.length() > 3)
                .map(mot -> new StringBuilder(mot).reverse().toString())
                .collect(Collectors.toList());
        System.out.println("Mots inversés (>3 caractères) : " + motsInverses);

        List<Character> caracteresAvecE = mots.stream()
                .filter(mot -> mot.contains("e"))
                .flatMap(mot -> mot.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println("Caractères des mots avec 'e' : " + caracteresAvecE);

        List<String> motsMajuscules = mots.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Mots en majuscules : " + motsMajuscules);

        List<Integer> longueurs = mots.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Longueurs des mots : " + longueurs);

        List<Character> tousCaracteres = mots.stream()
                .flatMap(mot -> mot.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println("Tous les caractères : " + tousCaracteres);

        List<String> motsAvecIndex = IntStream.range(0, mots.size())
                .mapToObj(i -> mots.get(i) + " - " + i)
                .collect(Collectors.toList());
        System.out.println("Mots avec index : " + motsAvecIndex);
    }
}