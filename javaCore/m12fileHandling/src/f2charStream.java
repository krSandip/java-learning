import java.io.*;

public class f2charStream {

    static void charReaderWriter(){
        try {
            int i=0;
            int size = 0;
            char[] charArr = new char[256];
            FileReader fin = new FileReader("C:/Users/sandeep kumar/OneDrive/Desktop/java/javaCore/m10fileHandling/src/inputFile.txt");
            PrintWriter pw = new PrintWriter(System.out);

            while((i=fin.read(charArr))!= -1){
                size++;
                pw.write(charArr, 0, i);
            }
            fin.close();pw.close();
            System.out.println("size is : " +size);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void bufferedReaderWrite(){
        try {
            String str="";
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/sandeep kumar/OneDrive/Desktop/java/javaCore/m10fileHandling/src/inputFile.txt"));
            BufferedWriter wr = new BufferedWriter(new FileWriter("C:/Users/sandeep kumar/OneDrive/Desktop/java/javaCore/m10fileHandling/src/outputFile.txt"));
            while((str=br.readLine()) != null){
                wr.write(str);wr.newLine();
            }
            br.close();wr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        charReaderWriter();
        bufferedReaderWrite();
    }
}
