public class Main {

    public static void main(String[] args) {


        /*
        *                       |
        *                      2|          A
        *                       |
        * --------(-14)------------------(11)----------------
        *                       |
        *         B             |-2
        *                       |
        * */
        Dot A = new Dot(11, 2, "zalias");
        Dot B = new Dot(-14, -2, "raudonas");

        Line linija = new Line(A,B);


    }

}
