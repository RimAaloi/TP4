//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<Employe> employes = Arrays.asList(
                new Employe("rim", "IT", 4500.00),
                new Employe("noha", "Finance", 3500.00),
                new Employe("ouma", "HR", 5000.00),
                new Employe("lolo", "IT", 3000.00)
        );

        double sommeSalaires = employes.stream()
                .mapToDouble(Employe::getSalaire)
                .sum();
        System.out.println("Somme des salaires : " + sommeSalaires);

        List<Employe> employesTries = employes.stream()
                .sorted(Comparator.comparing(Employe::getNom))
                .collect(Collectors.toList());
        System.out.println("Employés triés par nom : " + employesTries);

        Employe salaireMin = employes.stream()
                .min(Comparator.comparing(Employe::getSalaire))
                .orElse(null);
        System.out.println("Employé avec le salaire le plus bas : " + salaireMin);

        List<Employe> salairesEleves = employes.stream()
                .filter(emp -> emp.getSalaire() > 4000)
                .collect(Collectors.toList());
        System.out.println("Employés avec salaire > 4000 : " + salairesEleves);

        Employe salaireMax = employes.stream()
                .reduce((e1, e2) -> e1.getSalaire() > e2.getSalaire() ? e1 : e2)
                .orElse(null);
        System.out.println("Employé avec le salaire le plus élevé : " + salaireMax);

        // 6. Concaténer les noms de tous les employés
        String nomsConcat = employes.stream()
                .map(Employe::getNom)
                .reduce((n1, n2) -> n1 + ", " + n2)
                .orElse("");
        System.out.println("Noms concaténés : " + nomsConcat);
    }
}

class Employe {
    private String nom;
    private String departement;
    private double salaire;
    public Employe(String nom, String departement, double salaire) {
        this.nom = nom;
        this.departement = departement;
        this.salaire = salaire;
    }
    public String getNom() {
        return nom;
    }
    public String getDepartement() {
        return departement;
    }
    public double getSalaire() {
        return salaire;
    }
    @Override
    public String toString() {
        return "Employe{nom='" + nom + "', departement='" + departement + "', salaire=" + salaire + "}";
    }
}