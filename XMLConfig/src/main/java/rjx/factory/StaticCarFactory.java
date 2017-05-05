package rjx.factory;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:StaticCarFactory
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

import rjx.model.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法：直接调用某一个类的静态方法就可以返回bean的实例
 */
public class StaticCarFactory
{
    private static Map<String, Car> cars = new HashMap<String, Car>();

    static
    {
        cars.put("audi", new Car("audi", 30000));
        cars.put("ford", new Car("ford", 40000));
    }

    //静态工厂方法。
    public static Car getCar(String name)
    {
        return cars.get(name);
    }
}