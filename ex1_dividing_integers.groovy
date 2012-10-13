class Calculator {
    void add(int a, int b) {
        println a + " + " + b + " = " + ((a + b) as double)
    }
    
    void subtract(int a, int b) {
        println a + " - " + b + " = " + ((a - b) as double)
    }
    
    void multiply(int a, int b) {
        println a + " x " + b + " = " + ((a * b) as double)
    }
    
    void divide(int a, int b) {
        println a + " / " + b + " = " + ((a as double) / (b as double))
    }
    
    void modulus(int a, int b) {
        println a + " % " + b + " = " + ((a % b) as double)
    }
}


Calculator c = new Calculator()

c.add(3,4)
c.subtract(3,4)
c.multiply(3,4)
c.divide(3,4)
c.modulus(3,4)