package BasicLogicalQuestions;

class anagramsWords {
    public static String sort(String a) {
        char[] c = a.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - 1 - i; j++) {
                if (c[j] > c[j + 1]) {
                    char temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
        return new String(c);
    }

    public static void main(String[] args) {
        String a = "  Silent  ";
        String b = "listen";

        String c = a.trim().toLowerCase();
        String d = b.trim().toLowerCase();


        String c1 = anagramsWords.sort(c);
        String c2 = anagramsWords.sort(d);

        if (c1.equals(c2)) {
            System.out.println( c + " and " + d + " are anagrams words");
        } else {
            System.out.println( c + " and " + d + " are not anagrams words");
        }
    }
}

