
package workstring;


public class WorkSubstring {
    
    static void modi(String[] array){
        for(int i =0;i<array.length;i++){
            if((i%2)==0){
                
                if(array[i].length()>3){
                    array[i]=array[i].substring(0, 3);
            }
                
                
            }
            
                
            }
        }
    
    static void modi2(String[] array){
        
        for(int i=0;i<array.length;i++){
            if((i%2)!=0){
                array[i]=array[i].replaceAll("mr.", "mister");
            array[i]=array[i].replaceAll("ms.", "missis");
            }
        }
    }

    static void modi3(String[] array){
        
        modi(array);
        modi2(array);
    }
   
    
    public static void main(String[] args) {
        
        String [] array = {"aa","mr. Dog","adsdd","assd ms. Hat","sassa"};
        
       modi3(array);
        for(String s:array){
            System.out.println(s);
        }
    }
}
