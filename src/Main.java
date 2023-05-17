// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double drip_coffe = 2.9;
        double latte = 3.5;
        double cappucino = 0.9;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //
        //System.out.print(customer1 + pendingMessage);

        if (isReadyOrder4){
            System.out.println(customer4 + readyMessage +  '\n' + displayTotalMessage+' '+cappucino);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        if (isReadyOrder2){
            System.out.println(customer2 + readyMessage +  '\n' + displayTotalMessage+' '+latte*2);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        if (isReadyOrder3){
            System.out.println(customer3 + readyMessage +  '\n' + displayTotalMessage+' '+drip_coffe);
            System.out.println('\n' + displayTotalMessage+' '+latte);
        } else {
            System.out.println(customer3 + pendingMessage);
        }

    }
}