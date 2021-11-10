package com.example.hw_product_recycleview.data

import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.mode.mobile

class DataSource {

    fun loadMobile(): List<mobile> {
        return listOf<mobile>(
            mobile(
                "Product :Iphone 12 64GB","Price : 4500 SR",true,5, R.drawable.iphone),
            mobile("Product :samsung galaxy uitra","Price : 4500 SR",false,5,
                R.drawable.samsung_galaxy_uitra,),
            mobile("Product :Xiaomi 11T Pro","Price: 2000 SR",true,0, R.drawable.xiaomi_pro),
            mobile("Prodact :Huawei Y6p","Price : 500 SR",false, 0, R.drawable.huawei_yp),
            mobile("Prodact : Samsung Galaxy Z Flip3", "Price: 5000 SR",true, 70, R.drawable.samsung_galaxy_z_flip,),
            mobile("Product :Iphone 13","Price: 6000 SR",true,36, R.drawable.iphone13)
        )
    }
}
