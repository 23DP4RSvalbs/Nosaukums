import java.util.ArrayList;
import java.util.List;

public class mainProgram {

    // Static method that returns the size of the list.
    public static int returnSize(List<?> list) {
        return list.size();
    }
    
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");
        
        System.out.println(returnSize(names)); // Expected output: 3
    }
}
