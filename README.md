# Number Base Converter

A Kotlin library for converting numbers between different numeral bases. This library is a useful tool for working with numeral systems like binary, decimal, and hexadecimal.

## Features

- Convert numbers between different numeral bases.
- Supports bases from 2 (binary) to 36 (alphanumeric).
- Provides functions for common conversions:
  - Decimal to Binary
  - Binary to Decimal
  - Decimal to Hexadecimal
  - Hexadecimal to Decimal

## Getting Started

### Installation
You can include this library in your Kotlin project by cloning the `ConverterKotlin.kt` file from this repository


## Usage
To convert numbers between different bases, you can use the `ConverterKotlin` object provided by the library. Here's an example of how to use it:

```java
val decimalNumber = "42"
val binaryNumber = ConverterKotlin.convert(decimalNumber, 10, 2)
println("Binary: $binaryNumber")
```

This will convert the decimal number "42" to binary.

#### Common Conversions
The library provides convenience methods for common conversions:


- `fromDecimalToBin(decimal: Int)`: Converts a decimal number to binary.
- `fromBinToDecimal(bin: String)`: Converts a binary number to decimal.
- `fromDecimalToHex(decimal: Int)`: Converts a decimal number to hexadecimal.
- `fromHexToDecimal(hex: String)`: Converts a hexadecimal number to decimal.

## Example
Here's an example of how to use the library to convert a number from decimal to binary and back to decimal:
```java
val decimalNumber = 42
val binaryNumber = Converter.fromDecimalToBin(decimalNumber)
println("Binary: $binaryNumber")

val decimalNumberAgain = Converter.fromBinToDecimal(binaryNumber)
println("Decimal: $decimalNumberAgain")
```

## License

This project is licensed under the [MIT License](LICENSE).

---

## Developer
This Project was Developed by [c4vxl](https://c4vxl.de)
