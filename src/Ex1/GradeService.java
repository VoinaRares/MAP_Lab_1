package Ex1;

import java.util.Arrays;

public class GradeService {
    public int[] unsatisfactoryGrades(int[] grades) {
        return Arrays.stream(grades).filter((grade) -> grade < 38).toArray();
    }
}
