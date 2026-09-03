fun main() {
    println("==================================================")
    println("==================================================")
    println("==================================================")
    println("          PROPERTY MANAGEMENT SYSTEM")
    println("==================================================")
    println("==================================================")
    println("==================================================")



    println("Welcome to the Property Management System!")
    println("This system allows you to register tenants and")
    println("track their monthly rent payments.")
    println()

    // Constant
    val propertyName = "Sunrise Apartments"

    println("Property: $propertyName")
    println()

    // Ask how many tenants to register
    print("How many tenants would you like to register? ")
    val numberOfTenants = readln().toInt()

    // Collection to store tenant names
    val tenants: MutableList<String> = mutableListOf()

    println()
