package io.github.asakaev.leftpad

import core.leftPad
import org.scalacheck.Arbitrary.arbitrary
import org.scalacheck.Prop.forAll
import org.scalacheck.{Gen, Properties}

object LeftPadSpecification extends Properties("LeftPad") {

  val smallIntGen: Gen[Int] = Gen.choose(0, 10)
  val negIntGen: Gen[Int]   = arbitrary[Int].map(-Math.abs(_))

  property("padding") = forAll(arbitrary[List[Int]], smallIntGen, arbitrary[Int]) { (xs, n, x) =>
    leftPad(xs, n, x) == xs.reverse.padTo(n, x).reverse
  }

  property("noop") = forAll(arbitrary[List[Int]], negIntGen, arbitrary[Int]) { (xs, n, x) =>
    leftPad(xs, n, x) == xs
  }

}
