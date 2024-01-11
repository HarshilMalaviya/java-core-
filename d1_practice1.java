import java.util.*;
public class d1_practice1 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a1.add(sc.nextInt());
        }
        System.out.println(a1);

            for (int j = 1; j <5; j++) {
                for (int i = 0; i <5-1; i++) {
                    if (a1.get(i) > a1.get(i+1)) {
                        int temp = a1.get(i);
                        a1.set(i, a1.get(i+1));
                        a1.set(i+1, temp);
                    }

                }
            }

        System.out.println(a1);

        }

    }

