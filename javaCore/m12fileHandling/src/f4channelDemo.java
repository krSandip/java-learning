import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class f4channelDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:/Users/sandeep kumar/OneDrive/Desktop/java/javaCore/m10fileHandling/src/inputImage.jpg");
            FileOutputStream fout = new FileOutputStream("C:/Users/sandeep kumar/OneDrive/Desktop/java/javaCore/m10fileHandling/src/outputImage.jpg");

            // for channel stream
            FileChannel in = fin.getChannel();
            FileChannel out = fout.getChannel();
            long start=0;
            int bufferSize=2048;
            ByteBuffer buff = ByteBuffer.allocate(bufferSize);
            start= System.nanoTime();
//            while(in.read(buff) > 0){
//                buff.flip();
//                out.write(buff);
//                buff.clear();
//            }
//            System.out.println("Time taken(ms) is "+((System.nanoTime()-start)/1000000));

            // for byte stream
//            long start = 0;
//            int byteCount = 0;
//            start = System.nanoTime();
//            while((byteCount = fin.read()) > -1){
//                fout.write(byteCount);
//            }
//            System.out.println("Time taken(ms) is "+((System.nanoTime()-start)/1000000));

            // in-built method
            in.transferTo(0, in.size(), out);
            System.out.println("Time taken(ms) is "+((System.nanoTime()-start)/1000000));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
