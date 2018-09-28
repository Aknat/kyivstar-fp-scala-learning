package home.response_left

object App {

  val responseLeft = "sms,10,5;ussd,30,15;mms,20,3;"
  val responseLeftSmall = "sms,10,5;"

  def main(args: Array[String]): Unit = {

    val response = Response("sms", 10, 15)
    println(response)

  }
}
