class MatrixWithOnelineInput extends Matrix {

    MatrixWithOnelineInput(int width, int height) { super(width, height) }

    public void setMatrix(String str) {
        int[][] new_array2d = str.split(";").collect{ strToArray(it) }
        
        if (new_array2d.collect{ it.size() } != [width]*height)
            return
        
        array2d = new_array2d
        lengths2d = array2d.collect{ it.collect{ (it as String).length() } }
    }
}

MatrixWithOnelineInput m = new MatrixWithOnelineInput(3,4)

m.setMatrix("2,1,1;33,777777,8888888;444,1,1;5555,1,-10")
m.prettyPrint()