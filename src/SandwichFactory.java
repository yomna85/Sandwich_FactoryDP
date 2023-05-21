public class SandwichFactory {
    public static final int BEEF_BURGER=1;
    public static final int Chicken_BURGER=2;
    public static Sandwich createSandwish(int sandwichId){
        switch(sandwichId){
            case BEEF_BURGER:
                return  new BeefBurger();
            case Chicken_BURGER:
                return  new ChickenBurger();
            default:
                return null;
        }
    }
}
