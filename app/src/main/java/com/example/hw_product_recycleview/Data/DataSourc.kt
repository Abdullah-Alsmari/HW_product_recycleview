package com.example.product_recycleview.data

import com.example.hw_product_recycleview.R
import com.example.product.Model.Product




class Datasource {
    fun loadProduct(): List<Product>{
        return listOf(
            Product(R.drawable.iphone," Iphone 12 64GB","4500 SR",true,5),
            Product(R.drawable.samsung_galaxy_z_flip,"Samsung Galaxy S21 Ultra","4500 SR",false,5),
            Product(R.drawable.xiaomi_pro," Xiaomi 11T Pro","2000 SR",true,0),
            Product(R.drawable.huawei_yp,"Huawei Y6p","500",false,0),
            Product(R.drawable.samsung_galaxy_z_flip,"Samsung Galaxy Z Flip3","5000 SR",true,70),
            Product(R.drawable.iphone13,"Iphone 13","6000 SR",true,36),


            )

    }

}