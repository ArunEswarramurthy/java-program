
import java.util.HashSet;
import java.util.Set;
class Main {
    public static void main(String[] args) {
String s = "pwwkew";
Set<Character> set = new HashSet<>();
int Start = 0 ;
 
int length = 0;

for(int end = 0 ; end <s.length(); end++){
    char ch = s.charAt(end);
    while(set.contains(ch)){
        set.remove(s.charAt(Start));
        Start++;
    }
    set.add(ch);
    length=set.size();
    
    
}
System.out.println(length);
}
}