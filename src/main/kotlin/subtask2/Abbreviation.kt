package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val isMatch = { a: Char, b: Char -> a == b || a.toUpperCase() == b }
        var ai = 0
        b.forEach() { c ->
            while(ai < a.length && !isMatch(a[ai], c)) ++ai
            if(ai == a.length || !isMatch(a[ai], c)) return "NO"
            ++ai
        }
        return "YES"
    }
}
