package BT19.thuchanhcrawldanhsachbaihat;

import javax.swing.*;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
                // mở đường dẫn và đọc bằng lệnh BufferedReader
            Scanner scanner= new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String noiDung = scanner.next();  // noi dung = content
            // đóng lại scanner
            scanner.close();
            // xoa tất cả các dòng   remove all new line
            noiDung = noiDung.replaceAll("\\n+", " ");
            // biểu thức regex
            Pattern p = Pattern.compile("name_song\\\">(.*?)</a>");
            Matcher m = p.matcher(noiDung);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
