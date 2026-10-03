import java.util.*;
class WasteCollectionVehicles2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Waste Collected");
        double a = obj.nextInt();
        if (a >= 100) {
            System.out.println("Collection Target Achieved");
        }
        else {
            System.out.println("More Waste Collection Requried");
        }
    }
}