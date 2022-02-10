public abstract class Meal {
    public abstract void prepairIngredients();
    public abstract void cook();
    public void eat(){
        System.out.println("Chẹp chẹp");
    };
    public abstract void cleanup();

    //template method
    public final void doMeal() {
        prepairIngredients();
        cook();
        eat();
        cleanup();
    }
}
