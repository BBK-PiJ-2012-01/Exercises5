class Matrix {
    int[][] array2d
    int[][] lengths2d
    int width, height
    
    Matrix(int new_width, int new_height) {
        width = new_width
        height = new_height
        verifySize()
        
        array2d = [[1]*height]*width
        lengths2d = [[1]*height]*width
    }
    
    private void verifySize() {
        if (width < 1)
            throw new BadInput("Width of matrix must be greater than 1")
        if (height < 1)
            throw new BadInput("Height of matrix must be greater than 1")
    }
    
    void setElement(int x, int y, int value) {
        try {
            array2d[x][y] = value
            lengths2d[x][y] = (value as String).length()
        } catch(IndexOutOfBoundsException) {}
    }
    
    void setRow(int y, String row_str) {
        int[] row_array = strToArray(row_str)
        
        if (row_array.size() != width)
            return
            
        for (x in 0..width-1) {
            setElement(x, y, row_array[x])
        }
    }
    
    private int[] strToArray(String str) {
        return str.split(",")*.toInteger()
    }
    
    void setColumn(int x, String column_str) {
        int[] column_array = strToArray(column_str)
        
        if (column_array.size() != height)
            return
            
        for (y in 0..height-1) {
            setElement(x, y, column_array[y])
        }
    }
    
    void toString() {
        
    
    void prettyPrint() {
        int cell_width = lengths2d.flatten().max()
        int left_spaces, right_spaces
        String row_line = ("+" + "-"*(cell_width))*width + "+"
        
        for (y in 0..height-1) {
            //print "-"*(1+width*(cell_width+1)) + "\n|" // The plus-one is for the "|"
            print row_line + "\n|"
            for (x in 0..width-1) {
                 right_spaces = ( cell_width - lengths2d[x][y] ) / 2
                left_spaces = cell_width - lengths2d[x][y] - right_spaces
                print " "*left_spaces + array2d[x][y] + " "*right_spaces + "|"
            }
            print "\n"
        }
        println row_line
    }
                
}

