package JavaProgramingFundamentals.OldFinalExams;

import java.util.*;

public class P03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> heroesMap = new LinkedHashMap<>();

        int numberOfHeroes = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfHeroes; i++) {
            String heroInfo = scanner.nextLine();

            String name = heroInfo.split(" ")[0];
            int health = Integer.parseInt(heroInfo.split(" ")[1]);
            int mana = Integer.parseInt(heroInfo.split(" ")[2]);

            List<Integer> heroStats = new ArrayList<>();
            heroStats.add(health);
            heroStats.add(mana);
            heroesMap.put(name, heroStats);
        }

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("End")) {
            String command = commandLine.split(" - ")[0];
            String heroName = commandLine.split(" - ")[1];

            if (command.equals("CastSpell")) {
                int requiredMana = Integer.parseInt(commandLine.split(" - ")[2]);
                String spellName = commandLine.split(" - ")[3];
                int currentMana = heroesMap.get(heroName).get(1);
                if (currentMana >= requiredMana) {
                    heroesMap.get(heroName).set(1, currentMana - requiredMana);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, heroesMap.get(heroName).get(1));
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                }

            } else if (command.equals("TakeDamage")) {
                int damage = Integer.parseInt(commandLine.split(" - ")[2]);
                String attacker = commandLine.split(" - ")[3];
                int currentHeath = heroesMap.get(heroName).get(0);
                if (currentHeath > damage) {
                    heroesMap.get(heroName).set(0, currentHeath - damage);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, heroesMap.get(heroName).get(0));
                } else {
                    heroesMap.remove(heroName);
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                }

            } else if (command.equals("Recharge")) {
                int rechargeMana = Integer.parseInt(commandLine.split(" - ")[2]);
                int currentMana = heroesMap.get(heroName).get(1);
                if (currentMana + rechargeMana <= 200) {
                    heroesMap.get(heroName).set(1, currentMana + rechargeMana);
                    System.out.printf("%s recharged for %d MP!%n", heroName, rechargeMana);
                } else {
                    heroesMap.get(heroName).set(1, 200);
                    System.out.printf("%s recharged for %d MP!%n", heroName, 200 - currentMana);
                }

            } else if (command.equals("Heal")) {
                int healHealth = Integer.parseInt(commandLine.split(" - ")[2]);
                int currentHealth = heroesMap.get(heroName).get(0);
                if (currentHealth + healHealth <= 100){
                    heroesMap.get(heroName).set(0,currentHealth + healHealth);
                    System.out.printf("%s healed for %d HP!%n",heroName,healHealth);
                }else{
                    heroesMap.get(heroName).set(0,100);
                    System.out.printf("%s healed for %d HP!%n",heroName,100 - currentHealth);
                }
            }


            commandLine = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : heroesMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.printf("  HP: %d%n",entry.getValue().get(0));
            System.out.printf("  MP: %d%n",entry.getValue().get(1));
        }


    }
}
