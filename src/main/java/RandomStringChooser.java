import java.util.*;
public class RandomStringChooser
{
 private ArrayList<String> remainder;
public RandomStringChooser(String[] values){
remainder = new ArrayList<String>();
for(String value : values)
remainder.add(value);
}
public String getNext(){
if(remainder.size() == 0)
return "NONE";
int index = (int) (Math.random() * remainder.size());
return remainder.remove(index);
}  
}
