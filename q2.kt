open abstract class Person(){
    abstract val id:Int
    abstract val name: String
    abstract val address: String
    abstract val phone: Int
    abstract val profession: String
    open fun Register(uid:Int):String{
        return name
    }
    open fun Perform (duty:String):String{
        return "You have to perform $profession"
    }
    open fun Include (service: String):String{
        return "I provide $service"
    }
    open fun Like (item: String): String{
        return "I like $item"
    }
}

open abstract class Student:Person(){
    abstract val studentID:String
    abstract val major: String
    abstract val year: Int
    abstract val semester: Int
    abstract val college: String
    abstract val grade: Int
    open fun Register(course: String): String {
        return "Student with id $studentID is registered"
    }
    open fun getGrade(course: String):Int{
        return grade
    }
    open fun attend(Class: String):String{
        return "student is attending class."
    }
    open fun learn():String{
        return "Student is learning."
    }
}

open abstract class Staff:Person(){
    abstract val employeeID:String
    abstract val role: String
    abstract val department: String
    abstract val employeeSalary: Float
    abstract val experience: Int
    open fun Attend(duty: String): String {
        return "Employee is performing $duty"
    }
    open fun getPromotion():String{
        return "Employee is getting promotion."
    }
    open fun getSalary():Float{
        return employeeSalary
    }
}

open class PGStudent(
    override val id: Int,
    override val name: String,
    override val address: String,
    override val phone: Int,
    override val profession: String,
    override val studentID: String,
    override val major: String,
    override val year: Int,
    override val semester: Int,
    override val college: String,
    override val grade: Int,
    val rollNo: String,
    val specialization: String
) : Student(){
    open fun submitThesis()
    {
        println("Thesis is completed")
    }
}

open class Faculty(
    override val id: Int,
    override val name: String,
    override val address: String,
    override val phone: Int,
    override val profession: String,
    override val employeeID: String,
    override val role: String,
    override val department: String,
    override val employeeSalary: Float,
    override val experience: Int,
    val facultySpecialization : String,
    val section: String,
    val noOfStudents: Int,
    val qualification: String

):Staff()
{
    open fun Teach(course: String):String
    {
        return "Teacher is teaching $course"
    }
    open fun assess(studentGrade: Int):String
    {
        return "Assessing student"
    }
}

open class Technician(
    override val id: Int,
    override val name: String,
    override val address: String,
    override val phone: Int,
    override val profession: String,
    override val employeeID: String,
    override val role: String,
    override val department: String,
    override val employeeSalary: Float,
    override val experience: Int,
    val technicianType: String
):Staff()
{
    open fun Maintain(lab: String):String
    {
        return "Technician is teaching $lab"
    }
    open fun Install(system: String):String
    {
        return "Technician is installing $system"
    }
}

fun main()
{
    val student1 = PGStudent(
        1,
        "Jack",
        "street 9",
        737292,
        "None",
        "l092782",
        "CS",
        2023,
        7,
        "DXKJDOSJ",
        10,
        "20L191001","AI")
    student1.submitThesis()

    val faculty1 = Faculty(
        1,
        "Jack",
        "street 9",
        737292,
        "None",
        "l092782",
        "Admin",
        "CS",
        154.5F,
        4,
        "AI",
        "A",21,"MSCS")
      val fc = faculty1.Teach("AI")
    println(fc)

    val technician1 = Technician(
        1,
        "Jack",
        "street 9",
        737292,
        "None",
        "l092782",
        "Admin",
        "CS",
        154.5F,
        4,
        "Electronics")
    val tc = technician1.Install("Matlab")
    println(tc)


}