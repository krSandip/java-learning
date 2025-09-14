import java.io.*;

public class f5files {
    public static void main(String[] args) {
        // create file
        try{
            File fo = new File("createdFile.txt");
            fo.createNewFile();
        }catch (IOException e){
            System.out.println("Exception encountered : " +e.getMessage());
        }

        // write into the file
        try{
            FileWriter fw = new FileWriter("createdFile.txt");
            fw.write("its me sandeep");
            fw.close();
        }catch (IOException e){
            System.out.println("Exception encountered : " +e.getMessage());
        }

        // read from the file
        try(BufferedReader br = new BufferedReader(new FileReader("createdFile.txt"))){
            while(br.ready()){
                System.out.print("createdFile contains : " +br.readLine());
            }
        }catch (IOException e){
            System.out.println("Exception encountered : " +e.getMessage());
        }
    }
}
