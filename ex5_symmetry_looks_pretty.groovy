MatrixChecker mc = new MatrixChecker()
int[] a = [1,2,3]
int[] b = [1,2,1]
println "is "+a+" sym? " + mc.isSymmetrical(a)
println "is "+b+" sym? " + mc.isSymmetrical(b)

a = [1,2,2,3]
b = [1,2,2,1]
println "is "+a+" sym? " + mc.isSymmetrical(a)
println "is "+b+" sym? " + mc.isSymmetrical(b)

int[][] m = [[1,1,1],[2,1,1],[1,1,2]]
println "is "+m+" sym? " + mc.isSymmetrical(m)

m = [[1,1,1],[1,1,1],[1,1,2]]
println "is "+m+" sym? " + mc.isSymmetrical(m)