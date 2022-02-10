public class BanhMiBaTe extends Meal{
    @Override
    public void prepairIngredients() {
        System.out.println("Nguyên liệu gồm có: bánh mì, bate, rau, nước sốt, tương.");
    }

    @Override
    public void cook() {
        System.out.println("Xẻ bánh mì, cho nguyên liệu vào. Ép nóng trong vài phút.");
    }

    @Override
    public void cleanup() {
        System.out.println("Quét vụn bánh mì.");
    }
}
