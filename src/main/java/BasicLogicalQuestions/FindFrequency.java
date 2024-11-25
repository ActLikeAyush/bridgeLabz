package BasicLogicalQuestions;

public class FindFrequency{

    public static void main(String args[])
    {
        String str = "scaler by interviewbit";
        int frequency[] = new int [256];

        for (int i = 0; i < str.length(); i++)
        {
            frequency[(int) str.charAt(i)]++;
        }


        for (int i = 0; i < frequency.length; i++)
        {
            if (frequency[i] != 0)
            {
                System.out.println((char) i + " - " + frequency[i]);
            }
        }
    }
}
