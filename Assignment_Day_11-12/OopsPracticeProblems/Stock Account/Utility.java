import org.json.simple.JSONArray;

import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;

import org.json.simple.parser.ParseException;

import java.io.*;

import java.time.LocalDateTime;

import java.util.Scanner;

public class Utility {
    
    Long haveMoney;
    
    Long shareHave;
    
    JSONArray accountArray = new JSONArray();
    
    JSONObject account = new JSONObject();
    
    LocalDateTime dateTime = LocalDateTime.now();
    
    public void addPerson() {
        
        Scanner sc = new Scanner(System.in);
        
        JSONObject studentDetails = new JSONObject();

        System.out.print("Enter firstName: ");
        
        String firstName = sc.next();
        
        System.out.print("Enter lastName: ");
        
        String lastName = sc.next();
        
        System.out.print("Enter address: ");
        
        String address = sc.next();
        
        System.out.print("Enter city: ");
        
        String city = sc.next();
        
        System.out.print("Enter state: ");
        
        String state = sc.next();
        
        System.out.print("Enter email: ");
        
        String email = sc.next();
        
        System.out.print("Enter zip: ");
        
        String  zip = sc.next();
        
        System.out.print("Enter phoneNumber: ");
        
        String  phoneNumber = sc.next();

        studentDetails.put("firstName", firstName);
        
        studentDetails.put("lastName", lastName);
        
        studentDetails.put("address", address);
        
        studentDetails.put("city", city);
        
        studentDetails.put("state", state);
        
        studentDetails.put("email", email);
        
        studentDetails.put("zip", zip);
        
        studentDetails.put("phoneNumber", phoneNumber);
        
        accountArray.add(studentDetails);

        try (FileWriter file = new FileWriter("E:\\jsonFiles\\StockAccount.json")) {
            
            file.write(accountArray.toJSONString());
            
            file.flush();
        }
        
        catch (IOException e) {
            
            e.printStackTrace();
            
        }
        
        System.out.println("----------------Data added to Json File SuccessFully --------------------------");
        
        studentDetails = null;
    }

    private void fileWriter(JSONArray accountArray) {
        
        try (FileWriter fileWriter =new FileWriter("E:\\jsonFiles\\StockAccount.json")){
            
           fileWriter.write(accountArray.toJSONString());
            
            fileWriter.flush();
            
        } 
        catch (IOException e) {
            
            e.printStackTrace();
        }
    }
    
    public void fileReader() {

        try(FileReader reader = new FileReader ("E:\\jsonFiles\\StockAccount.json")) {
            
            JSONParser parser = new JSONParser();
            
            Object obj = parser.parse(reader);
            
            JSONArray showAccount = (JSONArray) obj;
            
            System.out.println(showAccount);
            
        } 
        catch (FileNotFoundException | ParseException e) {
            
            e.printStackTrace();
            
        } 
        catch (IOException e) {
            
            e.printStackTrace();
        }

    }

    private long checkMoneyHave() {

        try(FileReader reader = new FileReader ("E:\\jsonFiles\\StockAccount.json")) {
            
            JSONParser parser = new JSONParser();
            
            Object obj = parser.parse(reader);
            
            JSONArray showAccount = (JSONArray) obj;
            
            System.out.println(showAccount);
            
            for ( int i=0 ; i<showAccount.size();i++) {
                
                JSONObject account = (JSONObject) showAccount.get(i);
                
                haveMoney = (Long) account.get("haveMoney");
                
                shareHave = (Long) account.get("sharesHave");
                
                System.out.println(shareHave);
                
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
            
        return haveMoney;
    }
        
    private Long checkShareHave() {

        try(FileReader reader = new FileReader ("E:\\jsonFiles\\StockAccount.json")) {
            
            JSONParser parser = new JSONParser();
            
            Object obj = parser.parse(reader);
            
            JSONArray showAccount = (JSONArray) obj;
            
            System.out.println(showAccount);
            
            for ( int i=0 ; i<showAccount.size();i++) {
                
                JSONObject account = (JSONObject) showAccount.get(i);
                
                haveMoney = (Long) account.get("moneyHave");
                
                shareHave = (Long) account.get("sharesHave"); 
            }
            
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
        
        return shareHave;
    }

    public void buyShare() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("chose the company below ::");
        
        System.out.println("1-reliance 2-tata 3-adani groups");
        
        int choice = sc.nextInt();
        
        switch (choice){
                
            case 1 :
                
                relianceShare();
                break;
                
            case 2 :
                
                tataShare();
                break;
                
            case 3 :
                
                adaniGroup();
                break;
                
            default:
                
                System.out.println("OHHO please enter as per instructions ::::");
        }
    }

    private void tataShare() {
        
        int totalShare = 1000;
        
        int eachSharePrice = 180;
        
        companyShare(totalShare,eachSharePrice);
    }

    private void relianceShare() {
        
        int totalShare = 1200;
        
        int eachSharPrice =1500;
        
        companyShare(totalShare, eachSharPrice);
    }
        
    public void adaniGroup() {
        
        int totalShare = 1800;
        
        int eachSharePrice = 210;
        
        companyShare(totalShare,eachSharePrice);
        
    }

    private void companyShare(int totalShare, int eachSharPrice) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Each share price is "+ eachSharPrice + " dollars");
        
        System.out.println("we have "+ totalShare +" shares how much you want :: ");
        
        Long numberBuy = sc.nextLong();
        
        Long amount = eachSharPrice * numberBuy;
        
        if ( checkMoneyHave() >= amount ) {
            
            System.out.println("you have successfully bought share :");
            
            long balance = (checkMoneyHave()-amount);
            
            System.out.println("your current account balance is : " + balance );
            
            account.put("ShareBought", numberBuy);
            
            account.put("TimeBought", dateTime);
            
            account.put("BuyingAmount",amount);
            
            account.put("balanceLeft",balance);
            
            accountArray.add(account);
            
            fileWriter(accountArray);
            
        } 
        else {
            
            System.out.println("OHHO you dont have sufficient account balance to buy this much shares!!!");
            
        }
    }
        
    public void sellShare(){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how much share you want to sell ::");
        
        long sell = sc.nextLong();

        if (checkShareHave() >= sell) {

            System.out.println("Enter how rate to sell ::");
            
            Long rate = sc.nextLong();
            
            Long amountEarned = rate*sell;
            
            System.out.println("congratulations you have earned " + amountEarned+" dollars");
            
            System.out.println("time of selling is :: " + dateTime);
            
            account.put("numberSellShares" , sell);
            
            account.put("TimeOfSelling", dateTime);
            
            account.put("MoneyEarned",amountEarned);
            
            accountArray.add(account);
            
            fileWriter(accountArray);

        } 
        else {
            
            System.out.println("OHHO please number of shares you have ::");
        }

    }
        
     public void recordCheck() {
         
         try(FileReader reader = new FileReader ("E:\\jsonFiles\\StockAccount.json")) {
             
             JSONParser jsonParser = new JSONParser();
             
             Object object = jsonParser.parse(reader);
             
             System.out.println(object);
             
             JSONArray showAccount = (JSONArray) object;

             System.out.println(showAccount);

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
}
