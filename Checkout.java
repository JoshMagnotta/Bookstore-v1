package magnottajoshproject1.book;

import java.util.*;

public class Checkout {


    public static void main(String[] args) {
        Books book = new Books();
        CDs cd = new CDs();
        DVDs dvd = new DVDs();
        Memberships membership = new Memberships();
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> ShoppingCartName = new ArrayList<>();
        ArrayList<Double> ShoppingCartPrice = new ArrayList<>();

        // Creates starter inventory
        // ****DO NOT DELETE****
        book.createBookInventory();
        cd.createCDInventory();
        dvd.createDVDInventory();

        // create an if statement to see if they want to checkout or enter Staff POS to
        // make changes
        // Consider asking for a passcode if they want to make changes
        System.out.println("Welcome to my bookstore!");

        boolean purchaseComplete = false;
        boolean inputBool = false;
        double total = 0;
        Boolean premium = false;
        int input = 0;
        int answer = 0;

        System.out.println(
                "What are you shopping for today? \nEnter 1 for Books, 2 for CDs, or 3 for DVDs.\nIf you would like to enter the staff system enter 4.");
        answer = scnr.nextInt();
        if (answer == 4) {
            System.out.println("Welcome to the staff system. Which setting would you like to change?");
            System.out.println("Press 1 to add a product, 2 to change a product or 3 to decrement product stock ");
            input = scnr.nextInt();

            switch (input) {
                case 1 -> {
                    System.out.println("Press 1 to add a book, 2 to add a CD, or 3 to add a DVD.");
                    input = scnr.nextInt();
                    if (input == 1) {
                        System.out.println("What is the name of the book?");
                        scnr.nextLine(); // Consume overflow
                        String name = scnr.nextLine();
                        System.out.println("Who is the author of the book?");
                        String author = scnr.nextLine();
                        System.out.println("What is the price of the book?");
                        double price = scnr.nextInt();
                        System.out.println("How many copies do you have?");
                        int copies = scnr.nextInt();
                        book.addBook(name, author, price, copies);
                    }

                    if (input == 2) {
                        System.out.println("What is the name of the album?");
                        scnr.nextLine(); // Consume overflow
                        String name = scnr.nextLine();
                        System.out.println("Who is the artist of the album?");
                        String artist = scnr.nextLine();
                        System.out.println("What is the price of the CD?");
                        double price = scnr.nextInt();
                        System.out.println("How many copies do you have?");
                        int copies = scnr.nextInt();
                        cd.addCD(name, artist, price, copies);
                    }

                    if (input == 3) {
                        System.out.println("What is the name of the DVD?");
                        scnr.nextLine(); // Consume overflow
                        String name = scnr.nextLine();
                        System.out.println("What is the production company of the DVD?");
                        String company = scnr.nextLine();
                        System.out.println("What is the price of the DVD?");
                        double price = scnr.nextInt();
                        System.out.println("How many copies do you have?");
                        int copies = scnr.nextInt();
                        dvd.addDVD(name, company, price, copies);
                    }
                }

                case 2 -> {
                    System.out.println("Please enter 1 to change a book, 2 to change a CD, or 3 to change a DVD.");
                    input = scnr.nextInt();
                    if (input == 1) {
                        for (int i = 0; i < book.getBookName().size(); i++) {
                            System.out.println("#" + i + " " + book.getBookName(i));
                        }
                        System.out.println("Which book would you like to change?");
                        input = scnr.nextInt();
                        System.out.println("Enter the new name of the book");
                        String name = scnr.nextLine();
                        System.out.println("Enter the new author of the book");
                        String author = scnr.nextLine();
                        System.out.println("Enter the new price of the book");
                        double price = scnr.nextDouble();
                        System.out.println("Enter the copies for the book");
                        int copies = scnr.nextInt();

                        book.updateBook(input, name, author, price, copies);
                    }

                    if (input == 2) {
                        for (int i = 0; i < cd.getCDName().size(); i++) {
                            System.out.println("#" + i + " " + cd.getCDName(i));
                        }
                        System.out.println("Which cd would you like to change?");
                        input = scnr.nextInt();
                        System.out.println("Enter the new name of the cd");
                        String name = scnr.nextLine();
                        System.out.println("Enter the new artist of the cd");
                        String author = scnr.nextLine();
                        System.out.println("Enter the new price of the cd");
                        double price = scnr.nextDouble();
                        System.out.println("Enter the copies for the cd");
                        int copies = scnr.nextInt();

                        cd.updateCD(input, name, author, price, copies);
                    }

                    if (input == 3) {
                        for (int i = 0; i < dvd.getDVDName().size(); i++) {
                            System.out.println("#" + i + " " + dvd.getDVDName(i));
                        }
                        System.out.println("Which dvd would you like to change?");
                        input = scnr.nextInt();
                        System.out.println("Enter the new name of the dvd");
                        String name = scnr.nextLine();
                        System.out.println("Enter the new author of the dvd");
                        String author = scnr.nextLine();
                        System.out.println("Enter the new price of the dvd");
                        double price = scnr.nextDouble();
                        System.out.println("Enter the copies for the dvd");
                        int copies = scnr.nextInt();

                        dvd.updateDVD(input, name, author, price, copies);

                    }
                }

                case 3 -> {
                    System.out.println(
                            "Press enter 1 to decrement a book, 2 to decrement a CD, or 3 to decrement a DVD.");
                    input = scnr.nextInt();
                    if (input == 1) {
                        for (int i = 0; i < book.getBookName().size(); i++) {
                            System.out.println("#" + i + " " + book.getBookName(i));
                        }

                        System.out.println("Please enter the number for the book you want to decrement.");
                        input = scnr.nextInt();
                        book.decrementBook(input);
                    }
                    if (input == 2) {
                        for (int i = 0; i < cd.getCDName().size(); i++) {
                            System.out.println("#" + i + " " + cd.getCDName(i));
                        }

                        System.out.println("Please enter the number for the cd you want to decrement.");
                        input = scnr.nextInt();
                        cd.decrementCD(input);
                    }

                    if (input == 3) {
                        for (int i = 0; i < dvd.getDVDName().size(); i++) {
                            System.out.println("#" + i + " " + dvd.getDVDName(i));
                        }

                        System.out.println("Please enter the number for the dvd you want to decrement.");
                        input = scnr.nextInt();
                        dvd.decrementDVD(input);
                    }
                }
                default -> {
                    System.out.println("Please only numbers 1, 2, or 3.");
                }
            }

            System.out.println("Are you done making changes?");
            purchaseComplete = scnr.nextBoolean();
        }

        while (!purchaseComplete) {

            // Check to make sure input is valid
            while (answer < 1 || answer > 4) {
                System.out.println("Oops! Please only enter a 1, 2, 3, or 4");
                input = scnr.nextInt();
            }

            // books
            if (answer == 1) {
                int userInput = 0;
                System.out.println("Here are all of our books we have available");
                for (int i = 0; i < book.getBookName().size(); i++) {
                    if (book.getBookCopies(i) > 0)
                        System.out.println("#" + (i + 1) + ": " + book.getBookName(i) + " by " + book.getAuthorName(i)
                                + " - $ " + book.getBookPrice(i) + " - Copies: " + book.getBookCopies(i));
                    else
                        System.out.println("#" + (i + 1) + ": Out of stock.");
                }

                System.out.println("Which book would you like to purchase? Please input the book number.");
                userInput = scnr.nextInt() - 1;

                if (book.getBookCopies(userInput) <= 0) {
                    // create a reserve system
                    System.out.println(
                            "Sorry! We do not have the book you tried to over in stock.\nWould you like to reserve a copy? Input true or false.");

                    inputBool = scnr.nextBoolean();
                    if (inputBool) {
                        book.reserveBook(userInput);
                        book.decrementBook(userInput);
                        System.out.println(
                                "Thank you. We have reserved this book for you and will notice you once we have it back in stock.");
                    } else
                        System.out.println("Sorry again that we do not currenty have what you are looking for.");
                }

                else {
                    // Create a seperate arraylist holding their shopping cart
                    ShoppingCartName.add(book.getBookName(userInput));
                    ShoppingCartPrice.add(book.getBookPrice(userInput));
                    total += book.getBookPrice(userInput);

                    // update the UpdateBook method to remove a copy
                    book.decrementBook(userInput);
                }
            }

            // CDs
            if (answer == 2) {
                System.out.println("Here are all of our CDs we have available");
                int userInput = 0;
                for (int i = 0; i < cd.getCDName().size(); i++) {
                    if (cd.getCDCopies(i) > 0)
                        System.out.println("#" + (i + 1) + ": " + cd.getCDName(i) + " by " + cd.getArtistName(i)
                                + " - $ " + cd.getCDPrice(i) + " - Copies: " + cd.getCDCopies(i));
                    else
                        System.out.println("#" + (i + 1) + ": Out of stock.");
                }

                System.out.println("Which CD would you like to purchase? Please input the cd number.");
                userInput = scnr.nextInt() - 1;

                if (cd.getCDCopies(userInput) <= 0) {
                    // reserve system
                    System.out.println(
                            "Sorry! We do not have the CD you tried to over in stock.\nWould you like to reserve a copy? Input true or false.");

                    inputBool = scnr.nextBoolean();
                    if (inputBool) {
                        cd.reserveCD(userInput);
                        cd.decrementCD(userInput);
                        System.out.println(
                                "Thank you. We have reserved this CD for you and will notice you once we have it back in stock.");
                    } else
                        System.out.println("Sorry again that we do not currenty have what you are looking for.");
                }

                else {
                    // Create a seperate arraylist holding their shopping cart
                    ShoppingCartName.add(cd.getCDName(userInput));
                    ShoppingCartPrice.add(cd.getCDPrice(userInput));
                    total += cd.getCDPrice(userInput);

                    // update the UpdateCD method to remove a copy
                    cd.decrementCD(userInput);
                }
            }

            // DVDs
            if (answer == 3) {
                System.out.println("Here are all of our DVDs we have available");
                int userInput = 0;
                for (int i = 0; i < dvd.getDVDName().size(); i++) {
                    if (dvd.getDVDCopies(i) > 0)
                        System.out.println("#" + (i + 1) + ": " + dvd.getDVDName(i) + " by " + dvd.getCompanyName(i)
                                + " - $ " + dvd.getDVDPrice(i) + " - Copies: " + dvd.getDVDCopies(i));
                    else
                        System.out.println("#" + (i + 1) + ": Out of stock.");
                }

                System.out.println("Which DVD would you like to purchase? Please input the DVD number.");
                userInput = scnr.nextInt() - 1;

                if (dvd.getDVDCopies(userInput) <= 0) {
                    // reserve system
                    System.out.println(
                            "Sorry! We do not have the DVD you tried to over in stock.\nWould you like to reserve a copy? Input true or false.");

                    inputBool = scnr.nextBoolean();
                    if (inputBool) {
                        dvd.reserveDVD(userInput);
                        dvd.decrementDVD(userInput);
                        System.out.println(
                                "Thank you. We have reserved this DVD for you and will notice you once we have it back in stock.");
                    } else
                        System.out.println("Sorry again that we do not currenty have what you are looking for.");
                }

                else {
                    // Create a seperate arraylist holding their shopping cart
                    ShoppingCartName.add(dvd.getDVDName(userInput));
                    ShoppingCartPrice.add(dvd.getDVDPrice(userInput));
                    total += dvd.getDVDPrice(userInput);

                    // update the UpdateDVD method to remove a copy
                    dvd.decrementDVD(userInput);
                }

            }

            System.out.println("Have you finished shopping? Input true or false.");
            purchaseComplete = scnr.nextBoolean();

            if (!purchaseComplete) {
                System.out.println(
                        "What are you shopping for today? \nEnter 1 for Books, 2 for CDs, or 3 for DVDs.\nIf you would like to enter the staff system enter 4.");
                input = scnr.nextInt();
            }

        }

        if (answer != 4) {
            // membership
            System.out.println("Are you a part of our membership program? Input true or false.");
            inputBool = scnr.nextBoolean();
            String username = "";

            if (inputBool) {
                System.out.println("What is your name? ");
                scnr.nextLine();
                username = scnr.nextLine();
                if (membership.findMemberID(username) != -1) {
                    System.out.println("Thank you.");
                } else {
                    System.out.println("Sorry, we couldn't find your account. ");
                    System.out.println("Would you like to create an account? Input true or false.");
                    inputBool = scnr.nextBoolean();

                    if (inputBool) {
                        System.out.println("What is your name? ");
                        scnr.nextLine();
                        username = scnr.nextLine();
                        System.out.println(
                                "Would you like a premium membership? The premium membership is a one time fee of $4.99. \nInput true or false.");
                        premium = scnr.nextBoolean();
                        membership.addMember(username, premium);
                    }
                }
            }

            else {
                System.out.println("Would you like to create an account? Input true or false.");
                inputBool = scnr.nextBoolean();

                if (inputBool) {
                    System.out.println("What is your name? ");
                    scnr.nextLine();
                    username = scnr.nextLine();
                    System.out.println(
                            "Would you like a premium membership? The premium membership is a one time fee of $4.99. \nInput true or false.");
                    premium = scnr.nextBoolean();
                    membership.addMember(username, premium);
                }
            }

            // checkout
            if (!ShoppingCartName.isEmpty()) {
                System.out.println("Here are the items in your shopping cart. ");

                for (int i = 0; i < ShoppingCartName.size(); i++) {
                    System.out.println(ShoppingCartName.get(i) + ": $" + ShoppingCartPrice.get(i));

                }

                if (premium) {
                    System.out.println("One time membership fee: $4.99");
                    total += 4.99;
                }

                boolean freeBook = false;
                if (membership.getMemberStatus(username)) {
                    System.out.println("Thank you for being a premium member.");
                    if (membership.getMemberPoints(username) > 100) {
                        System.out.println("You are eligible for a free book.");
                        freeBook = true;
                    } else
                        System.out.println("You are not eligible for a free book.");
                }

                else {
                    if (membership.getMemberPoints(username) > 150) {
                        System.out.println("You are eligible for a free book.");
                        freeBook = true;
                    }

                    else
                        System.out.println("You are not eligible for a free book.");
                }

                System.out.println("Your total comes out to: $" + total);

                if (membership.findMemberID(username) != -1) {
                    membership.addMemberPoints(username, total);
                    System.out.println((int) (total) + " points have been added to your account.");

                }
                System.out.println("Thank you for your purchase.");
            }

            else
                System.out.println("Sorry you couldn't find what you are looking for. We hope you come back later!");
        }
    }
}
