public class Main {

    public static void main(String[] args) {
        Meal banhMi = new BanhMiBaTe();
        Meal rauMuongXao = new RauMuongXao();

        banhMi.doMeal();
        System.out.println();
        rauMuongXao.doMeal();
    }
}
