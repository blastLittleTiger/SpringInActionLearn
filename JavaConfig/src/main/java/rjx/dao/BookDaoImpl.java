package rjx.dao;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:BookDaoImpl
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

import rjx.model.Book;

//@Repository("bookDao")
public class BookDaoImpl implements BookDao
{
    private static final String TAG = "BookDaoImpl";

    public void saveInDatabase(Book book)
    {
        /*实际之中会存储在数据库之中*/
        System.out.println("Book: " + book.getName() + "'s price is:" + book.getPrice() +
                ", and the date of publication is:" + book.getPublicationDate());
    }
} 