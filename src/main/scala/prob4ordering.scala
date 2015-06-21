

object Prob4Ordering extends Ordering[Int] {
    def compare(l: Int, r: Int) = {
        (r.toString + l.toString).toInt - (l.toString + r.toString).toInt
    }
}
