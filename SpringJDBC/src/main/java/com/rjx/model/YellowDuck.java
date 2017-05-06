package com.rjx.model;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:YelloDuck
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

import org.joda.time.LocalDate;

public class YellowDuck
{
    private static final String TAG = "YellowDuck";
    private Integer id;
    private String name;
    private Double price;
    private String birthday;//LocalDate

    public YellowDuck()
    {}

    public YellowDuck(Integer id, String name, Double price, String birthday)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.birthday = birthday;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public String getBirthday()
    {
        return birthday;
    }

    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    @Override
    public String toString()
    {
        return "YellowDuck [id=" + id + ", name=" + name + ", price=" + price + ", birthday=" + birthday + "]";
    }

} 