package objektwerks

import com.redis._
import com.typesafe.config.ConfigFactory

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class RedisTest extends AnyFunSuite with Matchers {
  val conf = ConfigFactory.load("test.conf")
  val host = conf.getString("host")
  val port = conf.getInt("port")
  val client = new RedisClient(host, port)
  
  test("redis") {
    
  }
}