package JavaProgramingFundamentals.ExamPreparation;

import java.util.*;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPieces = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> piecesMap = new LinkedHashMap<>();

        for (int i = 1; i <= countPieces; i++) {
            String pieceData = scanner.nextLine();
            String[] piecePart = pieceData.split("\\|");
            String pieceName = piecePart[0];
            String composer = piecePart[1];
            String tone = piecePart[2];

            List<String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer);
            pieceInfo.add(tone);
            piecesMap.put(pieceName, pieceInfo);

        }


        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            if (command.contains("Add")) {
                String pieceName = command.split("\\|")[1];
                String composer = command.split("\\|")[2];
                String tone = command.split("\\|")[3];

                if (piecesMap.containsKey(pieceName)) {
                    System.out.printf("%s is already in the collection!%n", pieceName);
                } else {
                    List<String> info = new ArrayList<>();
                    info.add(composer);
                    info.add(tone);
                    piecesMap.put(pieceName, info);
                    System.out.printf("%s by %s in %s added to the collection!%n", pieceName, composer, tone);

                }

            } else if (command.contains("Remove")) {
                String removedPiece = command.split("\\|")[1];
                if (piecesMap.containsKey(removedPiece)) {
                    piecesMap.remove(removedPiece);
                    System.out.printf("Successfully removed %s!%n", removedPiece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", removedPiece);
                }

            } else if (command.contains("ChangeKey")) {
                String pieceName = command.split("\\|")[1];
                String newTone = command.split("\\|")[2];

                if (piecesMap.containsKey(pieceName)) {
                    piecesMap.get(pieceName).remove(1);
                    piecesMap.get(pieceName).add(newTone);
                    System.out.printf("Changed the key of %s to %s!%n",pieceName,newTone);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceName);
                }

            }


            command = scanner.nextLine();
        }
        piecesMap.entrySet().forEach(x -> System.out.printf("%s -> Composer: %s, Key: %s%n",x.getKey(),x.getValue().get(0),x.getValue().get(1)));

    }
}
