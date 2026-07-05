// iqra abdirahman ali  
c6240273
import java.util.Scanner;

public class jeeb {

    private static final String CORRECT_PIN = "1111";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--- USSD Dialer ---");
        System.out.print("Dial USSD Code (e.g., *810#): ");
        String ussdCode = scanner.nextLine();

        if (ussdCode.equals("*810#")) {
            handlePinScreen();
        } else {
            System.out.println("Connection problem or invalid MMI code.");
        }
    }

    private static void handlePinScreen() {
        System.out.println("\n=======================");
        System.out.println("-JEEB-");
        System.out.println("Fadlan geli PIN-kaaga (Enter PIN)");
        System.out.println("=======================");
        System.out.print("Enter PIN: ");
        String enteredPin = scanner.nextLine();

        if (enteredPin.equals(CORRECT_PIN)) {
            showMainMenu();
        } else {
            System.out.println("\n[Error]: PIN-kaaga waa khalad. Exiting...");
        }
    }

    private static void showMainMenu() {
        boolean running = true;

        while (running) {
            System.out.println("\n=======================");
            System.out.println("JEEB MAIN MENU");
            System.out.println("1. Itus Haraaga");
            System.out.println("2. Kaarka hadalka");
            System.out.println("3. Kaarka Internet");
            System.out.println("4. Lacag Dirid");
            System.out.println("5. Bixi Biil");
            System.out.println("6. Warbixin Kooban");
            System.out.println("7. Banks");
            System.out.println("8. TAAJ");
            System.out.println("9. Maareynta");
            System.out.println("0. KaBax (Exit)");
            System.out.println("=======================");
            System.out.print("Dooro (0-9): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\n-> Haraagaagu waa: $150.25");
                    break;
                case "2":
                    menuKaarkaHadalka();
                    break;
                case "3":
                    menuKaarkaInternet();
                    break;
                case "4":
                    menuLacagDirid();
                    break;
                case "5":
                    menuBixiBiil();
                    break;
                case "6":
                    menuWarbixinKooban();
                    break;
                case "7":
                    menuBanks();
                    break;
                case "8":
                    menuTaaj();
                    break;
                case "9":
                    menuMaareynta();
                    break;
                case "0":
                    System.out.println("\nWaad ku mahadsantahay isticmaalka JEEB! Macasalaama.");
                    running = false;
                    break;
                default:
                    System.out.println("\n[Error]: Dooq khaldan. Fadlan isku day markale.");
                    break;
            }

            if (running) {
                System.out.print("\nTaabo Enter si aad ugu laabato Main Menu...");
                scanner.nextLine();
            }
        }
    }

    private static void menuKaarkaHadalka() {
        System.out.println("\n--- 2. Kaarka Hadalka ---");
        System.out.println("1. Ku shubo Mobile-kaaga");
        System.out.println("2. U ku shub Mobile kale");
        System.out.println("0. Ka bax (Back)");
        System.out.print("Dooro: ");
        String kuShubo = scanner.nextLine();

        if (kuShubo.equals("0")) return;

        String num = "Mobile-kaaga";
        if (kuShubo.equals("2")) {
            System.out.print("Geli Mobile-ka ku shubaneyso (ama 0 si aad u baxdo): ");
            num = scanner.nextLine();
            if (num.equals("0")) return;
        }

        if (kuShubo.equals("1") || kuShubo.equals("2")) {
            System.out.print("Geli lacagta ($) ama riix 0 si aad u baxdo: ");
            String lacag = scanner.nextLine();
            if (lacag.equals("0")) return;

            System.out.println("\n--- XAQIIJI ---");
            System.out.println("Ma hubtaa inaad $" + lacag + " oo hadal ah ku shubto " + num + "?");
            System.out.println("1. Haa (Yes)");
            System.out.println("2. Maya (No)");
            System.out.print("Dooro: ");
            String confirm = scanner.nextLine();

            if (confirm.equals("1")) {
                System.out.println("\n-> Si guul leh ayaad ugu shubtay $" + lacag + " oo hadal ah. Mahadsanid.");
            } else {
                System.out.println("\n-> Hawshii waa laga laabtay (Cancelled).");
            }
        }
    }

    private static void menuKaarkaInternet() {
        System.out.println("\n--- 3. Kaarka Internet ---");
        System.out.println("1. Xidmo Maalinle ($0.50 - 500MB)");
        System.out.println("2. Xidmo Wiiglile ($2.00 - 3GB)");
        System.out.println("3. Xidmo Bile ah ($10.00 - 20GB)");
        System.out.println("0. Ka bax (Back)");
        System.out.print("Dooro: ");
        String internet = scanner.nextLine();

        if (internet.equals("0")) return;

        String xidmoName;
        switch (internet) {
            case "1":
                xidmoName = "Xidmo Maalinle ($0.50)";
                break;
            case "2":
                xidmoName = "Xidmo Wiiglile ($2.00)";
                break;
            case "3":
                xidmoName = "Xidmo Bile ah ($10.00)";
                break;
            default:
                System.out.println("\n[Error]: Dooq khaldan.");
                return;
        }

        System.out.println("\n--- XAQIIJI ---");
        System.out.println("Ma hubtaa inaad iibsato " + xidmoName + "?");
        System.out.println("1. Haa (Yes)");
        System.out.println("2. Maya (No)");
        System.out.print("Dooro: ");
        String confirm = scanner.nextLine();

        if (confirm.equals("1")) {
            System.out.println("\n-> Codsigaagii waa la aqbalay. Xidmadii Internet-ka waa kuu firfircoon tahay.");
        } else {
            System.out.println("\n-> Hawshii waa laga laabtay.");
        }
    }

    private static void menuLacagDirid() {
        System.out.println("\n--- 4. Lacag Dirid ---");
        System.out.print("Geli Mobile-ka lacagta loo dirayo (ama riix 0 si aad u baxdo): ");
        String num = scanner.nextLine();
        if (num.equals("0")) return;

        System.out.print("Geli lacagta ($): ");
        String lacag = scanner.nextLine();
        if (lacag.equals("0")) return;

        System.out.println("\n--- XAQIIJI DIFAACA ---");
        System.out.println("Ma hubtaa inaad $" + lacag + " u wareejiso number-ka " + num + "?");
        System.out.println("1. Haa (Yes)");
        System.out.println("2. Maya (No)");
        System.out.print("Dooro: ");
        String confirm = scanner.nextLine();

        if (confirm.equals("1")) {
            System.out.println("\n-> Waxaad $" + lacag + " u dirtay " + num + " si guul leh. Mahadsanid.");
        } else {
            System.out.println("\n-> Hawshii lacag dirista ahayd waa laga laabtay (Cancelled).");
        }
    }

    private static void menuBixiBiil() {
        System.out.println("\n--- 5. Bixi Biil ---");
        System.out.println("1. Biilka Korontada (SomPower)");
        System.out.println("2. Biilka Biyaha");
        System.out.println("3. Jaamacado / Iskuulo");
        System.out.println("0. Ka bax (Back)");
        System.out.print("Dooro: ");
        String biil = scanner.nextLine();

        if (biil.equals("0")) return;

        System.out.print("Geli Account Number-ka biilka: ");
        String accNum = scanner.nextLine();
        System.out.print("Geli lacagta biilka ($): ");
        String lacag = scanner.nextLine();

        System.out.println("\n--- XAQIIJI BIILKA ---");
        System.out.println("Ma hubtaa inaad $" + lacag + " ku bixiso biilka account-kiisu yahay " + accNum + "?");
        System.out.println("1. Haa (Yes)");
        System.out.println("2. Maya (No)");
        System.out.print("Dooro: ");
        String confirm = scanner.nextLine();

        if (confirm.equals("1")) {
            System.out.println("\n-> Biilkaagii oo dhex galka ahaa waa la bixiyay. Mahadsanid.");
        } else {
            System.out.println("\n-> Hawshii bixinta biilka waa laga laabtay.");
        }
    }

    private static void menuWarbixinKooban() {
        System.out.println("\n--- 6. Warbixin Kooban (Mini Statement) ---");
        System.out.println("1. Last Transaction: Sent $10 to 615XXXXXX");
        System.out.println("2. Received $50 from 612XXXXXX");
        System.out.println("3. Paid Bill $15 to SomPower");
        System.out.println("0. Ka bax (Back)");
        System.out.print("Dooro 0 si aad u baxdo: ");
        scanner.nextLine();
    }

    private static void menuBanks() {
        System.out.println("\n--- 7. Banks ---");
        System.out.println("1. Ku wareeji Bank (To Bank)");
        System.out.println("2. Ka soo qaado Bank (From Bank)");
        System.out.println("0. Ka bax (Back)");
        System.out.print("Dooro: ");
        String bank = scanner.nextLine();

        if (bank.equals("0")) return;

        System.out.print("Geli Account-ka Bankiga: ");
        String bankAcc = scanner.nextLine();
        System.out.print("Geli lacagta ($): ");
        String lacag = scanner.nextLine();

        System.out.println("\n--- XAQIIJI XAALADDA BANGIGA ---");
        System.out.println("Ma hubtaa lacagta $" + lacag + " inaad u raddo/ka soo qaaddo account " + bankAcc + "?");
        System.out.println("1. Haa (Yes)");
        System.out.println("2. Maya (No)");
        System.out.print("Dooro: ");
        String confirm = scanner.nextLine();

        if (confirm.equals("1")) {
            System.out.println("\n-> Lacagtaadii iyo xiriirkii bankiga si guul leh ayaa loo dhammaystiray.");
        } else {
            System.out.println("\n-> Hawshii bankiga waa la joojiyay.");
        }
    }

    private static void menuTaaj() {
        System.out.println("\n--- 8. TAAJ Remittance ---");
        System.out.println("1. Lacag u dir dalka gudihiisa");
        System.out.println("2. Lacag u dir dibadda (International)");
        System.out.println("0. Ka bax (Back)");
        System.out.print("Dooro: ");
        String taaj = scanner.nextLine();

        if (taaj.equals("0")) return;

        System.out.print("Geli magaca qaataha: ");
        String magac = scanner.nextLine();
        System.out.print("Geli lacagta ($): ");
        String lacag = scanner.nextLine();

        System.out.println("\n--- XAQIIJI TAAJ ---");
        System.out.println("Ma hubtaa inaad $" + lacag + " u dirto " + magac + "?");
        System.out.println("1. Haa (Yes)");
        System.out.println("2. Maya (No)");
        System.out.print("Dooro: ");
        String confirm = scanner.nextLine();

        if (confirm.equals("1")) {
            System.out.println("\n-> Xawaaladdii TAAJ si guul leh ayay u gudubtay.");
        } else {
            System.out.println("\n-> Hawshii TAAJ waa la baajiyay.");
        }
    }

    private static void menuMaareynta() {
        System.out.println("\n--- 9. Maareynta (Account Management) ---");
        System.out.println("1. Bedel PIN-ka (Change PIN)");
        System.out.println("2. Bedel Luqadda (Language)");
        System.out.println("0. Ka bax (Back)");
        System.out.print("Dooro: ");
        String maarayn = scanner.nextLine();

        if (maarayn.equals("0")) return;

        if (maarayn.equals("1")) {
            System.out.print("Geli PIN-kaaga hadda: ");
            String current = scanner.nextLine();
            if (!current.equals(CORRECT_PIN)) {
                System.out.println("\n[Error]: PIN-ka hadda kuu jooga waa khalad.");
                return;
            }
            System.out.print("Geli PIN-ka cusub (ama riix 0 si aad u baxdo): ");
            String newPin = scanner.nextLine();
            if (newPin.equals("0")) return;

            System.out.println("\n--- XAQIIJI BEDELKA PIN ---");
            System.out.println("Ma hubtaa inaad bedesho PIN-kaaga?");
            System.out.println("1. Haa (Yes)");
            System.out.println("2. Maya (No)");
            System.out.print("Dooro: ");
            String confirm = scanner.nextLine();

            if (confirm.equals("1")) {
                System.out.println("\n-> PIN-kaaga si guul leh ayaa loo bedelay.");
            } else {
                System.out.println("\n-> Hawshii waa laga laabtay.");
            }
        } else if (maarayn.equals("2")) {
            System.out.println("\nLuqadda waxaa loo bedelay English/Somali.");
        }
    }
}
