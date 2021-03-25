package objektwerks

import com.redis._
import com.typesafe.config.ConfigFactory

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class RedisTest extends AnyFunSuite with Matchers {
  val conf = ConfigFactory.load("test.conf")
  val host = conf.getString("host")
  val port = conf.getInt("port")

  println(s"Connecting to $host:$port ...")
  val client = new RedisClient(host, port)
  
  test("set > get > del") {
    val key = "key"
    val value = "value"
    client.set(key, value) shouldBe true
    client.get(key) shouldBe Some(value)
    client.del(key).get should be > 0L
  }
}