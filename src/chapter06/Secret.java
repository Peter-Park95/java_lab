package chapter06;

public class Secret {
    public static void main(String[] args) {
        String name = "박희범";
        String id = "950906-1188725";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }

    public static String getHiddenData(String type, int index) {
        String HiddenData = type.substring(0,index);
        for(int i = 0; i < type.length()-index; i++) {
            HiddenData += '*';
        }
        return HiddenData;
    }
}
