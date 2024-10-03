public class Rotation {
    public static void main(String[] args)
    {
        System.out.println(isRotation("abcde", "deabc"));

    }

    public static boolean isRotation(String string1, String string2) {

        String result = string2 + string2;

        return result.contains(string1); 

    }

}





