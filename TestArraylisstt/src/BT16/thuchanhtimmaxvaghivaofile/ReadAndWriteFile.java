package BT16.thuchanhtimmaxvaghivaofile;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String files) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(files);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("File không tồn tại.");
        }
        return numbers;
    }

    public void writeFile(String files, int max) {
        try {
            FileWriter writer = new FileWriter(files, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là:" + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

        public static void main (String[]args){
            ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
            List<Integer> numbers = readAndWriteFile.readFile("E:\\TestArraylisst\\TestArraylisstt\\src\\BT16\\thuchanhtimmaxvaghivaofile\\numberMax.txt");
            int maxValue = findMax(numbers);
            readAndWriteFile.writeFile("E:\\TestArraylisst\\TestArraylisstt\\src\\BT16\\thuchanhtimmaxvaghivaofile\\numberMax.txt" , maxValue);
        }
}
