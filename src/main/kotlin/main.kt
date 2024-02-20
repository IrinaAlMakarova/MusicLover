fun main() {
    var purchasePrice = 15_000
    var dicount1 = 100
    var dicount2 = 0.95
    var dicount3 = 0.99
    var regularСustomer = true

    var result =
        if (purchasePrice > 1_001 && purchasePrice < 10_000) purchasePrice - dicount1 else if (purchasePrice >= 10_001) purchasePrice * dicount2 else purchasePrice
    var resultWithAdditionalDiscount =
        if (regularСustomer) (String.format("%.0f", result.toInt() * dicount3)) else String.format("%.0f", result)
    print("Стоимость покупки с учётом скидки составит: $resultWithAdditionalDiscount")
}


