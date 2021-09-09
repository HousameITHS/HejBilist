open class Car() :Vehicle() {
    var carMiles = 100
    override  fun drive(){
        if (driver == null){
            println("Car can´t be driven - there is no driver")
        }
        else{
            if(driver!!.age >= 18){
                carMiles -= 10
                println("Car drove 10 miles - $carMiles miles to go")
            }
            else{
                println("Car didn´t drive - ${driver!!.name} is ${driver!!.age}, but\n" +
                        " must be 18 or older to drive\n")
            }
        }
    }
}