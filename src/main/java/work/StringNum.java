package work;

public class StringNum {
    public static void main(String[] args) {
        String str="aabbcccd";
        String compressed = compresString(str);
        System.out.println(compressed);
    }
    public static String compresString(String str)
    {
        int len=str.length();
        System.out.println(len);
        if(len<=2)
        {
            return str;
        }
        StringBuilder compressed= new StringBuilder();
        int count=1;
        for(int i=1;i<len;i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                count++;
            }else{
                compressed.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }
        compressed.append(str.charAt(len-1)).append(count);
        return compressed.length() < len ? compressed.toString() : str;
    }
}
//package work;
//public class StringNum {
//    public static String compressString(String str) {
//        int originalLength = str.length();
//        if (originalLength <= 2) {
//            return str; // Return the original string if compression is not beneficial.
//        }
//        StringBuilder compressed = new StringBuilder();
//        int count = 1;
//
//        for (int i = 1; i < originalLength; i++) {
//            if (str.charAt(i) == str.charAt(i - 1)) {
//                count++;
//            } else {
//                compressed.append(str.charAt(i - 1)).append(count);
//                count = 1;
//            }
//        }
//        // Append the last character and its count.
//        compressed.append(str.charAt(originalLength - 1)).append(count);
//
//        return compressed.length() < originalLength ? compressed.toString() : str;
//    }
//
//    public static void main(String[] args) {
//        String input = "aabcccccaaa";
//        String compressed = compressString(input);
//        System.out.println("Compressed string: " + compressed);
//    }
//}