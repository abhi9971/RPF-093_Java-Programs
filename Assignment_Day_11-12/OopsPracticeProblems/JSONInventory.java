import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JSONInventory {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        JSONArray listOfItem = new JSONArray();
        JSONObject rice = new JSONObject();
        JSONObject pulse = new JSONObject();
        JSONObject wheat = new JSONObject();
        Scanner sc = new Scanner(System.in);

        pulseDetails(listOfItem, pulse, sc);
        riceDetails(listOfItem, rice, sc);
        wheatDetails(listOfItem, wheat, sc);
        inventoryManager(listOfItem);

        getPrice(parser);
    }

    private static void getPrice(JSONParser parser) {
        try(FileReader reader = new FileReader ("E:\\inventory.json")) {
            Object obj = parser.parse(reader);
            JSONArray showInventory = (JSONArray) obj;
            System.out.println(showInventory);
            System.out.println("number of items in inventory is : "+showInventory.size());
            long totalAmount = 0;
            for ( int i=0 ; i<showInventory.size();i++) {
                JSONObject inventory = (JSONObject) showInventory.get(i);
                totalAmount  += (long) inventory.get("price");
            }
            System.out.println("Total amount of inventory is : "+totalAmount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void wheatDetails(JSONArray listOfItem, JSONObject wheat, Scanner sc) {
        System.out.println("Enter Details for wheat  :");
        System.out.print("Enter Price per kg :");
        int price = sc.nextInt();
//        System.out.print("Enter weight :");
        int weight = 1;
        wheat.put("name","wheat");
        wheat.put("price",price);
        wheat.put("wight",weight);

        listOfItem.add(wheat);
        fileWriter(listOfItem);
    }

    private static void fileWriter(JSONArray listOfItem) {
        try (FileWriter fileWriter = new FileWriter("E:\\inventory.json")) {
            fileWriter.write(listOfItem.toJSONString());
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void pulseDetails(JSONArray listOfItem, JSONObject pulse, Scanner sc) {
        System.out.println("Enter Details pulse  :");
        System.out.print("Enter Price pre kg :");
        int price = sc.nextInt();
//        System.out.print("Enter weight :");
        int weight = 1;
        pulse.put("name","pulse");
        pulse.put("price",price);
        pulse.put("wight",weight);

        listOfItem.add(pulse);
        fileWriter(listOfItem);
    }

    private static void riceDetails(JSONArray listOfItem, JSONObject rice, Scanner sc) {
        System.out.println("Enter Details for rice  :");
        System.out.print("Enter Price per kg:");
        int price = sc.nextInt();
//        System.out.print("Enter weight :");
        int weight = 1;
        rice.put("name","rice");
        rice.put("price",price);
        rice.put("wight",weight);

        listOfItem.add(rice);
        fileWriter(listOfItem);
    }
    private  static void inventoryManager(JSONArray listOfItem) {
        Scanner sc = new Scanner(System.in);
        JSONObject newInventory = new JSONObject();
        System.out.println("Enter name of inventory : ");
        String name = sc.next();
        System.out.println("Enter Details for "+ name + " :: " );
        System.out.print("Enter Price per kg :");
        int price = sc.nextInt();
//        System.out.print("Enter weight :");
        int weight = 1;
        newInventory.put("name",name);
        newInventory.put("price",price);
        newInventory.put("wight",weight);

        listOfItem.add(newInventory);
        fileWriter(listOfItem);
        System.out.println("******** New Inventory added successfully ********");
    }
}
