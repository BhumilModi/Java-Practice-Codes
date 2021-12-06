public class permutation {

    static void permutate(char[] letters, int posi) {
        if (posi == letters.length - 1) {
            System.out.println(letters);
        } else {
            for (int i = posi; i < letters.length; i++) {
                char t = letters[posi];
                letters[posi] = letters[i];
                letters[i] = t;
                permutate(letters, posi + 1);
                t = letters[posi];
                letters[posi] = letters[i];
                letters[i] = t;
            }
        }
    }

    public static void main(String[] args) {
        String s = "ABCD";
        char[] l = s.toCharArray();
        permutate(l, 0);
    }
}
