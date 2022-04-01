class Dish {
    private String nameOfDish;
    private int costInCents;
    private boolean wouldRecommend;
    private static  int totalDishes =0;
    private static int discountPercent = 0;

    private Dish(){

        totalDishes++;
    }

    public Dish(String nameOfDish, int costInCents, boolean wouldRecommend) {
        this();
        this.nameOfDish = nameOfDish;
        this.costInCents = costInCents;
        this.wouldRecommend = wouldRecommend;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public static void setTotalDishes(int totalDishes) {
        Dish.totalDishes = totalDishes;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public static int getTotalDishes() {
        return totalDishes;
    }

    public void printSummary() {

        float new = costInCents * (1-(float)discountPercent(100));

        System.out.printf(
                "\nCost: %d \n Name: %s \n Recommend: %b", costInCents, nameOfDish, wouldRecommend);

    }
}

public class DishTest{

    public static void main(String[] args) {



        Dish.setDiscount(15);

        Dish dish1 = new Dish();//

        dish1.setNameOfDish(); = "Dragon Roll";
        dish1.setCostInCents(); = 15000;
        dish1.setWouldRecommend(); = true;

        dish1.printSummary();

        Dish dish2 = new Dish();

        dish2.printSummary();

        System.out.println("Dish.totalDishes = " + Dish.getTotalDishes());
    }


}






//public class OOPMiniExercisePt1 {
//    public static void main(String[] args) {
//
//
//    }
//}
