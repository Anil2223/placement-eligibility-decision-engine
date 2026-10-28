public class Job {
    private String company;
    private String role;
    private double minimumPercentage;
    private int maximumBacklogs;
    private int requiredGraducationYear;

    public Job(
            String company,
            String role,
            double minimumPercentage,
            int maximumBacklogs,
            int requiredGraducationYear

    ) {
        this.company = company;
        this.role = role;
        this.minimumPercentage = minimumPercentage;
        this.maximumBacklogs = maximumBacklogs;
        this.requiredGraducationYear = requiredGraducationYear;
    }

    public String getCompany() {
        return company;
    }

    public String getRole() {
        return role;
    }

    public double getMinimumPercentage() {
        return minimumPercentage;
    }

    public int getMaximumBacklogs() {
        return maximumBacklogs;
    }

    public int getGraduationYear() {
        return requiredGraducationYear;
    }
}
