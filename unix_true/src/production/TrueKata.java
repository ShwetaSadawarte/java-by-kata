public class TrueKata {
    public static void main(String[] args) {
        Boolean status = true;
        printResult(status);
    }

    static void printResult(boolean status) {
        if (status) {
            System.err.println("Exit status true");
            System.exit(0); //Success
        }
        else {
            System.exit(1); //failure
        }
    }
}
