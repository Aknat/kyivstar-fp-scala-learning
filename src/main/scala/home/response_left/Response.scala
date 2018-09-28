package home.response_left

case class Response(bearerType: String, free: Int, paid: Int) {

  override def toString: String = s"$bearerType,$free,$paid;"
}

object Response {

//  def parse(string: String)
  
}
