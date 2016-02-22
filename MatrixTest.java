import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MatrixTest {
  @Test
  public void matrixAddition() {
  	int [] ele = {1,2,3,4,5,6,7,8,9};
  	int[]elements = {2,4,6,8,10,12,14,16,18};
    Matrix sum = Matrix.createMatrix(3,3,elements);
    Matrix matrix1 = Matrix.createMatrix(3,3,ele);
    Matrix matrix2 = Matrix.createMatrix(3,3,ele);
    Matrix result = matrix1.addMatrix(matrix2);
  }

  @Test
  public void matrixMultiplication(){
  	int [] ele1 = {2,3,4,5};
  	int [] ele2 = {3,1,2,6};
    int [] elements = {12,20,22,34};
  	Matrix matrix1 = Matrix.createMatrix(2,2,ele1);
    Matrix matrix2 = Matrix.createMatrix(2,2,ele2);
    Matrix result = matrix1.multiplyWith(matrix2);
    Matrix product = Matrix.createMatrix(2,2,elements);
    assertTrue(product.isEqualTo(result));
  }

  @Test
  public void matrixMultiplication_if_couldnot_do(){
    int [] ele1 = {2,3,4,5};
    int [] ele2 = {3,1,2,6,3,4};
    // int [] elements = {12,20,22,34};
    Matrix matrix1 = Matrix.createMatrix(2,2,ele1);
    Matrix matrix2 = Matrix.createMatrix(3,2,ele2);
    Matrix result = matrix1.multiplyWith(matrix2);
    // Matrix product = Matrix.createMatrix(2,2,elements);
    assertEquals(null,result);
  }
}
