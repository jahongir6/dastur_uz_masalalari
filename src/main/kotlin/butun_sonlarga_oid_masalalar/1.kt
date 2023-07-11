package butun_sonlarga_oid_masalalar

fun main() {
    val y=ArrayList<Int>()
    val x=ArrayList<Int>()
    y.addAll(arrayOf(1,2,-3,4,5,-6,7,8,9,-10))
    x.addAll(arrayOf(12,11,6,34,27,-12,-9))
    for (i in 0 until y.size){
        if (y[i]<0){
            x.add(y[i])
        }
    }
    val min=x.min()
    val minIndex=x.indexOf(min)
    val first=x[0]
    x[0]=min
    x[minIndex]=first

    println(x)

}
