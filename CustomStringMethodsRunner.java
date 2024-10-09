public class CustomStringMethodsRunner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();

        System.out.println(methods.longerThan("rome", 4));
        System.out.println(methods.funnyString("italy", 2));
        System.out.println(methods.halvesReversed("empire"));
        System.out.println(methods.pigLatin("bce"));
        System.out.println(methods.removeCharacter("Byzantine", 3));
        System.out.println(methods.insertAt("rome", "byzantine", "o"));
        System.out.println(methods.endUp("Roman empire", 6));
        System.out.println(methods.yellOrWhisper("Byzantine!"));

    }
}
