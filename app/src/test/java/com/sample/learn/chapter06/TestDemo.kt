package com.sample.learn.chapter06

import org.junit.Test

sealed class LicenseStatus { // 子类型闭集，ADT
    object Unqualified: LicenseStatus()
    object Learning: LicenseStatus()
    class Qualified(val id: String) : LicenseStatus()
}

class CarDriver(var status: LicenseStatus) {
    fun checkLicense() : String {
        return when(status) {
            is LicenseStatus.Unqualified -> "mei zi ge"
            is LicenseStatus.Learning -> "xue xi"
            is LicenseStatus.Qualified -> "you zi ge, id is ${(status as LicenseStatus.Qualified).id}"
        }
    }
}
class TestDemo {
    @Test
    fun test01() {
        val driver = CarDriver(LicenseStatus.Qualified("131235"))
        val result = driver.checkLicense()
        println("result=$result")
    }
}