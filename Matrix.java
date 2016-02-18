public class Matrix {
  int row;
  int column;
  int [][] matrix;

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

