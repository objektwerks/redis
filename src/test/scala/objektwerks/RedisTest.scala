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
    val key = "1"
    val value = "1"
    client.set(key, value) shouldBe true
    client.get(key) shouldBe Some(value)
    client.del(key).get should be > 0L
    client.get(key) shouldBe None
  }

  test("list") {
    val key = "2"
    val value = "2"
    client.lpush(key, value).get should be > 0L
    client.llen(key) shouldBe Some(1L)
    client.lpop(key) shouldBe Some(value)
    client.llen(key) shouldBe Some(0L)
  }

  test("map") {
    import serialization._
    import Parse.Implicits._
    
    val key = "3"
    val map = Map("1" -> 1, "2" -> 2, "3" -> 3)
    client.hmset(key, map) shouldBe true
    client.hmget[String, Int](key, "1", "2", "3") shouldBe Some(map)
    client.del(key).get should be > 0L
    client.hmget[String, Int](key, "1", "2", "3") shouldBe Some(Map())
  }
}