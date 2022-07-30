package JavaProgramingFundamentals.ExamPreparation;

import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String command = input.split(">>>")[0];

            if (command.equals("Contains")) {
                String substring = input.split(">>>")[1];
                if(activationKey.contains(substring)){
                    System.out.printf("%s contains %s%n",activationKey,substring);
                }else{
                    System.out.println("Substring not found!");
                }


            } else if (command.equals("Flip")) {
                String type = input.split(">>>")[1];
                int startIndex = Integer.parseInt(input.split(">>>")[2]);
                int endIndex = Integer.parseInt(input.split(">>>")[3]);
                String substring = activationKey.substring(startIndex,endIndex);

                if(type.equals("Upper")){
                activationKey = activationKey.replace(substring,substring.toUpperCase());
                    System.out.println(activationKey);

                }else if (type.equals("Lower")){
                    activationKey = activationKey.replace(substring,substring.toLowerCase());
                    System.out.println(activationKey);
                }

            } else if (command.equals("Slice")) {
                int startIndex = Integer.parseInt(input.split(">>>")[1]);
                int endIndex = Integer.parseInt(input.split(">>>")[2]);

                StringBuilder actBuilder = new StringBuilder(activationKey);

                activationKey = actBuilder.delete(startIndex,endIndex).toString();
                System.out.println(activationKey);

            }


            input = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s%n",activationKey);
    }
}
