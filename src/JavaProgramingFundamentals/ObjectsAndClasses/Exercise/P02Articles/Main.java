package JavaProgramingFundamentals.ObjectsAndClasses.Exercise.P02Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String commandLine = scanner.nextLine();

            switch (commandLine.split(": ")[0]) {
                case "Edit":
                    article.setContent(commandLine.split(": ")[1]);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(commandLine.split(": ")[1]);
                    break;
                case "Rename":
                    article.setTitle(commandLine.split(": ")[1]);
                    break;
            }
        }

        System.out.println(article.toString());
    }
}
