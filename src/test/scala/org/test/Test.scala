package org.test

import org.scalatest.{FlatSpec, Matchers}

class Test extends FlatSpec with Matchers {

  "my program" should "2 + 2 sum correctly" in {

    (2 + 2) shouldEqual 4
  }

  it should "multiply correctly" in {

    (2 * 2) shouldEqual 4
  }

  it should "divide correctly" in {

    (2 / 2) shouldEqual 5
  }
}