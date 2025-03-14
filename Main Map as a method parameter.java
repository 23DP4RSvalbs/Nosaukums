import java.util.HashMap;
import java.util.Map;

public class MainProgram {

    // Static method that returns the size of the provided map.
    public static int returnSize(Map<?, ?> map) {
        return map.size();
    }
    
    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");
        
        System.out.println(returnSize(names));  // Expected output: 2
    }
}
