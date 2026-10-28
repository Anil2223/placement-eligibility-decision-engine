import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Placement eligiblity decision");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        System.out.println("Candidate: " + name);
        System.out.println("Percentage: " + percentage);
        System.out.println("Backlogs: " + backlogs);
        System.out.println("Graduation Year: " + graduationYear);

        scanner.close();

    }

}