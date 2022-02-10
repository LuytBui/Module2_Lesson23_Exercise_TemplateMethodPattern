public class RauMuongXao extends Meal{
    @Override
    public void prepairIngredients() {
        System.out.println("Nguyên liệu gồm có: 1 mớ rau muống, tỏi, muối ăn, dầu ăn.");
    }

    @Override
    public void cook() {
        System.out.println("Đổ dầu ăn ra chảo, làm nóng. Rửa và nhặt rau muống, giữ lại phần còn non.");
        System.out.println("Cho tỏi vào chảo, phi trong 1 phút.");
        System.out.println("Cho rau muống vào chảo, xào cho đến khi nào tổ tiên bảo OK thì dừng.");
        System.out.println("Tắt bếp, nếm gia vị vừa đủ.");
        System.out.println("Cho rau ra đĩa");
    }

    @Override
    public void cleanup() {
        System.out.println("Rửa đĩa, bát đũa, chảo.");
    }
}
