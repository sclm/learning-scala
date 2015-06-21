import org.specs2._

class Prob4Spec extends Specification { def is = s2"""
    Problem 4 sequences to strings should:
        order things correctly  $e1
        handle variable lengths $e2
        deal with numbers that start the same $e3
"""
    
    def e1 = {
        (new Prob4Stringer(List(1, 2, 3))).toString must_== "321"
    }

    def e2 = {
        (new Prob4Stringer(List(50, 2, 1, 9))).toString must_== "95021"
    }

    def e3 = {
        (new Prob4Stringer(List(420, 42, 423))).toString must_== "42423420"
    }
}