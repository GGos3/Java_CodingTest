public class x만큼_간격이_있는_n개의_숫자 {
    public long[] solution(int x, int n) {
        long[] result = new long[n];
        result[0] = x;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + x;
        }
        return result;
    }
}
