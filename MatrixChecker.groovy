public class MatrixChecker {
    public boolean isSymmetrical(int[] array) {
        int max_index = array.size()-1
        int check_to = array.size()/2-1
        return array[0..check_to] == array[max_index..max_index-check_to] as int[]
    }
    
    public boolean isSymmetrical(int[][] matrix) {
        int size = matrix.size()
        if (matrix.collect{ it.size() } != [size]*size)
            return false
            
        if (size == 1)
            return true
        
        for (i in 0..size-2) {
            if (!isSymmetrical( matrix[i][1+i..size-1] + matrix.collect{ it[i] }[1+i..size-1] as int[]))
                return false
        }
        return true
    }
}