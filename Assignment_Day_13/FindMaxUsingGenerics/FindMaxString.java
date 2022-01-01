public class FindMaxString {
    
    public String maxString(String str1, String str2, String str3){
        
        String max = str1;
        
        if (str2.compareTo(max) > 0 ){
            max = str2;
        } 
        if (str3.compareTo(max) > 0 ){
            max = str3;
        }
        
        return max;
    }

    public static void main(String[] args) {
        System.out.println("*******welcome to generics code tested By JUnit***** ");
        FindMaxString generics = new FindMaxString();
        String str1="Hello", str2 = "hello abhishek" , str3 = "hello abhishek How are you";
        String result2 = generics.maxString(str1,str2,str3);
        System.out.println("the max vale of ("+str1+") , ("+str2+") & ("+str3+ ") is :: "+ result2);
    }
}
