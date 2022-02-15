package ua.levelup;

public class Matrix {
    public static final String MATRIX_1="Matrix1.txt";
    public static final String MATRIX_2="Matrix2.txt";
    public static void main (String[] args){
        Reader reader=new Reader();
        byte []matrix1=reader.readFromFile(MATRIX_1);
        byte []matrix2=reader.readFromFile(MATRIX_2);
    }
    public static int[][] getMatrixFromString(String matrixAsString) {
        String[] lines=matrixAsString.split("/n");
        int[][]matrix=new int[lines.length][];
        for(int i=0; i< lines.length; i++){
            String[] columns=lines[i].split(",");
            for(int j=0; j<columns.length;j++){
                int n=Integer.parseInt(columns[j].trim());
                matrix[i][j]=n;
            }
        }
        return matrix;
    }
}
