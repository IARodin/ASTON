public class Algorithm3 {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 12, 15, 18, 21, 25, 30};
        for (int numb : numbers) {
            if (numb % 3 == 0) {
                System.out.println("Число - " + numb + " кратно 3");
            }
        }
    }
}
