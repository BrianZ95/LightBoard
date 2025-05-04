public class LightBoard{
    private boolean[][] lights;
    public LightBoard(int numRows, int numCols){
        lights = new boolean[numRows][numCols];
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numCols; j++){
                int probability = (int) (Math.random() * 10 + 1);
                if (probability <= 4) lights[i][j] = true;
            }
        }
    }

    public  boolean[][] getLights(){
        return lights;
    }
    public boolean evualuate(int row, int col){
        int count = 0;
        if (lights[row][col] == false){
            for (int i = 0; i < lights.length; i++){
                if (lights[i][col] == true) count++;
            }
            if (count % 3 == 0) return true;
            else return lights[row][col];
        }
        else{
            for (int i = 0; i < lights.length; i++){
                if (lights[i][col] == true) count++;
            }
            if (count % 2 == 0) return false;
            else return lights[row][col];

        }
    }
}