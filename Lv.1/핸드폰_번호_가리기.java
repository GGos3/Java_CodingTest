public class 핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        StringBuffer sb = new StringBuffer(phone_number);
        for (int i = 0; i < (phone_number.length() - 4); i++) {
            sb.replace(i, i + 1, "*");
        }

        return String.valueOf(sb);
    }
}
