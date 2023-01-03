import java.util.ArrayList;
import java.util.List;

public class x만큼_간격이_있는_n개의_숫자 {
    boolean solution(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' | s.charAt(i) == 'P') {
                count++;
            } else if (s.charAt(i) == 'y' | s.charAt(i) == 'Y') {
                count--;
            }
        }
        return count == 0;
    }
}
