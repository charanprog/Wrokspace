import java.util.Scanner;

public class Ratsfood {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rats:");
        int rats = input.nextInt();
        System.out.println("Enter number of units you have:");
        int units = input.nextInt();
        int[] rooms = {2, 4, 8, 3, 5, 7};
        System.out.println("The Number of food unit rooms required:");
        System.out.println(fun(rooms,rats,units));
    }
    public static int fun(int[] rooms,int rats ,int units) {
        int trf = rats * units;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            sum = sum + rooms[i];
            count++;
            if (sum >= trf) {
                break;
            }
        }
        return count;

    }
}
