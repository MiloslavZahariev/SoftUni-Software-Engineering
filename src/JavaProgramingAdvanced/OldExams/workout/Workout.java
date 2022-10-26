package JavaProgramingAdvanced.OldExams.workout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Workout {
    private final List<Exercise> exercises;
    private final String type;
    private final int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        if (exercises.size() < exerciseCount) {
            this.exercises.add(exercise);
        }
    }

    public boolean removeExercise(String name, String muscle) {
        Exercise temp = getExercise(name, muscle);
       return exercises.remove(temp);
    }

    public Exercise getExercise(String name, String muscle) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(name)
                    && exercise.getMuscle().equals(muscle)) {
                return exercise;
            }
        }
        return null;
    }

    public Exercise getMostBurnedCaloriesExercise() {
        return exercises.stream().max(Comparator.comparingInt(Exercise::getBurnedCalories)).orElse(null);
    }

    public int getExerciseCount() {
        return exercises.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder("Workout type: ");
        sb.append(type);
        for (Exercise exercise : exercises) {
            sb.append(System.lineSeparator()).append(exercise);
        }

        return sb.toString();
    }
}
