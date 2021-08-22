public class HelpClassDemo {

    public static void main(String args[])
        throws java.io.IOException {
        char choice, ignore;
        Help helpobj = new Help();

        for(;;) {
            do {
                helpobj.showMenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!helpobj.isValid(choice));

            if (choice == 'q') break;
            System.out.println("\n");
            helpobj.helpOn(choice);
        }
    }
}
