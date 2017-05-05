package rjx.factory;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:InstanceCarFactory
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
 * 实例工厂方法：实例工厂的方法，即现需要创建工厂本身，
 * 在调用工厂的实例方法来返回bean的实例
 */
public class InstanceCarFactory
{

    private Map<String, Car> cars = null;

    public InstanceCarFactory()
    {
        cars = new HashMap<String, Car>();
        cars.put("audi", new Car("audi", 30000));
        cars.put("ford", new Car("ford", 40000));
    }

    public Car getCar(String brand)
    {
        return cars.get(brand);
    }

}
