public class BirdTest {
    public static void main(String[] args) {
        Bird cardinal = new Bird();
        cardinal.setName("Cardinal");
//        cardinal.setCanFly(true);
        System.out.print(cardinal.getName() + " goes ");
        cardinal.makeNoise();
//        cardinal.move();
        Duck mallard = new Duck();
        mallard.setName("Mallard Duck");
        System.out.print(mallard.getName() + " goes ");
        mallard.makeNoise();





    }
}
