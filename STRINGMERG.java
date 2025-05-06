public class STRINGMERG{

    public class static void main(String [] args){
        Stinrg S1 = "arun";
        Stirng s2 = "akshaya";

        StringBuilder result  = new StringBuilder();
         int i = 0, j = 0;
         while(i<S1.length() || j<S2.length()){
             if(i<S1.length()){
                 result.append(S1.charAt(i));
                 i++;
             }
              if(i<S2.length()){
                 result.append(S2.charAt(j));
                 j++;
             }
             
         }
        System.out.println(return.toString()); 
}}