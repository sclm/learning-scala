
class Prob4Stringer(nums: List[Int]) {
    override def toString() = {
        val ordered = nums sorted Prob4Ordering
        val stringBuilder = new StringBuilder

        ordered foreach ((num: Int) => stringBuilder.append(num))

        stringBuilder.toString
    }
}
