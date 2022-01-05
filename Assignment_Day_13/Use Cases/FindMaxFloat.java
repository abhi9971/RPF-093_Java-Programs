public class FindMaxFloat {
    
    public float maxValueFloat(float val1, float val2, float val3) {
        
        float max = val1;
        
        if (val2 > max) {
            
            max = val2;
            
        } 
        
        if (val3 > max) {
            
            max = val3;
        }
        
        return max;
    }

    public static void main(String[] args) {
        
        System.out.println("*******welcome to generics code tested By JUnit***** ");
        
        FindMaxFloat generics = new FindMaxFloat();
        
        float float1 = 2.5f, float2 = 3.5f , float3 = 4.5f;
        
        float result1 = generics.maxValueFloat(float1,float2,float3);
        
        System.out.println("the max vale of "+float1+" , "+float2+" & "+ float3+ " is :: "+ result1);

    }
}
