import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Placement eligiblity decision");

        // Scanner scanner = new Scanner(System.in);
        // String name = scanner.next();
        // double percentage = scanner.nextDouble();
        // int backlogs = scanner.nextInt();
        // int graduationYear = scanner.nextInt();

        // System.out.println("Candidate: " + name);
        // System.out.println("Percentage: " + percentage);
        // System.out.println("Backlogs: " + backlogs);
        // System.out.println("Graduation Year: " + graduationYear);

        // Condidate condidate = new Condidate(name, percentage, backlogs,
        // graduationYear);

        // System.out.println("Condidate :" + condidate.getName());
        // System.out.println("Percentage: " + condidate.getPercentage());
        // System.out.println("Backlogs:" + condidate.getBacklogs());
        // System.out.println("Graduation Year :" + condidate.getGraduationYear());

        Job job = new Job("Infosys",
                "Java Developer",
                65.0,
                0,
                2026

        );

        System.out.println("Condidate:" + job.getCompany());
        System.out.println("Role:" + job.getRole());
        System.out.println("Minimum Percentage:" + job.getMinimumPercentage());
        System.out.println("Maximum Backlogs:" + job.getMaximumBacklogs());
        System.out.println("Required Graduation Year:" + job.getGraduationYear());

        // scanner.close();

    }

}