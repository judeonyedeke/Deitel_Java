package JavaWeekends;

import java.util.Scanner;

public class Phone3310 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        menu();
    }

    private static void chat() {
        System.out.println("Chat\n" +
                "Enter 0 to go back to main menu");

        int a = input.nextInt();

        if (a == 0) {
            menu();
        }
    }

    private static void messages() {
        System.out.println("Messages\n" +
                "1. Write messages\n" +
                "2. Inbox\n" +
                "3. Outbox\n" +
                "4. Picture messages\n" +
                "5. Templates\n" +
                "6. Smileys\n" +
                "7. Messages settings\n" +
                "Enter 7 for message settings\n" +
                "Enter 0 to go back to menu\n" +
                "Enter 00 to go back to previous menu");

        int a = input.nextInt();

        if (a == 7) {
            System.out.println("Message setting\n" +
                    "1. Set1\n" +
                    "2. Common\n" +
                    "Enter 0 to go back to menu\n" +
                    "Enter 00 to go back to previous menu");

            int b = input.nextInt();

            if (b == 0) {
                menu();

                int c = input.nextInt();

                if (c == 00) {
                    messages();
                }
            }
        }
    }


    private static void phonebook() {

        System.out.println("" +
                "Phone Book\n" +
                "1. Search\n" +
                "2. Service Nos.\n" +
                "3. Add name\n" +
                "4. Erase\n" +
                "5. Edit\n" +
                "6. Assign tone\n" +
                "7. Send b'card\n" +
                "8. Options\n" +
                "9. Speed dials\n" +
                "10. Voice tags\n" +
                "Enter 8 to see more options\n" +
                "Enter 0 to go back to main menu");

        int a = input.nextInt();

        if (a == 8) {

            System.out.println("Options\n" +
                    "1. Type of View\n" +
                    "2. Memory status\n" +
                    "Enter 0 to go back to main menu\n" +
                    "Enter 00 to go back to previous menu");

            int b = input.nextInt();

            if (b == 0) {
                menu();

                int c = input.nextInt();

                if (c == 00) {
                    phonebook();
                }
            }
        }
    }

    private static void menu() {

        System.out.println("Menu\n 1. Phonebook\n 2. Messages\n 3. Chat\n 4. Call Register\n 5. Tones\n " +
                "6. Settings\n 7. Call Divert\n 8. Games\n 9. Calculator\n 10. Reminders\n 11. Clock\n 12. Profiles\n " +
                "13. Sim Services\n Enter 1 to 13");

        int menu = input.nextInt();

        switch (menu) {
            case 1:
                phonebook();
            case 2:
                messages();
            case 3:
                chat();
            case 4:
                callRegister();
        }
    }

    private static void callRegister() {
        System.out.println("Chat Register\n" +
                "1. Missed calls\n" +
                "2. Received calls\n" +
                "3. Dialled numbers\n" +
                "4. Erase recent call cost\n" +
                "-5. Show call duration\n" +
                "-6. Show call costs\n" +
                "-7. Call cost settings\n" +
                "8. Prepaid credit");

        int a = input.nextInt();

        if (a == 5) {
            System.out.println("Show call duration\n" +
                    "1. Last call duration\n" +
                    "2. All calls' duration\n" +
                    "3. Received calls' duration\n" +
                    "4. Dialled calls' duration\n" +
                    "5. Clear timers");

            int a1 = input.nextInt();

            if (a1 == 0) {
                menu();

                int a2 = input.nextInt();

                if (a2 == 00) {
                    callRegister();
                }
            }

        } else if (a == 6) {
                System.out.println("Show call cost\n" +
                        "1. Last call cost\n" +
                        "2. All calls cost\n" +
                        "3. Clear counters");
            int a1 = input.nextInt();

            if (a1 == 0) {
                menu();

                int a2 = input.nextInt();

                if (a2 == 00) {
                    callRegister();
                }
            }

        } else if (a == 7) {
            System.out.println("Call cost settings\n" +
                    "1. Call cost limit\n" +
                    "2. Show cost in");
            int a1 = input.nextInt();

            if (a1 == 0) {
                menu();

                int a2 = input.nextInt();

                if (a2 == 00) {
                    callRegister();
                }
            }
        }
    }
}
