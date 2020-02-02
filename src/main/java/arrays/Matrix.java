package arrays;


public class Matrix {

    public static void main(String[] args) {

        char [][] tree = new char[][]{  //tak sie zaczyna tablica inicalizacijna
                {'_','*','_'},
                {'*','*','*'},
                {'*','*','*','*'},
        };

        for (int i = 0; i < tree.length ; i++) { // это петля for. Подобная тем что раньше делали только написана в 1 строку. СРАВНИ!
            for (int j = 0; j < tree[i].length; j++) {
                System.out.print(tree[i][j]);  // просто ptint а потмо за скобками printline. И в конце получится елочка
            }
            System.out.println();
        }

    }

}
