public class Main{
    public static void main(String[] args){
        LightBoard test = new LightBoard(5, 6);
        boolean[][] array = test.getLights();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        }
    }