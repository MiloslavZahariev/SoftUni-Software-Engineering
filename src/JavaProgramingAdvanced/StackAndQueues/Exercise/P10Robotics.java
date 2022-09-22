package JavaProgramingAdvanced.StackAndQueues.Exercise;

import java.util.*;

public class P10Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] robots = scanner.nextLine().split(";");
        String[] startingTime = scanner.nextLine().split(":");
        int[] workingTime = new int[robots.length];

        int startingTimeInSeconds = convertTimeToSeconds(startingTime);

        Deque<String> detailsQueue = new ArrayDeque<>();
        Map<String, Integer> busyRobotsMap = new LinkedHashMap<>();


        String details = scanner.nextLine();

        while (!details.equals("End")) {
            detailsQueue.offer(details);
            details = scanner.nextLine();
        }

        while (!detailsQueue.isEmpty()) {
            startingTimeInSeconds++;

            String detail = detailsQueue.poll();
            boolean isWorking = false;
            for (int i = 0; i < robots.length; i++) {

                if (workingTime[i] == 0 && !isWorking) {
                    workingTime[i] = Integer.parseInt(robots[i].split("-")[1]);
                    isWorking = true;
                    System.out.printf("%s - %s %s%n", robots[i].split("-")[0], detail, convertSecondToTime(startingTimeInSeconds));
                }
                if (workingTime[i] > 0) {
                    workingTime[i]--;
                }
            }

            if (!isWorking) {
                detailsQueue.offer(detail);
            }


        }

    }

    private static String convertSecondToTime(int startingTimeInSeconds) {

        int hours = startingTimeInSeconds / 3600 % 24;
        startingTimeInSeconds %= 3600;

        int minutes = startingTimeInSeconds / 60;
        startingTimeInSeconds %= 60;

        return String.format("[%02d:%02d:%02d]", hours, minutes, startingTimeInSeconds);

    }

    private static int convertTimeToSeconds(String[] startingTime) {
        int seconds = Integer.parseInt(startingTime[2]);
        int minutes = Integer.parseInt(startingTime[1]) * 60;
        int hours = Integer.parseInt(startingTime[0]) * 3600;

        return seconds + minutes + hours;

    }
}
