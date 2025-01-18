public class Basic {
    public static void main(String[] args) {
        String language="nee mile class";
        String empy_string="";
        String newData= "    manu is a coder ";
        String new_word="Manu";
        System.out.println(language.toUpperCase());
        System.out.println(language.startsWith("n"));
        System.out.println(language.endsWith("ass"));
        System.out.println(language.replace('e','o'));
        System.out.println(empy_string.isEmpty());
        System.out.println(language.isEmpty());
        System.out.println(language.indexOf("mile"));
        System.out.println(language.substring(3));
        System.out.println(language.substring(2, 5));
        System.out.println(newData.trim());
        //compare string
        //compare without considering case sensitivity
        System.out.println(new_word.equalsIgnoreCase("manu"));

    }
}
