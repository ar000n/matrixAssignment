import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MatrixTest {
  @Test
  public void createAMatrix() {
  	int [] ele = {1,2,3,4,5,6,7,8,9};
  	int[][]sum = {{2,4,6},{8,10,12},{14,16,18}};
    Matrix matrix1 = Matrix.createMatrix(3,3,ele);
    Matrix matrix2 = Matrix.createMatrix(3,3,ele);
    Matrix result = matrix1.addMatrix(matrix2);
    for(int i=0;i<result.row;i++){
    	for(int j=0;j<result.column;j++){
    		assertEquals(sum[i][j],result.matrix[i][j]);
    		
    	}
    }
  }
}
