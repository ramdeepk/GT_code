public class Redactor {

	private String[] bList;
    
    public Redactor(String[] blacklist) {
    	bList = blacklist;
    }

    public String generateBlackout(int length) {
        String blackout = "";
        for (int i = 0; i < length; i++) {
            blackout = blackout + "*";
        }
        return blackout;
    }

    public String redactDocument(String document) {
    	String newString = document;
        for (String x: bList) {
            if (document.contains(x)) {
            	newString = newString.replace(x, generateBlackout(x.length()));
            }
        }
        return newString;
    }

    public String[] redactDocuments(String[] documents) {
        String[] newArr = documents;
        for (int i = 0; i < newArr.length; i++) {
        	newArr[i] = redactDocument(newArr[i]);
        }
        return newArr;
    }

    public static void main(String... args) {
        String[] documents = {"Jason Bourne fell off a building into a river",
            "Aaron Cross was the next step up from Treadstone",
            "This is innocent text", "Can you tell I'm a huge Bourne fan?"};
        String[] blacklist = {"Jason", "Bourne", "Treadstone"};

        System.out.println("Test your code here.");
        Redactor redac = new Redactor(blacklist);
        for (int i = 0; i < redac.redactDocuments(documents).length; i++) {
            System.out.println(redac.redactDocuments(documents)[i]);
        }
    }
}

