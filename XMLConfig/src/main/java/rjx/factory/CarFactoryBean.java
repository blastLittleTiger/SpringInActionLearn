package rjx.factory;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:CarFactoryBean
// Date:2017/5/5.
// Copyright="(c) renjiaxin.jesse 2017'
// Licence = "prayjourney 2017"
//
//                 ┏ ┓   ┏ ┓
//              ┏━━┛ ┻━━━┛ ┻━━┓
//              ┃    #
//              ┃   ┳┛  ┗*━   ┃    蹉跎错，消磨过，最是光阴化浮沫。
//              ┃      ┻      ┃
//              ┗━━┓       ┏━━┛
//                 ┃         ┗━━━━━━━━━━┓
//                 ┃  神兽保佑           ┣━┓
//                 ┃  永无BUG！         ┏┛
//                 ┗┓━┓ ┏━━━━━━━━━┳━┓━┓┛
//                  ┃━┫━┫         ┃━┫━┫
//                  ┗━┻━┛         ┗━┻━┛
//
// ---------------------------------------------------------------

import org.springframework.beans.factory.FactoryBean;
import rjx.model.Car;

//自定义的 FactoryBean 需要spring 提供的 FactoryBean 接口
public class CarFactoryBean implements FactoryBean<Car>
{
    private String brand;

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    //返回Bean的对象
    public Car getObject() throws Exception
    {
        return new Car(brand, 500000);
    }

    //返回bean的类型
    public Class<?> getObjectType()
    {
        return Car.class;
    }

    public boolean isSingleton()
    {
        return true;
    }
}