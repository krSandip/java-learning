import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class f1byteStream {

    static void inputByteStream(){
        try {
            int size=0;
            InputStream in = new FileInputStream("C:/Users/sandeep kumar/OneDrive/Desktop/java/javaCore/m10fileHandling/src/inputFile.txt");
            while(in.read() != -1){
                size++;
            }
            in.close();
            System.out.println("The size of array is "+size);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void outputByteStream(){
        try {
            int size=0;
            int i = 0;
            InputStream in = new FileInputStream("C:/Users/sandeep kumar/OneDrive/Desktop/java/javaCore/m10fileHandling/src/inputFile.txt");
            OutputStream out = new FileOutputStream("C:/Users/sandeep kumar/OneDrive/Desktop/java/javaCore/m10fileHandling/src/outputFile.txt");
            while((i= in.read()) != -1){
                size++;
                out.write(i);
            }
            in.close();
            System.out.println("The size of array is "+size);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void outputByteStream2(){
        try {
            int size=0;
            int i = 0;
            byte[] arr = new byte[2];
            InputStream in = new FileInputStream("C:/Users/sandeep kumar/OneDrive/Desktop/java/javaCore/m10fileHandling/src/inputFile.txt");
            OutputStream out = new FileOutputStream("C:/Users/sandeep kumar/OneDrive/Desktop/java/javaCore/m10fileHandling/src/outputFile2.txt");
            while((i= in.read(arr)) != -1){
                size++;
                out.write(arr,0, i);
            }
            in.close();
            System.out.println("The size of array is "+size);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        inputByteStream();
//        outputByteStream();
//        outputByteStream2();
    }
}
