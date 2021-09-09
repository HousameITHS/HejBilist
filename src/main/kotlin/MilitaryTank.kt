class MilitaryTank(driver:Driver):Vehicle(driver) {
    var tankMiles = 2000
    override  fun drive(){
        if (driver == null){
            println("MilitaryTank can´t be driven - there is no driver")
        }
        else{
            if(driver!!.age >= 25){
                tankMiles -= 5
                println("MilitaryTank drove 5 miles - $tankMiles miles to go")
            }
            else{
                println("MilitaryTank didn´t drive - ${driver!!.name} is ${driver!!.age}, but\n" +
                        " must be 25 or older to drive\n")
            }
        }
    }
}