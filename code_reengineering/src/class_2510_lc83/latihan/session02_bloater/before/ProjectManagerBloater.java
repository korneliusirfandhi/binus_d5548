package class_2510_lc83.latihan.session02_bloater.before;

public class ProjectManagerBloater {

    private String projectName;
    private String projectID;
    private String clientName;
    private double budgetAmount;
    private int durationDays;

    private String teamLeadName;
    private String[] teamMembers;
    private int numberOfMembers;

    private String status; // e.g., "In Progress", "Completed", "On Hold"
    private double currentExpenditure;
    private int tasksCompletedCount;
    private int totalTasksCount;

    public ProjectManagerBloater(String projectName, String projectID, String clientName, double budgetAmount, int durationDays, String teamLeadName, String[] teamMembers) {
        this.projectName = projectName;
        this.projectID = projectID;
        this.clientName = clientName;
        this.budgetAmount = budgetAmount;
        this.durationDays = durationDays;
        this.teamLeadName = teamLeadName;
        this.teamMembers = teamMembers;
        this.numberOfMembers = teamMembers.length;
        this.status = "New";
        this.currentExpenditure = 0.0;
        this.tasksCompletedCount = 0;
        this.totalTasksCount = 100;
    }

    public String updateProjectStatusAndGenerateReport(String newStatus, double expenditureUpdate, int tasksCompleted, String milestoneReached) {
        if (expenditureUpdate < 0 || tasksCompleted < 0) {
            return "Error: Expenditure or tasks completed cannot be negative.";
        }

        this.currentExpenditure += expenditureUpdate;
        this.tasksCompletedCount += tasksCompleted;

        if (!this.status.equals(newStatus)) {
            System.out.println("Changing project status from " + this.status + " to " + newStatus);
            this.status = newStatus;
        }

        if (this.currentExpenditure > this.budgetAmount * 0.9) {
            System.err.println("🚨 WARNING: Project is 90% or more over budget! Current: $" + this.currentExpenditure + ", Budget: $" + this.budgetAmount);
            // Emailing the client and lead (Simulated)
            sendNotificationEmail(clientName, "URGENT Budget Alert"); // 5. Team/Client communication logic
            sendNotificationEmail(teamLeadName, "URGENT Budget Alert"); // 5. Team/Client communication logic
        }

        String reportDetails = "";
        if (milestoneReached != null && !milestoneReached.isEmpty()) {
            if (milestoneReached.equalsIgnoreCase("Phase 1 Complete")) {
                reportDetails += "Milestone 'Phase 1 Complete' achieved. Initiating next phase...\n";
            } else if (milestoneReached.equalsIgnoreCase("UAT Sign-off")) {
                reportDetails += "UAT Signed off. Preparing for final deployment.\n";
            } else {
                reportDetails += "Custom milestone reached: " + milestoneReached + "\n";
            }
        }

        double progressPercentage = ((double) this.tasksCompletedCount / this.totalTasksCount) * 100;
        reportDetails += String.format("Current progress: %.2f%%\n", progressPercentage);

        // 8. Final Report Generation (should be its own ReportGenerator class)
        String finalReport = "--- Project Status Report ---\n" +
            "Project: " + projectName + " (" + projectID + ")\n" +
            "Client: " + clientName + "\n" +
            "Current Status: " + this.status + "\n" +
            "Team Lead: " + teamLeadName + "\n" +
            "Team Size: " + numberOfMembers + "\n" +
            "Budget Remaining: $" + (budgetAmount - currentExpenditure) + "\n" +
            "Tasks Done/Total: " + tasksCompletedCount + "/" + totalTasksCount + "\n" +
            reportDetails +
            "-----------------------------\n";

        System.out.println("\n" + finalReport);

        return "Report generated and status updated successfully. Current Status: " + this.status;
    }

    private void sendNotificationEmail(String recipient, String subject) {
        System.out.println("-> Sending email to: " + recipient + " with subject: " + subject);
    }

    public void allocateResource(String resourceName, int hours) {
        System.out.println("Allocating resource: " + resourceName + " for " + hours + " hours. (This is another separate responsibility)");
    }

    public static void main(String[] args) {
        String[] initialTeam = {"Alice", "Bob", "Charlie"};

        ProjectManagerBloater agileProject = new ProjectManagerBloater(
            "Agile Web App", "AWA-001", "Acme Corp", 50000.0, 90, "Diana Prince", initialTeam
        );

        System.out.println("--- Initial Update (Normal) ---");
        agileProject.updateProjectStatusAndGenerateReport("In Progress", 5000.0, 5, "");

        System.out.println("\n--- Second Update (Milestone Reached) ---");
        agileProject.updateProjectStatusAndGenerateReport("In Progress", 15000.0, 20, "Phase 1 Complete");

        System.out.println("\n--- Final Update (Budget Warning) ---");
        // This update causes the budget to exceed the 90% threshold
        agileProject.updateProjectStatusAndGenerateReport("Testing", 25000.0, 15, "UAT Sign-off");

        agileProject.allocateResource("Senior Tester", 40);
    }
}