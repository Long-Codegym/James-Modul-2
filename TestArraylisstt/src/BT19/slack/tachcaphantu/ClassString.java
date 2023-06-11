package BT19.slack.tachcaphantu;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassString {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String spltString = "HelloWorldHowAreYou";
        String[] str = null;
        for (int i = 0; i < spltString.length(); i++) {
            str = spltString.split("[A-Z]");
        }
        System.out.println(Arrays.toString(str));

        ClassString check = new ClassString();
//        System.out.println(" nhập đoạn vawnc cần check");
//        String str1 = scanner.nextLine();
//        boolean check1 = check.checkInput(str1);
//        System.out.println(" đoạn văn: " + str1 + " sau khi kiểm tra: " + check1);

       check.inputName();

    }


    // check name
 private static final  String REGEX ="^([A-Za-zàáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]+ )+" +
            "[A-Za-zàáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]+$";
    public boolean checkInput(String str){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public String inputName() {
        String name;
        System.out.println(" Nhập tên");
        name = scanner.nextLine();
        if (name.isEmpty()) {
            System.out.println(" Tên không được để trống.");
            return
            inputName();
        }Boolean checkname = checkInput(name);
        if (!checkname) {
            System.out.println(" Tên không được chứa các ký tự đặc biệt");
            return
            inputName();
        }else {
            System.out.println(" tên đúng: " + name);
            return name;
        }

    }


}
