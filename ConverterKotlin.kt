/*
* This Class converts numbers between different numeral bases.
*
* @author c4vxl
* @version 1.0
*
* */

object ConverterKotlin {
    val DIGITS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    fun convert(number: String, inputBase: Int, outputBase: Int): String {
        if (inputBase < 2 || outputBase < 2) {
            return ""
        }

        val decimalNumber = number.fold(0) { acc, char ->
            val digit = DIGITS.indexOf(char)
            if (digit == -1 || digit >= inputBase) return "0"
            acc * inputBase + digit
        }

        if (decimalNumber == 0) {
            return "0"
        }

        var result = ""
        var num = decimalNumber

        while (num > 0) {
            val remainder = num % outputBase
            result = DIGITS[remainder] + result
            num /= outputBase
        }

        return result
    }

    fun fromDecimalToBin(decimal: Int): String {
        return this.convert(decimal.toString(), 10, 2)
    }

    fun fromBinToDecimal(bin: String): Int {
        return this.convert(bin, 2, 10).toIntOrNull() ?: 0
    }

    fun fromDecimalToHex(decimal: Int): String {
        return convert(decimal.toString(), 10, 16)
    }

    fun fromHexToDecimal(hex: String): Int {
        return convert(hex, 16, 10).toIntOrNull() ?: 0
    }
}