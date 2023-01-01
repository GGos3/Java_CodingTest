public class 자릿수_더하기 {
    public int solution(int n) {
        String sNum = Integer.toString(n);
        int result = 0;
        for (int i = 0; i < sNum.length(); i ++) {
            result += Integer.parseInt(sNum.substring(i, i + 1));
        }
        return result;
    }
}
