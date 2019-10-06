import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dinglemouse {

    public static String histogram(final int tempults[]) {
        String as = "\u2588";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < tempults.length; i++) {
            StringBuilder temp = new StringBuilder();
            temp.append(String.valueOf(i + 1)).append("|");
            StringBuilder line = new StringBuilder();

            if (tempults[i] != 0) {
                for (int j = 0; j < tempults[i] / 2; j++) {
                    line.append(as);
                }
                temp.append(line).append(" " + String.valueOf(tempults[i])).append("%\n");
            }else{
                temp.append("\n");
            }

            res.insert(0, temp);
        }
        return res.toString();
    }


    public static void main(String[] args) {
        int tempults[] = {2, 15, 9, 0, 7};
        System.out.println(histogram(tempults));
    }


}
