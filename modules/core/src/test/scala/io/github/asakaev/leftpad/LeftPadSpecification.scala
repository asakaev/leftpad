package io.github.asakaev.leftpad

import io.github.asakaev.leftpad.core.leftPad
import org.scalacheck.Arbitrary.arbitrary
import org.scalacheck.Prop.forAll
import org.scalacheck.{Gen, Properties}

object LeftPadSpecification extends Properties("LeftPad") {

  property("padding") = forAll(arbitrary[List[Int]], Gen.choose(0, 10), arbitrary[Int]) {
    (xs, n, x) =>
      leftPad(xs, n, x) == xs.reverse.padTo(n, x).reverse
  }

  property("noop") = forAll(arbitrary[List[Int]], Gen.negNum[Int], arbitrary[Int]) { (xs, n, x) =>
    leftPad(xs, n, x) == xs
  }

}
