package main

import "fmt"

// Main function
func main() {
    fmt.Println("Hello, World!")
}

// Add is our function that sums two integers
func Add(x, y int) (res int) {
    return x + y
}

// Subtract subtracts two integers
func Subtract(x, y int) (res int) {
    return x - y
}
