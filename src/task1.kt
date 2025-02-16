fun main() {
countUpwards(0,9)
println("-----------")
    countDownwards(10,0)



}
fun countUpwards(start: Int, end: Int){

    for (number in start..end){
       println( number)
    }
}
fun countDownwards(start: Int, end: Int) {
    var number = start
    while (number >= end) {
        println(number)
        number--
    }
}