class Matrix {
    int[][] array2d
    int width, height
    
    Matrix(int new_width, int new_height) {
        width = new_width
        height = new_height
        verifySize()
            
        for (x in 0..width-1) {
            array2d.add([1]*height as int[])
        }
    }
    
    void verifySize() {
        if (width < 1)
            throw new BadInput("Width of matrix must be greater than 1")
        if (height < 1)
            throw new BadInput("Height of matrix must be greater than 1")
    }
    
    void setElement(int x, int y, int value) {
        try {
            array2d[x][y] = value
        } catch(IndexOutOfBoundsException) {}
    }
    
    void setRow(int y, String row_str) {
        int[] row_array = row_str.split(",")*.toInteger()
        
        if (row_array.size() != width)
            return
            
        try {
            for (x in 0..width-1) {
                array2d[x][y] = value
            }
        } catch(IndexOutOfBoundsException) {}
    }
    
    void prettyPrint() {
        println "-"*width*8
        for (y in 0..height-1) {
            print "-"*width*8 + "\n|"
            for (x in 0..width-1) {
                print "\t" + array2d[x][y] + "|"
            }
        }
    }
                
}


