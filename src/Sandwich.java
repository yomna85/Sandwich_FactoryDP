public class Sandwich {

    private String name;
    private int calories;

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    public void prepare(){
        System.out.println(name+"Is prepared with "+calories+" Calories");
    }
}
