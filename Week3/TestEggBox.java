public class TestEggBox{
    public static void main(String[] args){
        EggBox e = new EggBox();
        e.setEggs(14);
        e.setBoxSize(6);
        e.computeBoxes();
        e.computeLeftover();
        System.out.println(e.getBoxes() + " boxes, " + e.getLeftover() + " left");
    }
}
