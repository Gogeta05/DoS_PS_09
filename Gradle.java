/**
 * Created by Martin on 14.12.2014.
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Splitter;

public class Gradle {
    public static void main(String[] args) {
        gradleSplitter();
    }

    @VisibleForTesting
    public static int gradleSplitter() {
        String s = "M,a,,r,t,,,i,n";
        Iterable<String> r = Splitter.on(',').trimResults().omitEmptyStrings().split(s);

        try {
            System.out.println("--------");
            for (String st : r) {
                System.out.println(st);
            }
            return 0;
        }
        catch (Exception e) {
            return -1;
        }
    }
}
