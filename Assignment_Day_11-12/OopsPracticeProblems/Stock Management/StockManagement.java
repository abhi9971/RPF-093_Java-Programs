import netscape.javascript.JSObject;

import org.json.simple.JSONArray;

import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;

import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.util.Scanner;

public class StockManagement {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        JSONParser jasonParser = new JSONParser();
        
        System.out.println("**********Welcome to stock management system ********");
        
        JSONObject company1 = new JSONObject();
        
        JSONObject company2 = new JSONObject();
        
        JSONArray stocks = new JSONArray();
        
        relianceStocks(sc, company1, stocks);
        
        tataStocks(sc, company2, stocks);

        gerStockPrice(jasonParser, stocks);

    }

    private static void gerStockPrice(JSONParser jasonParser, JSONArray stocks) {
        
        try (FileReader reader = new FileReader("E:\\stocks.json")) {
            
            Object obj = jasonParser.parse(reader);
            
            JSONArray showContactArray = (JSONArray) obj;
            
            long totalCost = 0;
            
            for (int i = 0; i < stocks.size(); i++) {
                
                JSONObject stock = (JSONObject) stocks.get(i);
                
                String name = (String) stock.get("name");
                
                long price = (Long) stock.get("priceOfShare");
                
                long numberOfShares = (Long) stock.get("numberOfShare");
                
                Long totalPrice = price * numberOfShares;
                
                totalCost += totalPrice;
                
                System.out.print("the total prcie of stocks of " + name + "is :: ");
                
                System.out.println(totalPrice);
                
            }

            System.out.println("the total amount of  all stocks that you have is :: " + totalCost);


        } 
        
        catch (FileNotFoundException e) {
            
            e.printStackTrace();
            
        } 
        
        catch (IOException e) {
            
            e.printStackTrace();
        }
        
        catch (ParseException e) {
            
            e.printStackTrace();
        }
    }

    private static void addInfile(JSONArray stocks) {
        
        try (FileWriter file = new FileWriter("E:\\stocks.json")) {
            
            file.write(stocks.toJSONString());
            
            file.flush();

        } 
        
        catch (IOException e) {
            
            e.printStackTrace();
        }
        
        System.out.println("data added successfully \nThank-you");
        
    }

    private static void tataStocks(Scanner sc, JSONObject tata, JSONArray stocks) {
        
        System.out.print("Enter name of company ::");
        
        String name = sc.next();
        
        System.out.print("Enter number of shear for " + name+ " :: ");
        
        long numberOfShare = sc.nextInt();
        
        System.out.print("Enter price of each shear : ");
        
        long priceOfShare = sc.nextInt();
        
        tata.put("name",name);
        
        tata.put("numberOfShare",numberOfShare);
        
        tata.put("priceOfShare",priceOfShare);

        stocks.add(tata);
        
        addInfile(stocks);
    }

    private static void relianceStocks(Scanner sc, JSONObject reliance, JSONArray stocks) {
        
        System.out.print("Enter name of company ::");
        
        String name = sc.next();
        
        System.out.print("Enter number of shears of "+ name + " :: ");
        
        long numberOfShare = sc.nextInt();
        
        System.out.print("Enter price of each shear : ");
        
        long priceOfShare = sc.nextInt();
        
        reliance.put("name",name);
        
        reliance.put("numberOfShare",numberOfShare);
        
        reliance.put("priceOfShare",priceOfShare);
        
        stocks.add(reliance);
        
        addInfile(stocks);
    }
}
