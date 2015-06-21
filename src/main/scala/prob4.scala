object Prob4 {
    def main(args: Array[String]) = {
        val ints = args.map((s: String) => s.toInt).toList
        val stringer = new Prob4Stringer(ints)
        println(stringer)
    }
}
