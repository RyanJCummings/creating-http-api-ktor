package models

import kotlinx.serialization.Serializable

// Non-persistent storage to keep code simple
// database would likely provide persistent storage
val customerStorage = mutableListOf<Customer>()

@Serializable
data class Customer(val id: String, val firstName: String, val lastName: String, val email: String)