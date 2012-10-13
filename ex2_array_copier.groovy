class ArrayCopier {
    void copy(int[] src, int[] dst) {
        int smallest_size = [dst.size(), src.size()].min()
        for (i in 0..smallest_size-1) {
            dst[i] = src[i]
        }
        
        if (dst.size() > src.size()) {
            for (j in smallest_size..dst.size()-1) {
                dst[j] = 0
            }
        }
    }
    
    void copyAndPrint(def a, def b) {
        int[] src = a
        int[] dst = b
        
        println "-"*10 + " Copy from a = " + a + " to b = " + b + " " + "-"*10
        
        copy(src, dst)
        
        println "a = " + src
        println "b = " + dst
    }
}

ArrayCopier arCop = new ArrayCopier()

arCop.copyAndPrint([1,2,3], [5,6,7])
arCop.copyAndPrint([1,2,3,4], [5,6,7])
arCop.copyAndPrint([1,2,3], [5,6,7,8])
