public class boooolean {

    public static void main(String[] args) {

        String name = "fancymalsehenobdasklappt";
        System.out.println(name);
        System.out.println("Sum Letters: " + name.length());
        boolean result = laenge(name);
        System.out.println(result);
        System.out.println(beinhaltet(name));
        System.out.println(bothTrue(name));
    }
    //Methode die länger als 20 Zeichen ist
    public static boolean laenge(String name) {
        return name.length() > 20;
    }
    //Methode die Zeichenfolge "fancy" enthält
    public static boolean beinhaltet(String name) {
        return name.contains("fancy");
    }

    //Schreibe eine Methode die eine andere Methode von dir aufruft
    public static boolean bothTrue(String name){
        return laenge(name) && beinhaltet("fancy");
    }
}
