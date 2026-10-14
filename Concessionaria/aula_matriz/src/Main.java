import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int mat[][] = new int[2][3];


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                String sValor = JOptionPane.showInputDialog("Digite o número da posição[" + i + "][" + j + "]:");
                mat[i][j] = Integer.valueOf(sValor);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = mat[i][j] * 2;
            }

        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " - ");
            }
            System.out.println("\n-------------------");


        }

    }


