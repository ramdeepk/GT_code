public class PracticeTL {
    public static String[] redactSentences(String[] sentences,
        String[] blacklist) {
    	String[] redactedArray = new String[sentences.length];
    	for (int i = 0; i < redactedArray.length; i++) {
    		redactedArray[i] = sentences[i];
    	}
    	for (int j = 0; j < redactedArray.length; j++) {
    		redactedArray[j] = redact(redactedArray[j], blacklist);
    	}
    	return redactedArray;
    }

    public static String generateBlackout(int length) {
    	String str = "";
    	for (int i = 0; i < length; i++) {
    		str = str + "*";
    	}
    	return str;
    }

    public static String redact(String sentence, String[] blacklist){
    	String newStr = sentence;
    	for (String x: blacklist) {
    		while (newStr.contains(x)) {
    			newStr = newStr.replace(x, generateBlackout(x.length()));
    		}
    	}
    	//System.out.println(newStr);
    	return newStr;
    }

    public static void main(String[] args) {
        String[] sentences = {"Jason Bourne fell off a building into a river",
            "Aaron Cross was the next step up from Treadstone",
            "This is innocent text", "Can you tell I'm a huge Bourne fan?"};
        String[] blacklist = {"Jason", "Bourne", "Treadstone"};

        System.out.println(java.util.Arrays.toString(
            redactSentences(sentences, blacklist)));
    }
}
