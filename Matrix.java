
public  class Matrix
{
    public static boolean SelbesFormat(float[][] A,float[][] B){  
        return(A.length == B.length && A[0].length == B[0].length);
    }
    
    public static float[][] sichereAddition (float[][] A,float[][] B){
        if(SelbesFormat(A,B)){
            return Addition(A,B);
        }
        return null; 
    }
    
    private static float[][] Addition(float[][] A,float[][] B){
        int m = A.length;
        int n = A[0].length;
        float[][] C = new float[m][n];
        for(int j = 0; j < m;j++){
            for(int k = 0; k< n;k++){
                C[j][k] = A[j][k] + B[j][k];
            }
        }
        return C;
    }
    
    public static float[][] sichereMultiplikation(float[][] A,float[][] B){
        if(A[0].length == B.length){
            return Multiplikation(A,B);
        }
        return null;
    }

    private static float[][] Multiplikation(float[][] A,float[][] B){
        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;
        float [][] C = new float[m][p];
        for(int i = 0;i<m;i++){
            for(int k = 0;k<p;k++){
                for(int j = 0;j<n;j++){
                    C[i][k] = (A[i][j]*B[j][k]) + C[i][k];
                }
            }
        }
        return C;
    }
}
