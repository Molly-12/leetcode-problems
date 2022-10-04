class Solution{
  public int reshapeMatrix(int[][] mat,int r,int c){
    if(mat.length*mat[0].length!=r*c)
      return mat;
  }
  int newMatrix[][]=new int[r][c];
  int rC=0;
  int cC=0;
  for(int i=0;i<mat.length;i++){
    for(int j=0;j<mat[0].length;j++){
      if(cC==c){
        rC++;
        cC=0;
      }
      newMatrix[rC][cC]=mat[i][j];
      cC++;
    }
  }
  return newMatrix;
}
}
