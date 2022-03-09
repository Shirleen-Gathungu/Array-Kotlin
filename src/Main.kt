
fun main(){
numbers()
var display=names(arrayOf("Julie","Rhode","Grace"))
    println(display.contentToString())
    uppercaseCities(arrayOf("harare","dodoma","mumbai","jakarta"))
strings(arrayOf("Jackie","Doris","Jilian","Sora"))
}

fun strings(names:Array<String>){
  var n=names
    println(n.contentToString())
}

fun uppercaseCities(cities:Array<String>) {
    for(c in cities)
     println(c.capitalize())
   }



fun numbers(){
    var nums=arrayOf( 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum =(nums[2]+nums[5])
    println(sum)

    var index=nums.indexOf(158)
    println(index)

     var sortedNums = nums.sortedArray()
    println(sortedNums.contentToString())

}
fun names(names:Array<String>): Array<String> {
    var n=names
    return n
}


