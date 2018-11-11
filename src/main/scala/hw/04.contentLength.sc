//функция СПА3 валидации входящего запроса от провайдера
//функция которая принимает строку «content» и параметр максимальной его длины.
// результатом работы функции будет булево значение - прошел ли контент валидацию

//string, max length 160 symbols



def lengthValidation(content: String, len: Int) = {
  content.length <= len
}

lengthValidation("qqqqq",160)

//contentLengthValidation("qqqqqfibfebruerihrenreniroiejroighrubenoirhgurtbunvenrigisrbsn.sni.rngrktbnirnrninirngrkntkbnseinirtnrntbinsirninbkksnrinvlie.snri.ni.snr.ser.ln.lnblrhbvjfbvbsfkvbkdfbvn",160)



