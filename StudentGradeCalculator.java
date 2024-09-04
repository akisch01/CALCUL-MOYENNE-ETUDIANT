import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;
        
        while (continueCalculating) {
            // Demande à l'utilisateur de saisir le nombre de matières
            System.out.print("Entrez le nombre de matières: ");
            int numberOfSubjects = scanner.nextInt();
            
            int[] marks = new int[numberOfSubjects];
            int totalMarks = 0;
            
            // Saisie des notes obtenues
            for (int i = 0; i < numberOfSubjects; i++) {
                System.out.print("Entrez la note pour la matière " + (i + 1) + " (sur 20): ");
                marks[i] = scanner.nextInt();
                totalMarks += marks[i];
            }
            
            // Calcul du pourcentage moyen
            double averagePercentage = ((double) totalMarks / (numberOfSubjects * 20)) * 100;
            
            // Calcul du grade
            String grade;
            if (averagePercentage >= 90) {
                grade = "A";
            } else if (averagePercentage >= 80) {
                grade = "B";
            } else if (averagePercentage >= 70) {
                grade = "C";
            } else if (averagePercentage >= 60) {
                grade = "D";
            } else if (averagePercentage >= 50) {
                grade = "E";
            } else {
                grade = "F";
            }
            
            // Affichage des résultats
            System.out.println("\nRésultats:");
            System.out.println("Total des notes: " + totalMarks + " / " + (numberOfSubjects * 20));
            System.out.println("Pourcentage moyen: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);
            
            // Demander à l'utilisateur s'il souhaite calculer une nouvelle moyenne ou quitter
            System.out.print("\nVoulez-vous calculer une nouvelle moyenne ? (oui/non): ");
            String response = scanner.next().trim().toLowerCase();
            
            if (!response.equals("oui")) {
                continueCalculating = false;
            }
        }
        
        System.out.println("Merci d'avoir utilisé le calculateur de notes.");
        scanner.close();
    }
}
