import java.util.Scanner;
import java.io.File;

public class GradeHistogram {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);
        Scanner file = new Scanner(new File(args[0]));
        int bucket = 0, lineCount = 0;
        String allText = "", line = "";
        while (file.hasNextLine()) {
            lineCount++;
            line = file.nextLine();
            allText = allText
                + line.substring(line.indexOf(", ") + 1).trim() + "|";
        }

        int[] listOfGrades = new int[lineCount];
        int indexOfBar = allText.indexOf("|"), start = 0, num = 0;
        for (int i = 0; i < lineCount; i++) {
            num = Integer.parseInt(allText.substring(start, indexOfBar));
            start = indexOfBar + 1;
            indexOfBar = allText.indexOf("|", indexOfBar + 1);
            listOfGrades[i] = num;
        }

        System.out.println("Grades loaded!");

        if (args.length == 2) {
            bucket = Integer.parseInt(args[1]);
        } else {
            System.out.print("Please enter the bucket size: ");
            bucket = Integer.parseInt(kb.nextLine());
        }

        printHisto(listOfGrades, bucket);
    }

    public static String repeat(String str, int timesToRep) {
        String repString = "";
        for (int i = 1; i <= timesToRep; i++) {
            repString = repString + str;
        }
        return repString;
    }

    public static int rangeFrequency(int[] numList, int start, int end) {
        int freq = 0;
        for (int i : numList) {
            if ((start <= i) && (i <= end)) {
                freq++;
            }
        }

        return freq;
    }

    public static void printHisto(int[] numList, int bucketSize) {
        if (bucketSize != 101) {
            String[] bucketList = new String[(100 / bucketSize) + 1];
            //the +1 is for the remainder bucket
            for (int i = bucketList.length - 1; i >= 0; i--) {
                if (i == 0) {
                    if (100 % bucketSize == 0) {
                        bucketList[i] = "0    -    0 |"
                            + repeat("[]", rangeFrequency(numList, 0, 0));
                    } else {
                        int rem = 100 % bucketSize;
                        String remSt = Integer.toString(rem);
                        bucketList[i] = "0" + repeat(" ", 4) + "-"
                            + repeat(" ", 5 - remSt.length())
                            + remSt + " |"
                            + repeat("[]", rangeFrequency(numList, 0, rem));
                    }
                } else {
                    int x = (bucketSize * i)
                        - (bucketSize - 1) + (100 % bucketSize);
                    int y = (bucketSize * i) + (100 % bucketSize);
                    String xStr = Integer.toString(x);
                    String yStr = Integer.toString(y);
                    bucketList[i] = xStr + repeat(" ", 5 - xStr.length())
                        + "-" + repeat(" ", 5- yStr.length()) + yStr + " |"
                        + repeat("[]", rangeFrequency(numList, x, y));
                }

                System.out.println(bucketList[i]);
            }
        } else {
            System.out.println("0    -  101 |" + repeat("[]", numList.length));
        }
    }
}