
public class Client {
    public static void main(String[] args) {
        InputStream inputStream = new FileInputStream();
//        inputStream.read();

        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
//        bufferedInputStream.read();

        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        dataInputStream.readInt();
    }

}
