package OOP

interface Loanable {
    fun borrow()
    fun returnMedia()
}

class Book : Loanable {
    override fun borrow() {
        println("Borrowing a book")
    }

    override fun returnMedia() {
        println("Returning a book")
    }
}

class Magazine : Loanable {
    override fun borrow() {
        println("Borrowing a magazine")
    }

    override fun returnMedia() {
        println("Returning a magazine")
    }
}

class Movie : Loanable {
    override fun borrow() {
        println("Borrowing a movie")
    }

    override fun returnMedia() {
        println("Returning a movie")
    }
}

fun main() {
    val media = listOf(Book(), Magazine(), Movie())
    for (item in media) {
        item.borrow()
        item.returnMedia()
    }

    val animals = listOf(Dog(), Cat(), Bird())
    for (animal in animals) {
        animal.speak()
    }

}



interface Animal {
    fun speak()
}

class Dog : Animal {
    override fun speak() {
        println("Bark!")
    }
}

class Cat : Animal {
    override fun speak() {
        println("Meow!")
    }
}

class Bird : Animal {
    override fun speak() {
        println("Chirp!")
    }
}
