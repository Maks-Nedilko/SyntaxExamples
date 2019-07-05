
package syntaxexamples;

public class VarArg {

    static int sum(int... a) {
        int result = 0;

        for (int i = 0; i < a.length; i++) {
            result = result + a[i];
        }

        return result;
    }
    
    static int[] union(int[]... set){
        int cap =0;
        for(int i =0;i < set.length;i++){
            cap = cap + set[i].length;
        }
        int [] result = new int[cap];
        
        int point=0;
        
        for(int i=0;i<set.length;i++){
            
            for(int j=0;j<set[i].length;j++){
                
                result[point]=set[i][j];
                point++;
            }
        }
        
        
        return result;
    }
        
        
        

    
    
    public static void main(String[] args) {
//        System.out.println( sum(1,2));
//        System.out.println(sum(1,4,0,9));
//        sum(1,4,0,9);
//        sum(77);
int [] a={1,2,3};
int [] b={4,5,6};
int [] c={7,8,9};
int[] array = union(a,b,c);
String s="";
for(int i=0;i<array.length;i++){
    s=s+array[i] + " ";
}
        System.out.println(s);

    }
}
