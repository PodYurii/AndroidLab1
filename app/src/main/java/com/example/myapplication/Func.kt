package com.example.myapplication

class Func {
    private var numbers : ArrayList<Int> = arrayListOf()
    private var average : Float = 0f
    private var exceptions : Int = 0
    fun randAL(){
        numbers.clear()
        average = 0f
        exceptions = 0
        for (i in 0..9) {
            numbers.add((0..20).random())
            average += numbers[i]
        }
        average /= 10
        for((_, element) in numbers.withIndex()) {
            if (element > average + 5 || element < average - 5)
                exceptions++
        }
    }
    fun getnumstr() : String{
        var str : String = ""
        for((_, element) in numbers.withIndex()) {
            str += "$element,"
        }
        str.dropLast(1)
        return str
    }
    fun getavgstr() : String{
        return average.toString()
    }
    fun getexcstr() : String{
        return exceptions.toString()
    }
}