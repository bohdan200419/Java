import java.awt.Color;
public class task2 {



        public static void main(String[] args) {
            int N = 10;
            int[][] A = new int[N][N];


            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    A[i][j] = (int) (Math.random() * 20) - 10;
                }
            }

            // виведення масиву та обведення головної діагоналі червоним кольором
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == j) { // головна діагональ
                        System.out.print("\033[31m"); // зміна кольору на червоний
                    }
                    System.out.print(A[i][j] + "\t");
                    System.out.print("\033[0m"); // повернення до стандартного кольору
                }
                System.out.println();
            }

            // підрахунок кількості від'ємних елементів, що розміщені нижче головної діагоналі
            int count = 0;
            for (int i = 1; i < N; i++) { // проходимо по рядках від другого до останнього
                for (int j = 0; j < i; j++) { // проходимо по стовпцях від першого до попереднього
                    if (A[i][j] < 0) {
                        count++;
                    }
                }
            }

            System.out.println("Кількість від'ємних елементів, що розміщені нижче головної діагоналі: " + count);
        }
    }
