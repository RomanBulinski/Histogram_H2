public class Dinglemouse {

    public static String histogram(final int tempults[]) {
        String as = "\u2588";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < tempults.length; i++) {
            StringBuilder temp = new StringBuilder();
            temp.append(String.valueOf(i + 1 +"|"));
            if (tempults[i] != 0) {
                StringBuilder line = new StringBuilder();
                for (int j = 0; j < tempults[i] / 2; j++) {
                    line.append(as);
                }
                temp.append(line+" " + String.valueOf(tempults[i])).append("%");
            }
            temp.append("\n");
            res.insert(0, temp);
        }
        return res.toString();
    }



}
