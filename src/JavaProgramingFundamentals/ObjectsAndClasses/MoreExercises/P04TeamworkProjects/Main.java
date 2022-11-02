package JavaProgramingFundamentals.ObjectsAndClasses.MoreExercises.P04TeamworkProjects;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfTeams = Integer.parseInt(scanner.nextLine());


        List<Teams> teamsList = new ArrayList<>();

        for (int i = 0; i < countOfTeams; i++) {
            String input = scanner.nextLine();
            String teamName = input.split("-")[1];
            String user = input.split("-")[0];

            if (!checkForTeamIsCreated(teamsList, teamName) && !checkForCreatorIsOnTeam(teamsList, user)) {
                Teams team = new Teams(teamName, user);
                System.out.printf("JavaProgramingOOP.Encapsulation.Lab.Teams.Team %s has been created by %s!%n", teamName, user);
                teamsList.add(team);
            } else if (checkForTeamIsCreated(teamsList, teamName)) {
                System.out.printf("JavaProgramingOOP.Encapsulation.Lab.Teams.Team %s was already created!%n", teamName);
            } else if (checkForCreatorIsOnTeam(teamsList, user)) {
                System.out.printf("%s cannot create another team!%n", user);
            }

        }

        String input2 = scanner.nextLine();
        while (!input2.equals("end of assignment")) {
            String teamName = input2.split("->")[1];
            String user = input2.split("->")[0];

            if (!checkForTeamIsCreated(teamsList, teamName)) {
                System.out.printf("JavaProgramingOOP.Encapsulation.Lab.Teams.Team %s does not exist!%n", teamName);
            } else if (checkForUserIsOnTeam(teamsList, user)  || checkForCreatorIsOnTeam(teamsList,user)) {
                System.out.printf("Member %s cannot join team %s!%n", user, teamName);
            } else if(!checkForCreatorIsOnTeam(teamsList,user)){
                addingUserInTeamList(teamsList, teamName, user);
            }


            input2 = scanner.nextLine();
        }

        printingResults(teamsList);
    }

    private static boolean checkForCreatorIsOnTeam(List<Teams> teamsList, String user) {
        for (Teams team : teamsList) {
            if (team.getCreator().equals(user)) {
                return true;
            }
        }
        return false;

    }

    private static void printingResults(List<Teams> teamsList) {

        teamsList.sort(Comparator.comparing(teams -> teams.getUserList().size()));
        Collections.reverse(teamsList);

        for (Teams team : teamsList) {
            if (team.getUserList().size() > 0) {
                System.out.println(team.getTeamName());
                System.out.println("- " + team.getCreator());
                Collections.sort(team.getUserList());
                for (String name : team.getUserList()) {
                    System.out.println("-- " + name);
                }
            }
        }

        teamsList.sort(Comparator.comparing(Teams::getTeamName));
        System.out.println("Teams to disband:");
        for (Teams team : teamsList) {
            if (team.getUserList().size() == 0) {
                System.out.println(team.getTeamName());
            }
        }
    }

    private static void addingUserInTeamList(List<Teams> teamsList, String teamName, String user) {
        for (Teams team : teamsList) {
            if (team.getTeamName().equals(teamName)) {
                team.getUserList().add(user);
            }
        }
    }

    private static boolean checkForUserIsOnTeam(List<Teams> teamsList, String user) {

        for (Teams team : teamsList) {
            for (String name : team.getUserList()) {
                if (name.equals(user)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkForTeamIsCreated(List<Teams> teamsList, String teamName) {

        for (Teams team : teamsList) {
            if (team.getTeamName().equals(teamName)) {
                return true;
            }
        }
        return false;
    }
}
