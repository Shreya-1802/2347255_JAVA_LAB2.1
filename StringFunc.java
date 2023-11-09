public class StringFunc{

    public static void main(String[] args) {
        String text = "We realized that while our workers were thriving, the surrounding villages were still suffering. "
                + "It became our goal to uplift their quality of life as well. "
                + "I remember seeing a family of four on a motorcycle in the heavy Bombay rain — "
                + "I knew I wanted to do more for these families who were risking their lives for lack of an alternative."
                + " The alternative mentioned here is the Tata Nano, which soon after became the world’s cheapest car "
                + "on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by "
                + "Humans of Bombay, which formed the basis of his decision to come up with a car like the Tata Nano.";

        // charAt()
        char firstChar = text.charAt(0);
        System.out.println("charAt(0): " + firstChar);

        // compareTo()
        String otherString = "Another string";
        int compareResult = text.compareTo(otherString);
        System.out.println("compareTo: " + compareResult);

        // concat()
        String concatenatedString = text.concat(" - Additional content.");
        System.out.println("concat: " + concatenatedString);

        // contains()
        boolean containsWord = text.contains("Tata Nano");
        System.out.println("contains 'Tata Nano': " + containsWord);

        // endsWith()
        boolean endsWithPeriod = text.endsWith(".");
        System.out.println("endsWith '.': " + endsWithPeriod);

        // equals()
        boolean isEqual = text.equals(otherString);
        System.out.println("equals: " + isEqual);

        // equalsIgnoreCase()
        boolean isEqualIgnoreCase = text.equalsIgnoreCase(otherString);
        System.out.println("equalsIgnoreCase: " + isEqualIgnoreCase);

        // format()
        String formattedString = String.format("Formatted text: %s, %d", "Hello", 123);
        System.out.println("format: " + formattedString);

        // getBytes()
        byte[] byteArray = text.getBytes();
        System.out.println("getBytes length: " + byteArray.length);

        // getChars()
        char[] charArray = new char[50];
        text.getChars(0, 50, charArray, 0);
        System.out.println("getChars: " + new String(charArray));

        // indexOf()
        int indexOfBombay = text.indexOf("Bombay");
        System.out.println("indexOf 'Bombay': " + indexOfBombay);

        // intern()
        String internedString = text.intern();
        System.out.println("intern: " + internedString);

        // isEmpty()
        boolean isEmpty = text.isEmpty();
        System.out.println("isEmpty: " + isEmpty);

        // join()
        String joinedString = String.join("-", "Java", "String", "Join");
        System.out.println("join: " + joinedString);

        // lastIndexOf()
        int lastIndexOfNano = text.lastIndexOf("Nano");
        System.out.println("lastIndexOf 'Nano': " + lastIndexOfNano);

        // length()
        int length = text.length();
        System.out.println("length: " + length);

        // replace()
        String replacedText = text.replace("Tata Nano", "new car");
        System.out.println("replace: " + replacedText);

        // replaceAll()
        String replacedAllText = text.replaceAll("Bombay", "Mumbai");
        System.out.println("replaceAll: " + replacedAllText);

        // split()
        String[] words = text.split("\\s+");
        System.out.println("split: " + words.length + " words");

        // startsWith()
        boolean startsWithWe = text.startsWith("We");
        System.out.println("startsWith 'We': " + startsWithWe);

        // substring()
        String substring = text.substring(0, 50);
        System.out.println("substring(0, 50): " + substring);

        // toCharArray()
        char[] charArrayFromText = text.toCharArray();
        System.out.println("toCharArray length: " + charArrayFromText.length);

        // toLowerCase()
        String lowerCaseText = text.toLowerCase();
        System.out.println("toLowerCase: " + lowerCaseText);

        // toUpperCase()
        String upperCaseText = text.toUpperCase();
        System.out.println("toUpperCase: " + upperCaseText);

        // trim()
        String trimmedText = text.trim();
        System.out.println("trim: " + trimmedText);

        // valueOf()
        int number = 123;
        String stringValue = String.valueOf(number);
        System.out.println("valueOf: " + stringValue);
    }
}
