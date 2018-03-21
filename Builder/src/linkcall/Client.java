package linkcall;

public class Client {
    public static void main(String[] args) {
        new AlertDialog.Builder()
                .setTitle("Builder")
                .setView(new View("FakeView"))
                .setIcon(1)
                .setMessage("stupid fake message.")
                .show();
    }
}
