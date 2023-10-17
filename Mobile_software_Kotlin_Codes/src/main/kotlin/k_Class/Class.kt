package k_Class

class SmartDevice {
    // Class's Property (클래스의 속성)
    val name = "Android TV"
    val category = "Entertainment"
    var status = "online" // 변경 가능 변수

    // Class's Methods
    fun turnOn() {
        println("Smart device is turned on.")
    }
    fun turnOff() { // member function == method
        println("Smart device is turned off.")
    }
}

fun main() {
    // constructor, class instance = object
    val smartTV: SmartDevice = SmartDevice()

    // 클래스의 메소드 호출
    smartTV.turnOn()
    smartTV.turnOff()

    // 클래스의 속성 호출
    println("Device name is = ${smartTV.name}")
}