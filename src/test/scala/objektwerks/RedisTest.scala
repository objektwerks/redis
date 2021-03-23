package quill

import com.typesafe.config.ConfigFactory

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class RedisTest extends AnyFunSuite with Matchers {
  val conf = ConfigFactory.load("test.conf")

  test("redis") {
    println("redis test")
  }
}