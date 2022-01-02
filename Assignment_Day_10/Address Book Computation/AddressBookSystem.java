import java.util.ArrayList;

import java.util.Arrays;

import java.util.Scanner;

import java.util.Iterator;

public class AddressBookSystem {

    // Create an arraylist of arraylist to store contact details of all the persons

    private static final ArrayList<ArrayList <String>> address_book = new ArrayList<>();

    /* 
    Use Case 1: Create contacts in address book 
    */

    public void createContacts(ArrayList <String> contact){

        // Add contact details of person to address book
        AddressBookSystem.address_book.add(contact);


        // Print contact details of persons in address book
        
        for (ArrayList <String> i: AddressBookSystem.address_book ){

            for (String j: i){

                System.out.println(j);

            }

        }

    }

    /* 
    
    Use case 2: Add a new contact to address book 
    
    */

    public void addContact(){

        ArrayList <String> contact = enterContactDetails();

        createContacts(contact);

    }

    // Asks to enter all the details of person

    public ArrayList enterContactDetails(){

        ArrayList <String> contact = new ArrayList <String>();


        System.out.println("Enter the first name: ");

        Scanner sc1 = new Scanner(System.in);

        String first_name = sc1.next();

        contact.add(first_name);



        System.out.println("Enter the last name: ");

        Scanner sc2 = new Scanner(System.in);

        String last_name = sc2.next();

        contact.add(last_name);



        System.out.println("Enter the address: ");

        Scanner sc3 = new Scanner(System.in);

        String address = sc3.next();

        contact.add(address);



        System.out.println("Enter the city name: ");

        Scanner sc4 = new Scanner(System.in);

        String city = sc4.next();

        contact.add(city);



        System.out.println("Enter the state's name: ");

        Scanner sc5 = new Scanner(System.in);

        String state = sc5.next();

        contact.add(state);



        System.out.println("Enter the zip: ");

        Scanner sc6 = new Scanner(System.in);

        String zip = sc6.next();

        contact.add(zip);



        System.out.println("Enter the phone number: ");

        Scanner sc7 = new Scanner(System.in);

        String phone_num = sc7.next();

        contact.add(phone_num);



        System.out.println("Enter the email ID: ");

        Scanner sc8 = new Scanner(System.in);

        String email = sc8.next();

        contact.add(email);



        return contact;

    }



    /* 
    
    Use case 3: Edit existing contact person using their name 
    
    */

    // Returns the index of contact details of a person in address book

    public int searchExistingContact(String search_pers){

        int indx = -1;

        int temp_indx = -1;

        for (ArrayList <String> i:AddressBookSystem.address_book){

            // find index of arraylist in which the given name is there

            temp_indx ++;

            for (String j:i){

                // if name is found

                if (j.equals(search_pers)){

                    indx = temp_indx;

                    break;

                }

            }

        }

        return indx;

    }

    // to change the contact details

    public void editExistingContact(){

        System.out.println("Enter the name of the person whose details you " + "want to be changed");

        Scanner sc = new Scanner(System.in);

        String search_pers = sc.next();

        int index = searchExistingContact(search_pers);

        System.out.println("Found the name, Kindly enter new details ");

        // Ask for the new details

        ArrayList <String> contact = enterContactDetails();

        // Modify the values in the arrayList

        AddressBookSystem.address_book.set(index, contact);

    }

/*  

Use case 4: Delete an existing person contact using his name in address book 

*/

    public void deleteExistingContact(){

        System.out.println("Enter the name of the person whose details you " + "want to be deleted");

        Scanner sc = new Scanner(System.in);

        String search_pers = sc.next();

        // Fetch the index of person in address book

        int index = searchExistingContact(search_pers);

        // delete the details of person

        AddressBookSystem.address_book.remove(index);

    }

    /*

    Use case 5 :Add multiple person to address book

    */

    public void addMultiplePerson(){

        System.out.println("Enter the number of persons whose details you want " + "to add to the address book");

        Scanner sc = new Scanner(System.in);

        int no_of_person = sc.nextInt();

        for (int i=1;i<=no_of_person;i++){

            // call addition method for so many times

            addContact();

        }

    }

    public static void main(String []args){

        System.out.println("Welcome to Address Book Program!");

        AddressBookSystem abs  = new AddressBookSystem();

        abs.addMultiplePerson();

    }

}

