package rjx.model;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:Book
// Date:2017/5/4.
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

public class Book
{
    private static final String TAG = "Book";
    private String name;
    private double price;
    private LocalDate publicationDate;//出版日期

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public LocalDate getPublicationDate()
    {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate)
    {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString()
    {
        return "People [name=" + name + ", price=" + name + ", publicationDate=" + publicationDate + "]";
    }


}







