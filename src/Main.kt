fun main() {
    println("==================================================")
    println("          PROPERTY MANAGEMENT SYSTEM")
    println("==================================================")
    println()
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

    // Loop through each tenant
    for (i in 1..numberOfTenants) {

        println("--------------------------------------------------")
        println("TENANT $i")
        println("--------------------------------------------------")

        // Get tenant name
        print("Enter tenant name: ")
        val tenantName = readln()

        // Get tenant age
        print("Enter tenant age: ")
        val tenantAge = readln().toInt()

        // Get monthly rent
        print("Enter monthly rent (KSh): ")
        val monthlyRent = readln().toInt()

        // Get amount paid
        print("Enter amount paid (KSh): ")
        val amountPaid = readln().toInt()

        // Store tenant name in the collection
        tenants.add(tenantName)

        // Calculate outstanding balance
        val balance = monthlyRent - amountPaid

        // Check if tenant has paid in full
        val isFullyPaid: Boolean = balance <= 0

        println()
        println("Processing payment information...")
        println()

        println("Tenant Name: $tenantName")
        println("Tenant Age: $tenantAge")
        println("Monthly Rent: KSh $monthlyRent")
        println("Amount Paid: KSh $amountPaid")
        println("Outstanding Balance: KSh $balance")

        // if statement
        if (isFullyPaid) {
            println("Payment Status: Fully Paid")
        } else {
            println("Payment Status: Outstanding")
        }

        // when statement
        val paymentCategory = when {
            amountPaid == 0 -> "Not Paid"
            amountPaid >= monthlyRent -> "Fully Paid"
            amountPaid < monthlyRent -> "Partially Paid"
            else -> "Unknown"
        }

        println("Payment Category: $paymentCategory")
        println()
    }

    // Display all registered tenants
    println("==================================================")
    println("              REGISTERED TENANTS")
    println("==================================================")

    // Loop through the collection
    for (tenant in tenants) {
        println("Tenant: $tenant")
    }

    println()
    println("Total tenants registered: ${tenants.size}")
    println()
    println("==================================================")
    println("       PROPERTY MANAGEMENT SYSTEM CLOSED")
    println("==================================================")
}
