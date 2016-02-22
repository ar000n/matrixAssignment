public class Matrix {
  private int row;
  private int column;
  private int [][] matrix;

  private Matrix(int row,int column){
  	this.row = row;
  	this.column = column;
  	this.matrix = new int[row][column];
  }

  public Matrix addMatrix(Matrix mat2){
  	int[] sum = new int[(row*column)];
  	int count = 0;
  	for (int i=0;i<row;i++) {
  		for (int j=0;j<column;j++,count++) {
  			sum[count] = this.matrix[i][j] + mat2.matrix[i][j];
  		}
  	}
  	Matrix res = Matrix.createMatrix(row,column,sum);
  	return res;
  }

  public int[] convertTwoDimensionToUni(int[][] matrix){
  	int row = matrix.length;
  	int column = matrix[0].length;
  	int []result = new int[row * column];
  	int count = 0;
  	for (int i=0;i<row ;i++ ) {
  		for (int j=0;j<column ;j++,count++ ) {
			result[count] = matrix[i][j];		
  		}
  	}
  	return result;
  }
  public Matrix multiplyWith(Matrix matrix2){
  	if(this.column == matrix2.row){
	  	int[][] product = new int[this.row][(matrix2.column)];
	  	for (int i = 0; i < this.row; i++) {
           for (int j = 0; j < matrix2.column; j++) {
               for (int k = 0; k < this.column; k++) {
                   product[i][j] = product[i][j] + this.matrix[i][k] * matrix2.matrix[k][j];
               }
           }
	    }
	  	int[] result =convertTwoDimensionToUni(product);
	  	Matrix res = Matrix.createMatrix(row,column,result);
	  	return res;
	}
	else{
		return null;
	}
  }

  public boolean isEqualTo(Matrix result){
    for (int i=0;i<this.row ;i++ ) {
      for(int j=0;j<this.column;j++){
        if(this.matrix[i][j] != result.matrix[i][j]){
          return false;
        }
      }
    }
    return true;
  }

  public static Matrix createMatrix(int row,int column,int [] elements){
  	Matrix matrix = new Matrix(row,column);
  	matrix.insertElements(elements);
  	return matrix;
  }

  private void insertElements(int[]elements){
  	int count = 0;
  	for (int i=0;i<row;i++ ) {
  		for (int j=0;j<column;j++,count++ ) {
  			matrix[i][j] = elements[count];
  		}
  	}
  }
}

