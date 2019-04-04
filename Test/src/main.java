public class main {

    public static void main(String... args) {

        newtonian newtonian1 = new newtonian(10, 10, true);
        newtonian newtonian2 = new newtonian( 5, 15, false);

        System.out.println(newtonian1.toString());
        System.out.println(newtonian2.toString());
    }

}
