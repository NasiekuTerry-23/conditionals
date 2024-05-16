fun main(){

//    num()
    marks()
}


//fun num(){
//
//    var integer = 4
//
//
//    if(integer<0){
//        println("negative")
//    }
//    else if (integer>0){
//        println("positive")
//    }
//    else{
//        println("zero")
//    }
//
//}

fun marks(){

    var maths = 50
    var english = 60
    var physics = 30
    var chemistry = 25
    var kiswahili = 80
    var history = 80
    var business = 78
    var geography = 77

    var sum = maths + english + physics + chemistry + kiswahili + history + business + geography

    println(sum)

    var average = sum/8

    println(average)

    if (average <= 49){

        println("Grade D")

    }

    else if (average <= 59){

        println("Grade C")
    }

    else if (average <= 69){
        println("Grade B")
    }

    else if (average <= 79) {
        println("Grade B+")
    }

    else if(average >= 80){
        println("Grade A")
    }

    else if (average < 0 && average > 100){
        println("Invalid")
    }
}

